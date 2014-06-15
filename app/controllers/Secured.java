package controllers;

import play.mvc.*;
import play.mvc.Http.*;

import play.api.mvc.Session;

import models.*;

public class Secured extends Security.Authenticator {

    @Override
    public String getUsername(Context ctx) {
        if(ctx.session().get("login") != null) {
            User user_login = User.findByLogin(ctx.session().get("login"));
            if(user_login.status != 0) {
                return "1";
            }
            return null;
        } else{
            return null;
        }
    }

    @Override
    public Result onUnauthorized(Context ctx) {
        return redirect(routes.Application.login());
    }

}