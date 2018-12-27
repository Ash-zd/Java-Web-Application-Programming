package javaweb.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author Ash
 * @date 2018/12/27 11:36
 */
@Entity
public class News implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, unique = true)
    private Long id;

    @Column(length = 50, nullable = false)
    private String ntitle;

    @Column(length = 1000, nullable = false)
    private String ncontent;

    @Column(length = 200)
    private String nurl;

    @ManyToOne(optional = false)
    @JoinColumn(name = "father")
    private Lmenu lmenu;


    public News() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNtitle() {
        return ntitle;
    }

    public void setNtitle(String ntitle) {
        this.ntitle = ntitle;
    }

    public String getNcontent() {
        return ncontent;
    }

    public void setNcontent(String ncontent) {
        this.ncontent = ncontent;
    }

    public String getNurl() {
        return nurl;
    }

    public void setNurl(String nurl) {
        this.nurl = nurl;
    }

    public Lmenu getLmenu() {
        return lmenu;
    }

    public void setLmenu(Lmenu lmenu) {
        this.lmenu = lmenu;
    }
}
