package pl.coderslab.crm.service;

import pl.coderslab.crm.entity.Activity;

import java.util.List;

public interface ActivityService {

    List<Activity> findAllActivitiesOrderByCreatedDesc();

    List<Activity> findTop25OrderByCreatedDesc();
}
