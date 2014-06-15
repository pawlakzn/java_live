package controllers;

import play.mvc.*;
import play.data.*;
import play.api.mvc.Call;
import static play.data.Form.*;
import play.api.data.Forms.*;

import views.html.referees.*;
import views.html.*;

import java.util.List;
import models.*;

import java.text.SimpleDateFormat;

public class Matches extends Controller {

    public static Result GO_HOME = redirect(
            routes.Matches.list(0, "team1", "asc", "")
    );

    public static Result index() {
        return GO_HOME;
    }

    public static Result list(int page, String sortBy, String order, String filter) {
        User user = User.findByLogin(session("login"));
        if (user == null){
            user = new User();
        }
        return ok(
                views.html.matches.list.render(
                        Match.page(page, 10, sortBy, order, filter),
                        sortBy, order, filter, user
                )
        );
    }

    public static Result edit(Long id) {
        Match match = Match.find.byId(id);
        //List<Video> videos = Video.find.where()
        //                                        .eq("match_id", id)
        //                                        .findList();

        //Form<List<Video>> videosForm = form(List.Video.class).fill(videos);
      //Form<List> videosForm = Form( mapping( "v" -> list(videos)  ));
     Form<Match> matchForm = form(Match.class).fill( match );


        Form<Statistic> statisticForm = form(Statistic.class).fill(
                Statistic.find.byId(match.statistics.id)
        );

        return ok(
                views.html.matches.editForm.render(id, matchForm, statisticForm)
        );
    }

    public static Result update(Long id) {
        Form<Match> matchForm = form(Match.class).bindFromRequest();
        Form<Statistic> statisticForm = form(Statistic.class).bindFromRequest();
        //Form<List> videosForm = form(List.class).bindFromRequest();

        if(matchForm.hasErrors() || statisticForm.hasErrors()) {
            return badRequest(views.html.matches.editForm.render(id, matchForm, statisticForm));
        }

        matchForm.get().update(id);
        Match match = Match.find.byId(id);
        statisticForm.get().update(match.statistics.id);

        Team team1 = Team.find.byId(matchForm.get().team1.id);
        Team team2 = Team.find.byId(matchForm.get().team2.id);
        flash("success", "Mecz " + team1.name + " - " + team2.name + " został zaktualizowany!");
        return redirect(routes.Matches.edit(id));
    }


    public static Result create() {
        Form<Match> matchForm = form(Match.class).fill(new Match());
        return ok(
                views.html.matches.createForm.render(matchForm)
        );
    }

    public static Result save() {
        Form<Match> matchForm = form(Match.class).bindFromRequest();
        if(matchForm.hasErrors()) {
            return badRequest(views.html.matches.createForm.render(matchForm));
        }
        if(matchForm.get().game.id == null) {
            return badRequest(views.html.matches.createForm.render(matchForm));
        }
        if(matchForm.get().team1.id == null) {
            return badRequest(views.html.matches.createForm.render(matchForm));
        }
        if(matchForm.get().team2.id == null) {
            return badRequest(views.html.matches.createForm.render(matchForm));
        }
        matchForm.get().save();
        Team team1 = Team.find.byId(matchForm.get().team1.id);
        Team team2 = Team.find.byId(matchForm.get().team2.id);
        flash("success", "Mecz " + team1.name + " - " + team2.name + " został dodany!");
        return GO_HOME;
    }

    public static Result delete(Long id) {
        Match.find.ref(id).delete();
        flash("success", "Mecz został usunięty");
        return GO_HOME;
    }

    public static Result live(Long id) {
        Match match = Match.find.byId(id);
        List<Video> videos = Video.find.where()
                                                .eq("vmatch_id", id)
                                                .findList();
        Form<Match> matchForm = form(Match.class).fill(
                match
        );
        return ok(
                views.html.matches.live.render(matchForm, videos)
        );
    }

}
            
