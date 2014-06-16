package models;

import javax.persistence.*;
import javax.validation.*;

import play.db.ebean.*;
import play.data.format.*;
import play.data.validation.*;
import play.data.validation.Constraints.*;

import com.avaje.ebean.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

@Entity
public class Match extends Model {

    private static final long serialVersionUID = 1L;

    @Id
    public Long id;

    @Required
    @ManyToOne
    public Game game;

    public Long queue;

    @OneToOne
    public Statistic statistics;

    @ManyToOne
    public Referee referee;

    @Required
    @ManyToOne
    public Team team1;

    @Required
    @ManyToOne
    public Team team2;

    @Min(0)
    public Long score1;
    @Min(0)
    public Long score2;
    @Min(0)
    public Long score1_half;
    @Min(0)
    public Long score2_half;

    @Min(0)
    public Long status;

    @Formats.DateTime(pattern="dd-MM-yyyy kk:mm")
    public Date match_date;
    public String weather;
    public Long viewers;

    public Match() {
        Integer i = 0;
        long l = i.longValue();
        this.statistics = new Statistic();
        this.queue = l;
        this.score1 = l;
        this.score2 = l;
        this.score1_half = l;
        this.score2_half = l;
        this.status = l;
    }

    public Match(Statistic st) {
        Integer i = 0;
        long l = i.longValue();
        this.statistics = st;
        this.queue = l;
        this.score1 = l;
        this.score2 = l;
        this.score1_half = l;
        this.score2_half = l;
        this.status = l;
    }

    public static Finder<Long, Match> find = new Finder<Long, Match>(Long.class, Match.class);

    /**
     * Return a page of teams
     *
     * @param page Page to display
     * @param pageSize Number of teams per page
     * @param sortBy Zespol property used for sorting
     * @param order Sort order (either or asc or desc)
     * @param filter Filter applied on the name column
     */
    public static Page<Match> page(int page, int pageSize, String sortBy, String order, String filter) {
        return
                find.where()
                        .ilike("weather", "%" + filter + "%")
                        .orderBy(sortBy + " " + order)
                        .findPagingList(pageSize)
                        .setFetchAhead(false)
                        .getPage(page);
    }

    public static Map<String,String> options() {
        LinkedHashMap<String,String> options = new LinkedHashMap<String,String>();
        for(Match c: Match.find.orderBy("team1.name").findList()) {
            String y = c.team1.name +" - " + c.team2.name;
            options.put(c.id.toString(), y);
        }
        return options;
    }

}

