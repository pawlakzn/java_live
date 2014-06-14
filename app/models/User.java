package models;

import java.io.File;
import java.util.*;
import javax.persistence.*;

import play.db.ebean.*;
import play.data.format.*;
import play.data.validation.*;

import com.avaje.ebean.*;

import java.util.LinkedHashMap;
import java.util.Map;

@Entity
public class User extends Model {

    private static final long serialVersionUID = 1L;

    @Id
    public Long id;

    @Constraints.Required
    @Formats.NonEmpty
    public String login;

    @Constraints.Required
    public String email;

    @Constraints.Required
    public String password;

    public String name;
    public String lastname;

    public Long status;
    // -- Queries

    public static Model.Finder<String,User> find = new Model.Finder<String,User>(String.class, User.class);
    public static Model.Finder<Long,User> findLong = new Model.Finder<Long,User>(Long.class, User.class);

    /**
     * Retrieve all users.
     */
    public static List<User> findAll() {
        return find.all();
    }

    /**
     * Retrieve a User from email.
     */
    public static User findByEmail(String email) {
        return find.where().eq("email", email).findUnique();
    }

    public static User findByLogin(String login) {
        return find.where().eq("login", login).findUnique();
    }

    /**
     * Authenticate a User.
     */
    public static User authenticate(String login, String password) {
        return find.where()
                .eq("login", login)
                .eq("password", password)
                .findUnique();
    }

    // --

    public String toString() {
        return "User(" + login + ")";
    }

    public static Page<User> page(int page, int pageSize, String sortBy, String order, String filter) {
        return
                find.where()
                        .ilike("login", "%" + filter + "%")
                        .orderBy(sortBy + " " + order)
                        .findPagingList(pageSize)
                        .setFetchAhead(false)
                        .getPage(page);
    }

    public static Map<String,String> options() {
        LinkedHashMap<String,String> options = new LinkedHashMap<String,String>();
        for(User c: User.findLong.orderBy("login").findList()) {
            options.put(c.id.toString(), c.login);
        }
        return options;
    }

}

