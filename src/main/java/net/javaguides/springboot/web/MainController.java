package net.javaguides.springboot.web;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import net.javaguides.springboot.service.UserService;
import net.javaguides.springboot.web.dto.UserRegistrationDto;
import net.javaguides.springboot.repository.UserRepository


@Controller
public class MainController {

	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@GetMapping("/")
	public String home()
	{
		return "index";
	}

	@GetMapping({"/list", "/"})
	public ModelAndView getAllUsers() {
		ModelAndView mav = new ModelAndView("list-users");
		mav.addObject("users", eRepo.findAll());
		return mav;
	}
	  

}
