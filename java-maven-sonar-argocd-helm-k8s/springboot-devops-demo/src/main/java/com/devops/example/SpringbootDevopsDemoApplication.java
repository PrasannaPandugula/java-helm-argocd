package com.devops.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class SpringbootDevopsDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDevopsDemoApplication.class, args);
	}

	@GetMapping("/")
    public String home(Model model) {
        model.addAttribute("message", "Welcome to Spring Boot DevOps Demo!");
        return "index";  // resolves to index.html in templates folder
    }
}
