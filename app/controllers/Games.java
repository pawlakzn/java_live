package controllers;

import play.mvc.*;
import play.data.*;
import static play.data.Form.*;

import models.*;

public class Games extends Controller {

    public static Result GO_HOME = redirect(
            routes.Games.list(0, "name", "asc", "")
    );

    public static Result index() {
        return GO_HOME;
    }

    public static Result list(int page, String sortBy, String order, String filter) {
        return ok(
                views.html.games.list.render(
                        Game.page(page, 10, sortBy, order, filter),
                        sortBy, order, filter
                )
        );
    }

    public static Result edit(Long id) {
        Form<Game> gameForm = form(Game.class).fill(
                Game.find.byId(id)
        );
        return ok(
                views.html.games.editForm.render(id, gameForm)
        );
    }

    public static Result update(Long id) {
        Form<Game> gameForm = form(Game.class).bindFromRequest();
        if(gameForm.hasErrors()) {
            return badRequest(views.html.games.editForm.render(id, gameForm));
        }
        gameForm.get().update(id);
        flash("success", "Rozgrywki " + gameForm.get().name + " zostały dodane");
        return GO_HOME;
    }


    public static Result create() {
        Form<Game> gameForm = form(Game.class);
        return ok(
                views.html.games.createForm.render(gameForm)
        );
    }

    public static Result save() {
        Form<Game> gameForm = form(Game.class).bindFromRequest();
        if(gameForm.hasErrors()) {
            return badRequest(views.html.games.createForm.render(gameForm));
        }
        gameForm.get().save();
        flash("success", "Rozgrywki " + gameForm.get().name + " zostały dodane!");
        return GO_HOME;
    }

    public static Result delete(Long id) {
        Game.find.ref(id).delete();
        flash("success", "Rozgrywki zostały usunięte");
        return GO_HOME;
    }


}
            
