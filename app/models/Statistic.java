package models;

import javax.persistence.*;

import play.db.ebean.*;
import play.data.format.*;
import play.data.validation.*;

import com.avaje.ebean.*;

import java.util.LinkedHashMap;
import java.util.Map;

@Entity
public class Statistic extends Model {

    private static final long serialVersionUID = 1L;

    @Id
    public Long id;

    public Long goals1;
    public Long goals2;
    public Long goals1_half;
    public Long goals2_half;

    public Long goalpost1;
    public Long goalpost2;
    public Long goalpost1_half;
    public Long goalpost2_half;

    public Long attempts_target1;
    public Long attempts_target2;
    public Long attempts_target1_half;
    public Long attempts_target2_half;

    public Long attempts_offtarget1;
    public Long attempts_offtarget2;
    public Long attempts_offtarget1_half;
    public Long attempts_offtarget2_half;

    public Long attempts_blocked1;
    public Long attempts_blocked2;
    public Long attempts_blocked1_half;
    public Long attempts_blocked2_half;

    public Long corners1;
    public Long corners2;
    public Long corners1_half;
    public Long corners2_half;

    public Long fouls1;
    public Long fouls2;
    public Long fouls1_half;
    public Long fouls2_half;

    public Long offsides1;
    public Long offsides2;
    public Long offsides1_half;
    public Long offsides2_half;

    public Long yellow_cards1;
    public Long yellow_cards2;
    public Long yellow_cards1_half;
    public Long yellow_cards2_half;

    public Long red_cards1;
    public Long red_cards2;
    public Long red_cards1_half;
    public Long red_cards2_half;

    public Statistic() {
        Integer i = 0;
        long l = i.longValue();

        this.goals1 = l;
        this.goals2 = l;
        this.goals1_half = l;
        this.goals2_half = l;

        this.goalpost1 = l;
        this.goalpost2 = l;
        this.goalpost1_half = l;
        this.goalpost2_half = l;

        this.attempts_target1 = l;
        this.attempts_target2 = l;
        this.attempts_target1_half = l;
        this.attempts_target2_half = l;

        this.attempts_offtarget1 = l;
        this.attempts_offtarget2 = l;
        this.attempts_offtarget1_half = l;
        this.attempts_offtarget2_half = l;

        this.attempts_blocked1 = l;
        this.attempts_blocked2 = l;
        this.attempts_blocked1_half = l;
        this.attempts_blocked2_half = l;

        this.corners1 = l;
        this.corners2 = l;
        this.corners1_half = l;
        this.corners2_half = l;

        this.fouls1 = l;
        this.fouls2 = l;
        this.fouls1_half = l;
        this.fouls2_half = l;

        this.offsides1 = l;
        this.offsides2 = l;
        this.offsides1_half = l;
        this.offsides2_half = l;

        this.yellow_cards1 = l;
        this.yellow_cards2 = l;
        this.yellow_cards1_half = l;
        this.yellow_cards2_half = l;

        this.red_cards1 = l;
        this.red_cards2 = l;
        this.red_cards1_half = l;
        this.red_cards2_half = l;
    }

    public static Finder<Long, Statistic> find = new Finder<Long, Statistic>(Long.class, Statistic.class);

    public static Map<String,String> options() {
        LinkedHashMap<String,String> options = new LinkedHashMap<String,String>();
        for(Statistic c: Statistic.find.orderBy("id").findList()) {
            options.put(c.id.toString(), c.goals1.toString());
        }
        return options;
    }
}

