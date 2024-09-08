package projects.service;

import projects.dao.ProjectDao;
import projects.entity.Project;

public class ProjectServices {
	private ProjectDao  projectDao = new ProjectDao();

	public Project addProject(Project project) {

		  return projectDao.insertProject(project);
		
}

	private Project insertProject(Project project) {
		return null;
	}

}
