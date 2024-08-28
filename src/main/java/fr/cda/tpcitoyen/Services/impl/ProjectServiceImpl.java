package fr.cda.tpcitoyen.Services.impl;

import fr.cda.tpcitoyen.Repositories.ProjectRepository;
import fr.cda.tpcitoyen.Services.ProjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProjectServiceImpl implements ProjectService {
    private final ProjectRepository projectRepository;
}
