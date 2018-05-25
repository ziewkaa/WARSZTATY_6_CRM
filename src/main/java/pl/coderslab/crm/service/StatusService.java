package pl.coderslab.crm.service;

import pl.coderslab.crm.entity.Status;

import java.util.List;

public interface StatusService {

    List<Status> findAllStatuses();
}
