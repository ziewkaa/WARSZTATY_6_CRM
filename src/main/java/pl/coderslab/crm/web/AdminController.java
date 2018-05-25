package pl.coderslab.crm.web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.crm.entity.Priority;
import pl.coderslab.crm.entity.Project;
import pl.coderslab.crm.entity.Status;
import pl.coderslab.crm.entity.User;
import pl.coderslab.crm.service.PriorityService;
import pl.coderslab.crm.service.ProjectService;
import pl.coderslab.crm.service.StatusService;
import pl.coderslab.crm.service.UserService;

import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    ProjectService projectService;

    @Autowired
    UserService userService;

    @Autowired
    PriorityService priorityService;

    @Autowired
    StatusService statusService;

    @GetMapping("/projects")
    public String allProjects(Model model){

        List<Project> projects = projectService.findAllProjectsOrderByCreatedDesc();

        return "projects";
    }

    @GetMapping("/statuses")
    public String allStatuses(){
        List<Status> statuses = statusService.findAllStatuses();

        return "statuses";
    }

    @GetMapping("/users")
    public String allUsers(){
        List<User> users = userService.findAllUsers();

        return "users";
    }

    @GetMapping("/priorities")
    public String allPriorities(){
        List<Priority> priorities = priorityService.findAllPriorities();

        return "priorities";
    }

}
