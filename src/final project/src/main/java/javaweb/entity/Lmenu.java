package javaweb.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author Ash
 * @date 2018/12/27 11:36
 */
@Entity
public class Lmenu implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 50)
    private String lname;

    @Column(length = 500)
    private String ldescription;

    public Lmenu() {
    }

    public Lmenu(String lname, String ldescription) {
        this.lname = lname;
        this.ldescription = ldescription;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getLdescription() {
        return ldescription;
    }

    public void setLdescription(String ldescription) {
        this.ldescription = ldescription;
    }
}
