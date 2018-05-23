package pl.coderslab.crm.entity;

import javax.persistence.*;

@Entity
@Table(name = "statuses")
public class Status {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Boolean activity = false;

    private int sortindex;

    public Status() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isActivity() {
        return activity;
    }

    public void setActivity(boolean activity) {
        this.activity = activity;
    }

    public int getSortindex() {
        return sortindex;
    }

    public void setSortindex(int sortindex) {
        this.sortindex = sortindex;
    }
}
