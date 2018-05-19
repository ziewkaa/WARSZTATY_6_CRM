package pl.coderslab.cmr.entity;

import org.hibernate.validator.constraints.URL;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private LocalDate created;

    private String name;

    private String description;

    @URL
    private String url;

    private String identifier;

    @ManyToMany(mappedBy = "project", fetch = FetchType.EAGER)
    private List<User> users;

    private boolean activity = false;

    @ManyToOne(fetch = FetchType.EAGER)
    private List<Quest> quests;

}
