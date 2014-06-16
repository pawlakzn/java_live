package controllers;

import play.mvc.*;
import play.data.*;
import play.api.mvc.Call;
import static play.data.Form.*;
import play.mvc.Http.*;
import play.mvc.Http.MultipartFormData.*;

import views.html.players.*;
import views.html.*;


import models.*;

import java.io.File;

@Security.Authenticated(Secured.class)
public class Players extends Controller {

    public static Result GO_HOME = redirect(
            routes.Players.list(0, "lastname", "asc", "")
    );

    public static Result index() {
        return GO_HOME;
    }

    public static Result list(int page, String sortBy, String order, String filter) {
        return ok(
                views.html.players.list.render(
                        Player.page(page, 10, sortBy, order, filter),
                        sortBy, order, filter
                )
        );
    }

    public static Result edit(Long id) {
        Player example =  Player.find.byId(id);
        Form<Player> playerForm = form(Player.class).fill(
                example
        );
        return ok(
                views.html.players.editForm.render(id, example.photo, playerForm)
        );
    }

    public static Result update(Long id) {
        Player example =  Player.find.byId(id);
        Form<Player> playerForm = form(Player.class).bindFromRequest();
        if(playerForm.hasErrors()) {
            return badRequest(views.html.players.editForm.render(id, example.photo, playerForm));
        }
        playerForm.get().update(id);
        flash("success", "Piłkarz " + playerForm.get().lastname + " został zaktualizowany");
        return GO_HOME;
    }


    public static Result create() {
        Form<Player> playerForm = form(Player.class);
        return ok(
                views.html.players.createForm.render(playerForm)
        );
    }

    public static Result save() {
        Form<Player> playerForm = form(Player.class).bindFromRequest();
        if(playerForm.hasErrors()) {
            return badRequest(views.html.players.createForm.render(playerForm));
        }
        playerForm.get().save();
        flash("success", "Piłkarz " + playerForm.get().lastname + " został dodany!");
        return GO_HOME;
    }

    public static Result delete(Long id) {
        for(Lineup c: Lineup.find.where().findList()) {
            if (c.player1.id == id) {
                c.delete();
            }
        }

        Player.find.ref(id).delete();
        flash("success", "Piłkarz został usunięty");
        return GO_HOME;
    }


    public static Result upload(Long id) {
        MultipartFormData body = request().body().asMultipartFormData();
        FilePart picture = body.getFile("picture");
        Player example =  Player.find.byId(id);
        Form<Player> playerForm = form(Player.class).fill(
                example
        );
        if (picture != null) {
            String fileName = picture.getFilename();
            String contentType = picture.getContentType();
            File file = picture.getFile();
            file.renameTo(new File("public/players/", fileName));
            example.photo = "players/"+fileName;
            flash("success", "Plik "+fileName+" został dodany!");
            return ok(views.html.players.editForm.render(id, example.photo, playerForm));
        } else {
            flash("error", "Missing file");
            return redirect(routes.Players.index());
        }
    }
}
            
