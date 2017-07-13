package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

    private UserRepository userRepository;

    public GreetingController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/greeting")
    public String printGreeting(Model model,
                                @RequestParam(value = "firstName", required = false, defaultValue = "John") String firstName,
                                @RequestParam(value = "lastName", required = false, defaultValue = "Doe") String lastName) {

        User user = new User(firstName, lastName);

        userRepository.save(user);

        model.addAttribute(user);

        return "greeting";
    }

}
