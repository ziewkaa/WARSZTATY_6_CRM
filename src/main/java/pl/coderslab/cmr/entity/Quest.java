package pl.coderslab.cmr.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Quest {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private LocalDate created;

    private String title;

    @OneToMany(mappedBy = "quests", fetch = FetchType.EAGER)
    private Project project;

    private String description;

    @ManyToOne
    private Status status;

    @OneToOne
    private Priority priority;

    @ManyToMany
    private List<User> users;

}
