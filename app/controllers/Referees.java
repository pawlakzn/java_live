package controllers;

import play.mvc.*;
import play.data.*;
import play.api.mvc.Call;
import static play.data.Form.*;

import views.html.referees.*;
import views.html.*;


import models.*;

@Security.Authenticated(Secured.class)
public class Referees extends Controller {

    public static Result GO_HOME = redirect(
            routes.Referees.list(0, "lastname", "asc", "")
    );

    public static Result index() {
        return GO_HOME;
    }

    public static Result list(int page, String sortBy, String order, String filter) {
        return ok(
                views.html.referees.list.render(
                        Referee.page(page, 10, sortBy, order, filter),
                        sortBy, order, filter
                )
        );
    }

    public static Result edit(Long id) {
        Form<Referee> refereeForm = form(Referee.class).fill(
                Referee.find.byId(id)
        );
        return ok(
                views.html.referees.editForm.render(id, refereeForm)
        );
    }

    public static Result update(Long id) {
        Form<Referee> refereeForm = form(Referee.class).bindFromRequest();
        if(refereeForm.hasErrors()) {
            return badRequest(views.html.referees.editForm.render(id, refereeForm));
        }
        refereeForm.get().update(id);
        flash("success", "Sędzia " + refereeForm.get().lastname + " został zaktualizowany");
        return GO_HOME;
    }


    public static Result create() {
        Form<Referee> refereeForm = form(Referee.class);
        return ok(
                views.html.referees.createForm.render(refereeForm)
        );
    }

    public static Result save() {
        Form<Referee> refereeForm = form(Referee.class).bindFromRequest();
        if(refereeForm.hasErrors()) {
            return badRequest(views.html.referees.createForm.render(refereeForm));
        }
        refereeForm.get().save();
        flash("success", "Sędzia " + refereeForm.get().lastname + " został dodany!");
        return GO_HOME;
    }

    public static Result delete(Long id) {
        Referee.find.ref(id).delete();
        flash("success", "Sędzia został usunięty");
        return GO_HOME;
    }


}
            
