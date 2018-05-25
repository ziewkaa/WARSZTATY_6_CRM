package pl.coderslab.crm.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.coderslab.crm.entity.Priority;
import pl.coderslab.crm.repository.PriorityRepository;
import pl.coderslab.crm.service.PriorityService;

import java.util.List;

@Service
public class PriorityServiceImpl implements PriorityService {

    @Autowired
    private PriorityRepository priorityRepository;

    @Override
    public List<Priority> findAllPriorities() {
        return null;
    }



}
