package models;

import javax.persistence.*;

import play.db.ebean.*;
import play.data.format.*;
import play.data.validation.*;

import com.avaje.ebean.*;

@Entity
public class Live extends Model {

    private static final long serialVersionUID = 1L;

    @Id
    public Long id;

    @ManyToOne
    public Match match;

    public Long minute;

    @ManyToOne
    public String text;

    public Long status;

    public static Finder<Long, Live> find = new Finder<Long, Live>(Long.class,Live.class);
}

