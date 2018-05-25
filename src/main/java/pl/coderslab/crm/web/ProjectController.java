package pl.coderslab.crm.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.crm.entity.Project;
import pl.coderslab.crm.service.ProjectService;

import javax.validation.Valid;
import java.time.LocalDateTime;

@Controller
@RequestMapping("/project")
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @GetMapping("/add")
    public String add(Model model){

        model.addAttribute("project", new Project());

        return "newproject";
    }

    @PostMapping("/add")
    public String add(@Valid @ModelAttribute Project project, BindingResult bindingResult){

        if (bindingResult.hasErrors()){
            return "newproject";
        }

        project.setActive(true);
        project.setCreated(LocalDateTime.now());
        projectService.saveProject(project);

        return "newproject";
    }

    @GetMapping("/edit/{id}")
    public String eidt(@PathVariable Long id, Model model){

        model.addAttribute("project", projectService.findProjectByGivenId(id));

        return "projectedit";
    }

    @PostMapping("/edit/{id}")
    public String edit(@Valid @ModelAttribute Project project, BindingResult bindingResult){

        if (bindingResult.hasErrors()){
            return "projectedit";
        }

        projectService.saveProject(project);

        return "allprojects";
    }

}
