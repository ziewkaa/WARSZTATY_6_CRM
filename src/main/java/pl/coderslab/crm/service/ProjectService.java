package pl.coderslab.crm.service;

import pl.coderslab.crm.entity.Project;

import java.util.List;

public interface ProjectService {

    Project findProjectByGivenId(Long id);

    List<Project> findAllProjectsOrderByCreatedDesc();

    List<Project> findTop5ProjectsOrderByCreatedDesc();

    void saveProject(Project project);

}
