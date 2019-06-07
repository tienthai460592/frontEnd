package com.example.demo.Controller;

import com.example.demo.Greeting;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
public class UserController {

    @GetMapping("/login")
    public String greetingForm(Model model) {
        model.addAttribute("greeting", new Greeting());
        return "userpage";
    }

    @PostMapping("/login")
    public String greetingSubmit(@ModelAttribute Greeting greeting) {
        return "result";
    }
}
