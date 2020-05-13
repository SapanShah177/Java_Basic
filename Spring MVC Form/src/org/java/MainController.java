package org.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.java.model.user;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

	@GetMapping("/")
	public ModelAndView home() {
		ModelAndView modelAndView = new ModelAndView("UserForm");
		user user = new user();
		Map<String, String> gender = new HashMap<String, String>();
		gender.put("Male", "Male");
		gender.put("Female", "Female");
		
		Map<String, String> countryMap = new HashMap<String, String>();
		countryMap.put("USA", "United States");
		countryMap.put("India", "India");
		countryMap.put("Australlia", "Australlia");
		
		modelAndView.addObject("genderMap", gender);
		modelAndView.addObject("countryMap", countryMap);
		modelAndView.addObject("user", user);
		return modelAndView;
	}

	@PostMapping("/userdetails")
	public ModelAndView displayuser(@ModelAttribute("user") @Valid user user, BindingResult result) {
		ModelAndView modelAndView = new ModelAndView("DisplayuserDetails");
		modelAndView.addObject("user", user);
		if(result.hasErrors()) {
			ModelAndView rePopulatedModelView = new ModelAndView("UserForm");
			
			Map<String, String> gender = new HashMap<String, String>();
			gender.put("Male", "Male");
			gender.put("Female", "Female");
			
			Map<String, String> countryMap = new HashMap<String, String>();
			countryMap.put("USA", "United States");
			countryMap.put("India", "India");
			countryMap.put("Australlia", "Australlia");
			
			rePopulatedModelView.addObject("genderMap", gender);
			rePopulatedModelView.addObject("countryMap", countryMap);
			rePopulatedModelView.addObject("user", user);
			
			System.out.println("It has Errors...");
			
			return rePopulatedModelView;
		}else {
			return modelAndView;
		}
		
	}

}
