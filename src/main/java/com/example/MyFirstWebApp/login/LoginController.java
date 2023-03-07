package com.example.MyFirstWebApp.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class LoginController {
	
	private AuthenticationService authenticationService;
	
	// \src\main\resources\META-INF\resources\WEB-INF\jsp\login.jsp
	
	
	public LoginController(AuthenticationService authenticationService) {
		super();
		this.authenticationService = authenticationService;
	}


	// http://localhost:8080/login?name=Ranga
	@RequestMapping(value="login", method=RequestMethod.GET)
	public String gotoLoginPage() {
		
		return "login";
	}
	
	
	//login?Ranga RequestParam
	@RequestMapping(value="login", method=RequestMethod.POST)
	public String gotoWelcomePage(@RequestParam String name, @RequestParam String password, ModelMap model) {
		model.put("name", name);
		model.put("password", password);
		
		if(authenticationService.authenticate(name, password)) {
			//Authentication
			//name - prithvi
			//password - dummy
			
			return "welcome";
		} 
		
		model.put("errorMessage", "Invalid Credentials ! . Please Try Again ");
		return "login";
	}
}






















































































































