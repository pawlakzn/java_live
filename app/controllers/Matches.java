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

     Form<Match> matchForm = form(Match.class).fill( match );
     Form<Statistic> statisticForm = form(Statistic.class).fill(
                Statistic.find.byId(match.id)
        );

        return ok(
                views.html.matches.editForm.render(id, matchForm, statisticForm)
        );
    }

    public static Result update(Long id) {
        Form<Match> matchForm = form(Match.class).bindFromRequest();
        Form<Statistic> statisticForm = form(Statistic.class).bindFromRequest();

        if(matchForm.hasErrors() ) {
            flash("wrong", "Mecz nie został zaktualizowany!");
            return badRequest(views.html.matches.editForm.render(id, matchForm, statisticForm));
        }

        if(matchForm.get().team1.id == null) {
            flash("wrong", "Musisz wybrać gospodarza!");
            return badRequest(views.html.matches.editForm.render(id, matchForm, statisticForm));
        }
        if(matchForm.get().team2.id == null) {
            flash("wrong", "Musisz wybrać zespół gości!");
            return badRequest(views.html.matches.editForm.render(id, matchForm, statisticForm));
        }
        if(matchForm.get().match_date == null) {
            flash("wrong", "Musisz ustawić datę!");
            return badRequest(views.html.matches.editForm.render(id, matchForm, statisticForm));
        }

        Match match = Match.find.byId(id);
        Statistic st = statisticForm.get();
        st.update(st.id);
        Match m = matchForm.get();
        m.score1 = st.goals1; m.score2 = st.goals2; m.score1_half = st.goals1_half; m.score2_half = st.goals2_half;
        m.statistics = st;
        m.update(id);

        Team team1 = Team.find.byId(matchForm.get().team1.id);
        Team team2 = Team.find.byId(matchForm.get().team2.id);

        flash("success", "Mecz " + team1.name + " - " + team2.name + " został zaktualizowany!");
        return redirect(routes.Matches.edit(id));
    }


    public static Result create() {
        Statistic st = new Statistic();
        Form<Statistic> statisticForm = form(Statistic.class).fill(st);
        //statisticForm.get().save();
        Form<Match> matchForm = form(Match.class).fill(new Match(st));
        return ok(
                views.html.matches.createForm.render(matchForm, statisticForm)
        );
    }

    public static Result save() {
        Form<Match> matchForm = form(Match.class).bindFromRequest();
        Form<Statistic> statisticForm = form(Statistic.class).bindFromRequest();
        if(matchForm.hasErrors()) {
            return badRequest(views.html.matches.createForm.render(matchForm, statisticForm));
        }
        if(matchForm.get().game.id == null) {
            flash("wrong", "Musisz wybrać zespół!");
            return badRequest(views.html.matches.createForm.render(matchForm, statisticForm));
        }
        if(matchForm.get().team1.id == null) {
            flash("wrong", "Musisz wybrać gospodarza!");
            return badRequest(views.html.matches.createForm.render(matchForm, statisticForm));
        }
        if(matchForm.get().team2.id == null) {
            flash("wrong", "Musisz wybrać zespół gości!");
            return badRequest(views.html.matches.createForm.render(matchForm, statisticForm));
        }
        if(matchForm.get().match_date == null) {
            flash("wrong", "Musisz ustawić datę!");
            return badRequest(views.html.matches.createForm.render(matchForm, statisticForm));
        }

        Statistic st = statisticForm.get();
        st.save();
        Match m = matchForm.get();
        m.statistics = st;
        m.score1 = st.goals1; m.score2 = st.goals2; m.score1_half = st.goals1_half; m.score2_half = st.goals2_half;
        m.save();
        Team team1 = Team.find.byId(matchForm.get().team1.id);
        Team team2 = Team.find.byId(matchForm.get().team2.id);
        flash("success", "Mecz " + team1.name + " - " + team2.name + " został dodany! "+st.id+" " + st.goals1);
        return GO_HOME;
    }

    public static Result delete(Long id) {
        for(Gallery a: Gallery.find.where().findList()) {
            if (a.match.id == id) {
                a.delete();
            }
        }

        for(Video b: Video.find.where().findList()) {
            if (b.vmatch.id == id) {
                b.delete();
            }
        }

        Match.find.ref(id).delete();
        flash("success", "Mecz został usunięty");
        return GO_HOME;
    }

    public static Result live(Long id) {
        Match match = Match.find.byId(id);
        List<Video> videos = Video.find.where()
                                                .eq("vmatch_id", id)
                                                .findList();
        List<Lineup> lineup1 = Lineup.find.where()
                .eq("match_id", id)
                .eq("team_id", match.team1.id)
                .findList();

        List<Lineup> lineup2 = Lineup.find.where()
                .eq("match_id", id)
                .eq("team_id", match.team2.id)
                .findList();

        Form<Match> matchForm = form(Match.class).fill(
                match
        );
        return ok(
                views.html.matches.live.render(matchForm, videos, lineup1, lineup2)
        );
    }

}
            
