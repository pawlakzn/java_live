package models;

import javax.persistence.*;

import play.db.ebean.*;
import play.data.format.*;
import play.data.validation.*;

import com.avaje.ebean.*;

@Entity
public class Lineup extends Model {

    private static final long serialVersionUID = 1L;

    @Id
    public Long id;

    @ManyToOne
    public Match match;

    @ManyToOne
    public Team team;

    public Long minute;

    @ManyToOne
    public Player player1;

    @ManyToOne
    public Player player2;

    public Long position;

    public static Finder<Long, Lineup> find = new Finder<Long, Lineup>(Long.class,Lineup.class);
}

