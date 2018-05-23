package pl.coderslab.crm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.coderslab.crm.entity.Project;
import pl.coderslab.crm.repository.ProjectRepository;

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
    public void saveProject(Project project) {
        projectRepository.save(project);
    }
}
