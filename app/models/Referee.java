package models;

import javax.persistence.*;

import play.db.ebean.*;
import play.data.format.*;
import play.data.validation.*;

import com.avaje.ebean.*;

import java.util.LinkedHashMap;
import java.util.Map;

@Entity
public class Referee extends Model {

    private static final long serialVersionUID = 1L;

    @Id
    public Long id;

    @Constraints.Required
    public String lastname;

    public String firstname;
    public String city;

    public static Finder<Long, Referee> find = new Finder<Long, Referee>(Long.class, Referee.class);

    /**
     * Return a page of teams
     *
     * @param page Page to display
     * @param pageSize Number of teams per page
     * @param sortBy Zespol property used for sorting
     * @param order Sort order (either or asc or desc)
     * @param filter Filter applied on the name column
     */
    public static Page<Referee> page(int page, int pageSize, String sortBy, String order, String filter) {
        return
                find.where()
                        .ilike("lastname", "%" + filter + "%")
                        .orderBy(sortBy + " " + order)
                        .findPagingList(pageSize)
                        .setFetchAhead(false)
                        .getPage(page);
    }

    public static Map<String,String> options() {
        LinkedHashMap<String,String> options = new LinkedHashMap<String,String>();
        for(Referee c: Referee.find.orderBy("lastname").findList()) {
            options.put(c.id.toString(), c.firstname+" "+c.lastname);
        }
        return options;
    }
}

