package pl.coderslab.crm.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.coderslab.crm.entity.Activity;
import pl.coderslab.crm.entity.Project;
import pl.coderslab.crm.service.ActivityService;
import pl.coderslab.crm.service.ProjectService;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    ProjectService projectService;

    @Autowired
    ActivityService activityService;

    @GetMapping("/")
    public String index (Model model){

        List<Project> projects = projectService.findTop5ProjectsOrderByCreatedDesc();
        List<Activity> activities = activityService.findTop25OrderByCreatedDesc();
        model.addAttribute(projects);
        model.addAttribute(activities);
        return "index";
    }

}
