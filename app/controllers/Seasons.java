package controllers;

import play.mvc.*;
import play.data.*;
import play.api.mvc.Call;
import static play.data.Form.*;

import views.html.referees.*;
import views.html.*;


import models.*;

import java.text.SimpleDateFormat;

@Security.Authenticated(Secured.class)
public class Seasons extends Controller {

    public static Result GO_HOME = redirect(
            routes.Seasons.list(0, "year_start", "asc", "")
    );

    public static Result index() {
        return GO_HOME;
    }

    public static Result list(int page, String sortBy, String order, String filter) {
        return ok(
                views.html.seasons.list.render(
                        Season.page(page, 10, sortBy, order, filter),
                        sortBy, order, filter
                )
        );
    }

    public static Result edit(Long id) {
        Form<Season> seasonForm = form(Season.class).fill(
                Season.find.byId(id)
        );
        return ok(
                views.html.seasons.editForm.render(id, seasonForm)
        );
    }

    public static Result update(Long id) {
        Form<Season> seasonForm = form(Season.class).bindFromRequest();
        if(seasonForm.hasErrors()) {
            return badRequest(views.html.seasons.editForm.render(id, seasonForm));
        }
        seasonForm.get().update(id);
        flash("success", "Sezon " + seasonForm.get().year_start + "/" + seasonForm.get().year_end + " został zaktualizowany");
        return GO_HOME;
    }


    public static Result create() {
        Form<Season> seasonForm = form(Season.class);
        return ok(
                views.html.seasons.createForm.render(seasonForm)
        );
    }

    public static Result save() {
        Form<Season> seasonForm = form(Season.class).bindFromRequest();
        if(seasonForm.hasErrors()) {
            return badRequest(views.html.seasons.createForm.render(seasonForm));
        }
        seasonForm.get().save();

        String ys = new SimpleDateFormat("yyyy").format(seasonForm.get().year_start);
        String ye = new SimpleDateFormat("yyyy").format(seasonForm.get().year_end);
        String y = ys+"/"+ye;

        flash("success", "Sezon " + y + " został dodany!");
        return GO_HOME;
    }

    public static Result delete(Long id) {
        for(Game c: Game.find.where().findList()) {
            if (c.season.id == id) {
                for(Match a: Match.find.where().findList()) {
                    if (a.game.id == c.id) {
                        flash("wrong", "Sezon nie może zostać usunięty z powodu istniejących meczów!");
                        return redirect(routes.Seasons.edit(id));
                    }
                }
                c.delete();
            }
        }

        Season.find.ref(id).delete();
        flash("success", "Sezon został usunięty");
        return GO_HOME;
    }


}
            
