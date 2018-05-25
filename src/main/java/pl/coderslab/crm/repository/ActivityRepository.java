package pl.coderslab.crm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pl.coderslab.crm.entity.Activity;

import java.util.List;

public interface ActivityRepository  extends JpaRepository<Activity, Long> {

    @Query("SELECT a FROM Activity a ORDER BY a.created DESC ")
    List<Activity> findAllByOrderByCreated();

    @Query("SELECT a FROM Activity a ORDER BY a.created DESC ")
    List<Activity> findTop25OrderByCreated();

}
