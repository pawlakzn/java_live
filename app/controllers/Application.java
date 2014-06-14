package controllers;

import play.*;
import play.mvc.*;
import play.data.*;
import static play.data.Form.*;

import models.*;
import views.html.*;

public class Application extends Controller {

    // -- Authentication

    public static class Login {

        public String login;
        public String password;

        public String validate() {
            if(User.authenticate(login, password) == null) {
                return "Invalid user or password";
            }
            return null;
        }

    }

    /**
     * Login page.
     */
    public static Result login() {
        return ok(
                login.render(form(Login.class))
        );
    }

    /**
     * Handle login form submission.
     */
    public static Result authenticate() {
        Form<Login> loginForm = form(Login.class).bindFromRequest();
        if(loginForm.hasErrors()) {
            return badRequest(login.render(loginForm));
        } else {
            session("login", loginForm.get().login);
            return redirect(
                    routes.Teams.index()
            );
        }
    }

    /**
     * Logout and clean the session.
     */
    public static Result logout() {
        session().clear();
        flash("success", "You've been logged out");
        return redirect(
                routes.Matches.index()
        );
    }

}
