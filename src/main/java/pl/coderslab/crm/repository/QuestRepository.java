package pl.coderslab.crm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.crm.entity.Quest;

public interface QuestRepository extends JpaRepository<Quest, Long> {
}
