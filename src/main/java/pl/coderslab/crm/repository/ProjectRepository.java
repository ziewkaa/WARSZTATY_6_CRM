package pl.coderslab.crm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pl.coderslab.crm.entity.Project;

import java.util.List;

public interface ProjectRepository extends JpaRepository<Project, Long> {

    @Query("SELECT p FROM Project p ORDER BY p.created DESC")
    List<Project> findAllByOrderByCreatedDesc();

    @Query("SELECT p FROM Project p WHERE p.id = :id")
    Project findOneById(@Param("id") Long id);

}
