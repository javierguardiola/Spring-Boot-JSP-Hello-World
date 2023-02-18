package net.viralpatel.springbootjspexample;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class WelcomeController {

	@Value("${application.message:Hello World}")
	private String helloMessage;
	
	@GetMapping("/")
	public String welcome(Map<String, Object> model) {
		
		model.put("message", helloMessage);
		
		return "welcome";
	}
	@PostMapping("/welcome")
	public String welcomePost(Map<String, Object> model, String nombre) {
		
		model.put("message", nombre);
		
		return "welcome";
	}
	
	
	

}
