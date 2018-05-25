package pl.coderslab.crm.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.coderslab.crm.entity.Status;
import pl.coderslab.crm.repository.StatusRepository;
import pl.coderslab.crm.service.StatusService;

import java.util.List;

@Service
public class StatusServiceImpl implements StatusService {

    @Autowired
    private StatusRepository statusRepository;

    @Override
    public List<Status> findAllStatuses() {
        return statusRepository.findAll();
    }
}
