package pl.coderslab.crm.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.coderslab.crm.entity.Activity;
import pl.coderslab.crm.repository.ActivityRepository;
import pl.coderslab.crm.service.ActivityService;

import java.util.List;

@Service
public class ActivityServiceImpl implements ActivityService {

    @Autowired
    private ActivityRepository activityRepository;

    @Override
    public List<Activity> findAllActivitiesOrderByCreatedDesc() {
        return activityRepository.findAllByOrderByCreated();
    }

    @Override
    public List<Activity> findTop25OrderByCreatedDesc() {
        return activityRepository.findTop25OrderByCreated();
    }
}
