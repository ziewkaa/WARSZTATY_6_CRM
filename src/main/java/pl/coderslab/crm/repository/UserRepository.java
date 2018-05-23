package pl.coderslab.crm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pl.coderslab.crm.entity.Project;
import pl.coderslab.crm.entity.User;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    @Query("SELECT u FROM User u WHERE u.id = :id")
    User findOneById(@Param("id") Long id);

    @Query("SELECT u FROM User u WHERE u.project = :project")
    List<User> findAllByProject(Project project);

    @Query("SELECT u FROM User u WHERE u.project.id = :id")
    List<User> findAllByProjectId(@Param("id") Long id);

    @Query("SELECT u FROM User u WHERE u.username = :username")
    User findByUsername(@Param("username") String username);
}
