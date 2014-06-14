package models;

        import javax.persistence.*;

        import play.db.ebean.*;
        import play.data.format.*;
        import play.data.validation.*;

        import com.avaje.ebean.*;

@Entity
public class Video extends Model {

    private static final long serialVersionUID = 1L;

    @Id
    public Long id;

    @ManyToOne
    public Match match;

    public String path;

    public static Finder<Long, Video> find = new Finder<Long, Video>(Long.class, Video.class);
}

