package fr.cda.tpcitoyen.Services;

import fr.cda.tpcitoyen.Entities.Project;

import java.util.List;

public interface ProjectService {

    /**
     * Afficher la liste des projets, sans ses joitures Votes et Discussions
     * @return List Project
     */
    List<Project> getProjects();

    /**
     * Afficher un projet à partir de son id<br>
     * Utilisé pour afficher les détails d'un projet avec ses Votes et Discussions
     * @param id
     * @return
     */
    Project getProjectsById(Integer id);

    /**
     * Créer un nouveau Projet
     * @param project
     */
    void addProject(Project project);

    /**
     * Modifier un Projet existant, à partir de son ID
     * @param id Integer
     * @param project Project
     */
    void updateProject(Integer id, Project project);

    /**
     * Supprimer un Projet existant, à partir de son ID
     * @param id Integer
     */
    void deleteProject(Integer id);








}
