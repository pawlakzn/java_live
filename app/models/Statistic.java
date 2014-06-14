package models;

import javax.persistence.*;

import play.db.ebean.*;
import play.data.format.*;
import play.data.validation.*;

import com.avaje.ebean.*;

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

    public static Finder<Long, Statistic> find = new Finder<Long, Statistic>(Long.class, Statistic.class);
}

