package models;

import java.io.File;
import java.util.*;
import javax.validation.*;
import javax.persistence.*;

import play.db.ebean.*;
import play.data.format.*;
import play.data.validation.*;
import play.data.validation.Constraints.*;

import com.avaje.ebean.*;

@Entity
public class Player extends Model {

    private static final long serialVersionUID = 1L;

    @Id
    public Long id;

    @ManyToOne
    public Team team;

    @Constraints.Required
    public String lastname;

    @Constraints.Required
    public String firstname;

    @Formats.DateTime(pattern="dd-MM-yyyy")
    public Date date_birth;

    public Integer status;
    public String photo;

    //@Required
    //@Pattern(value = "[1-9]", message = "A valid phone number is required")
    public Integer height;
    public Integer weight;
    public String position;
    public Integer number;

    public static Finder<Long, Player> find = new Finder<Long, Player>(Long.class, Player.class);

    public static Page<Player> page(int page, int pageSize, String sortBy, String order, String filter) {
        return
                find.where()
                        .ilike("lastname", "%" + filter + "%")
                        .orderBy(sortBy + " " + order)
                        .fetch("team")
                        .findPagingList(pageSize)
                        .setFetchAhead(false)
                        .getPage(page);
    }

    public static Map<String,String> photo_options() {
        LinkedHashMap<String,String> photo_options = new LinkedHashMap<String,String>();
        File dir = new File("public/players");
        String[] photo = dir.list();
        for (int i=0; i<photo.length; i++) {
            // Get filename of file or directory
            String filename = photo[i];
            photo_options.put("players/"+filename, filename);
        }
        return photo_options;
    }
}

