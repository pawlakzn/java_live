package models;

import javax.persistence.*;

import play.db.ebean.*;
import play.data.format.*;
import play.data.validation.*;
import play.data.validation.Constraints.*;

import com.avaje.ebean.*;

import java.util.LinkedHashMap;
import java.util.Map;

@Entity
public class Game extends Model {

    private static final long serialVersionUID = 1L;

    @Id
    public Long id;

    @Required
    @ManyToOne
    public Season season;

    @Required
    public String name;

    public static Finder<Long, Game> find = new Finder<Long, Game>(Long.class, Game.class);

    /**
     * Return a page of teams
     *
     * @param page Page to display
     * @param pageSize Number of teams per page
     * @param sortBy Zespol property used for sorting
     * @param order Sort order (either or asc or desc)
     * @param filter Filter applied on the name column
     */
    public static Page<Game> page(int page, int pageSize, String sortBy, String order, String filter) {
        return
                find.where()
                        .ilike("name", "%" + filter + "%")
                        .orderBy(sortBy + " " + order)
                        .findPagingList(pageSize)
                        .setFetchAhead(false)
                        .getPage(page);
    }

    public static Map<String,String> options() {
        LinkedHashMap<String,String> options = new LinkedHashMap<String,String>();
        for(Game c: Game.find.orderBy("name").findList()) {
            options.put(c.id.toString(), c.name);
        }
        return options;
    }
}

