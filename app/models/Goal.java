package models;

import javax.persistence.*;

import play.db.ebean.*;
import play.data.format.*;
import play.data.validation.*;

import com.avaje.ebean.*;

@Entity
public class Goal extends Model {

    private static final long serialVersionUID = 1L;

    @Id
    public Long id;

    @ManyToOne
    public Match match;

    @ManyToOne
    public Team team;

    @ManyToOne
    public Player player;

    public Long minute;

    public static Finder<Long, Goal> find = new Finder<Long, Goal>(Long.class,Goal.class);
}

