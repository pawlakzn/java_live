package controllers;

import play.mvc.*;
import play.data.*;
import play.api.mvc.Call;
import static play.data.Form.*;

import views.html.referees.*;
import views.html.*;


import models.*;

import java.text.SimpleDateFormat;

public class Users extends Controller {

    public static Result GO_HOME = redirect(
            routes.Users.list(0, "login", "asc", "")
    );

    public static Result index() {
        return GO_HOME;
    }

    public static Result list(int page, String sortBy, String order, String filter) {
        return ok(
                views.html.users.list.render(
                        User.page(page, 10, sortBy, order, filter),
                        sortBy, order, filter
                )
        );
    }

    public static Result edit(Long id) {
        Form<User> userForm = form(User.class).fill(
                User.findLong.byId(id)
        );
        return ok(
                views.html.users.editForm.render(id, userForm)
        );
    }

    public static Result update(Long id) {
        Form<User> userForm = form(User.class).bindFromRequest();
        if(userForm.hasErrors()) {
            return badRequest(views.html.users.editForm.render(id, userForm));
        }
        userForm.get().update(id);
        flash("success", "Użytkownik " + userForm.get().login + " został zaktualizowany");
        return GO_HOME;
    }


    public static Result create() {
        Form<User> userForm = form(User.class);
        return ok(
                views.html.users.createForm.render(userForm)
        );
    }

    public static Result save() {
        Form<User> userForm = form(User.class).bindFromRequest();
        if(userForm.hasErrors()) {
            return badRequest(views.html.users.createForm.render(userForm));
        }
        userForm.get().save();
        flash("success", "Użytkownik " + userForm.get().login + " został dodany!");
        return GO_HOME;
    }

    public static Result delete(Long id) {
        User.findLong.ref(id).delete();
        flash("success", "Użytkownik został usunięty");
        return GO_HOME;
    }


}
            