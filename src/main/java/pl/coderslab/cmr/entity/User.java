package pl.coderslab.cmr.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String firstName;

    private String lastName;

    private String password;

    @ManyToOne
    private Project project;

    @ManyToMany(mappedBy = "users")
    private List<Quest> quests;


}
