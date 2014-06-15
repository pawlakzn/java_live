package controllers;


import play.*;
import play.mvc.*;
import play.data.*;

import play.api.mvc.Session;

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
                return "Nieprawidłowy login lub hasło!";
            }
            return null;
        }

    }

    /**
     * Login page.
     */
    public static Result login() {
       String user = session("login");
       if(user != null) {
            return redirect(
                    routes.Matches.index()
            );
        } else {
            return ok(
                    login.render(form(Login.class))
            );
        }
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
            flash("success", "Zalogowałeś się!");
            return redirect(
                    routes.Matches.index()
            );
        }
    }

    /**
     * Logout and clean the session.
     */
    public static Result logout() {
        session().clear();
        flash("success", "Wylogowałeś się!");
        return redirect(
                routes.Matches.index()
        );
    }

}
