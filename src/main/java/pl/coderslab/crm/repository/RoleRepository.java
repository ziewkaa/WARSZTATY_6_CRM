package pl.coderslab.crm.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pl.coderslab.crm.entity.Role;

public interface RoleRepository {

    @Query("SELECT r FROM Role r WHERE r.name = :name")
    Role findByName(@Param("name") String name);
}
