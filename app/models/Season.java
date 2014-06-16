package models;

import javax.persistence.*;

import play.db.ebean.*;
import play.data.format.*;
import play.data.validation.*;
import play.data.validation.Constraints.*;

import com.avaje.ebean.*;

import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import java.text.SimpleDateFormat;

@Entity
public class Season extends Model {

    private static final long serialVersionUID = 1L;

    @Id
    public Long id;

    @Required
    @Formats.DateTime(pattern="yyyy")
    public Date year_start;

    @Required
    @Formats.DateTime(pattern="yyyy")
    public Date year_end;

    public static Finder<Long, Season> find = new Finder<Long, Season>(Long.class, Season.class);

    /**
     * Return a page of teams
     *
     * @param page Page to display
     * @param pageSize Number of teams per page
     * @param sortBy Zespol property used for sorting
     * @param order Sort order (either or asc or desc)
     * @param filter Filter applied on the name column
     */
    public static Page<Season> page(int page, int pageSize, String sortBy, String order, String filter) {
        return
                find.where()
                        .ilike("year_start", "%" + filter + "%")
                        .ilike("year_end", "%" + filter + "%")
                        .orderBy(sortBy + " " + order)
                        .findPagingList(pageSize)
                        .setFetchAhead(false)
                        .getPage(page);
    }

    public static Map<String,String> options() {
        LinkedHashMap<String,String> options = new LinkedHashMap<String,String>();
        for(Season c: Season.find.orderBy("year_start").findList()) {
            String ys = new SimpleDateFormat("yyyy").format(c.year_start);
            String ye = new SimpleDateFormat("yyyy").format(c.year_end);
            String y = ys+"/"+ye;
            options.put(c.id.toString(), y);
        }
        return options;
    }

}

