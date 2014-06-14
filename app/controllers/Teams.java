package controllers;

import play.mvc.*;
import play.data.*;
import static play.data.Form.*;
import play.mvc.Http.*;
import play.mvc.Http.MultipartFormData.*;
import java.io.File;

import models.*;

public class Teams extends Controller {

    public static Result GO_HOME = redirect(
            routes.Teams.list(0, "name", "asc", "")
           // User.find.byId(request().username())
    );

    public static Result index() {
        return GO_HOME;
    }

    public static Result list(int page, String sortBy, String order, String filter) {
        return ok(
                views.html.teams.list.render(
                        Team.page(page, 10, sortBy, order, filter),
                        sortBy, order, filter
                )
        );
    }

    public static Result edit(Long id) {
        Team example =  Team.find.byId(id);
        Form<Team> teamForm = form(Team.class).fill(
               example
        );
        return ok(
                views.html.teams.editForm.render(id, example.crest, teamForm)
        );
    }

    public static Result update(Long id) {
        Team example =  Team.find.byId(id);
        Form<Team> teamForm = form(Team.class).bindFromRequest();
        if(teamForm.hasErrors()) {
            return badRequest(views.html.teams.editForm.render(id, example.crest, teamForm));
        }
        teamForm.get().update(id);
        flash("success", "Zespół " + teamForm.get().name + " został zaktualizowany");
        return GO_HOME;
    }


    public static Result create() {
        Form<Team> teamForm = form(Team.class);
        return ok(
                views.html.teams.createForm.render(teamForm)
        );
    }

    public static Result save() {
        Form<Team> teamForm = form(Team.class).bindFromRequest();
        if(teamForm.hasErrors()) {
            return badRequest(views.html.teams.createForm.render(teamForm));
        }
        teamForm.get().save();
        flash("success", "Zespół " + teamForm.get().name + " został dodany!");
        return GO_HOME;
    }


    public static Result delete(Long id) {
        Team.find.ref(id).delete();
        flash("success", "Zespół został usunięty");
        return GO_HOME;
    }

    public static Result upload(Long id) {
        MultipartFormData body = request().body().asMultipartFormData();
        FilePart picture = body.getFile("picture");
        Team example =  Team.find.byId(id);
        Form<Team> teamForm = form(Team.class).fill(
                example
        );
        if (picture != null) {
            String fileName = picture.getFilename();
            String contentType = picture.getContentType();
            File file = picture.getFile();
            file.renameTo(new File("public/crests/", fileName));
            example.crest = "crests/"+fileName;
            flash("success", "Plik "+fileName+" został dodany!");
            return ok(views.html.teams.editForm.render(id, example.crest, teamForm));
        } else {
            flash("error", "Missing file");
            return redirect(routes.Teams.index());
        }
    }

}
            
