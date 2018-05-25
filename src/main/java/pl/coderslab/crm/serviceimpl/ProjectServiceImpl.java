package pl.coderslab.crm.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.coderslab.crm.entity.Project;
import pl.coderslab.crm.repository.ProjectRepository;
import pl.coderslab.crm.service.ProjectService;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ProjectServiceImpl implements ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    @Override
    public Project findProjectByGivenId(Long id) {
        return projectRepository.findOneById(id);
    }

    @Override
    public List<Project> findAllProjectsOrderByCreatedDesc() {
        return projectRepository.findAllByOrderByCreatedDesc();
    }

    @Override
    public List<Project> findTop5ProjectsOrderByCreatedDesc() {
        return projectRepository.findTop5ByOrderByCreatedDesc();
    }

    @Override
    public void saveProject(Project project) {

        project.setCreated(LocalDateTime.now());
        projectRepository.save(project);
    }
}
