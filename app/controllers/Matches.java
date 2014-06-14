package controllers;

import play.mvc.*;
import play.data.*;
import play.api.mvc.Call;
import static play.data.Form.*;

import views.html.referees.*;
import views.html.*;


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
        return ok(
                views.html.matches.list.render(
                        Match.page(page, 10, sortBy, order, filter),
                        sortBy, order, filter
                )
        );
    }

    public static Result edit(Long id) {
        Form<Match> matchForm = form(Match.class).fill(
                Match.find.byId(id)
        );
        return ok(
                views.html.matches.editForm.render(id, matchForm)
        );
    }

    public static Result update(Long id) {
        Form<Match> matchForm = form(Match.class).bindFromRequest();
        if(matchForm.hasErrors()) {
            return badRequest(views.html.matches.editForm.render(id, matchForm));
        }
        matchForm.get().update(id);
        Team team1 = Team.find.byId(matchForm.get().team1.id);
        Team team2 = Team.find.byId(matchForm.get().team2.id);
        flash("success", "Mecz " + team1.name + " - " + team2.name + " został zaktualizowany!");
        return GO_HOME;
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


}
            
