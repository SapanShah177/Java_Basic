package org.java;

import java.util.ArrayList;
import java.util.List;

import org.java.DAO.AppDAOImpl;
import org.java.config.AppConfig;
import org.java.model.user;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AppController {

	@GetMapping("/")
	public ModelAndView homepage() {
		ModelAndView modelAndView = new ModelAndView("DisplayuserDetails");
		List<user> users = new ArrayList<user>();
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(AppConfig.class);
		
		AppDAOImpl DAO = context.getBean("DAOBean",AppDAOImpl.class);
		users = DAO.listUsers();
		modelAndView.addObject("users", users);
		context.close();
		return modelAndView;
	}

}
