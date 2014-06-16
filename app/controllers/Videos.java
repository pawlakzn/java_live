package controllers;

import play.mvc.*;
import play.data.*;
import static play.data.Form.*;

import models.*;

@Security.Authenticated(Secured.class)
public class Videos extends Controller {

    public static Result GO_HOME = redirect(
            routes.Videos.list(0, "name", "asc", "")
    );

    public static Result index() {
        return GO_HOME;
    }

    public static Result list(int page, String sortBy, String order, String filter) {
        return ok(
                views.html.videos.list.render(
                        Video.page(page, 10, sortBy, order, filter),
                        sortBy, order, filter
                )
        );
    }

    public static Result edit(Long id) {
        Form<Video> videoForm = form(Video.class).fill(
                Video.find.byId(id)
        );
        return ok(
                views.html.videos.editForm.render(id, videoForm)
        );
    }

    public static Result update(Long id) {
        Form<Video> videoForm = form(Video.class).bindFromRequest();
        if(videoForm.hasErrors()) {
            return badRequest(views.html.videos.editForm.render(id, videoForm));
        }

        videoForm.get().update(id);
        flash("success", "Wideo " + videoForm.get().name + " zostało dodane");
        return GO_HOME;
    }


    public static Result create() {
        Form<Video> videoForm = form(Video.class);
        return ok(
                views.html.videos.createForm.render(videoForm)
        );
    }

    public static Result save() {
        Form<Video> videoForm = form(Video.class).bindFromRequest();
        if(videoForm.hasErrors()) {
            return badRequest(views.html.videos.createForm.render(videoForm));
        }

        if(videoForm.get().vmatch.id == null) {
            return badRequest(views.html.videos.createForm.render(videoForm));
        }

        videoForm.get().save();
        flash("success", "Wideo " + videoForm.get().name + " zostało dodane!");
        return GO_HOME;
    }

    public static Result delete(Long id) {
        Video.find.ref(id).delete();
        flash("success", "Video zostało usunięte");
        return GO_HOME;
    }


}
            
