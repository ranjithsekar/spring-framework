package jbr.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreetingController {

  @GetMapping("/morning")
  public String morning(Model model) {
    model.addAttribute("message", "Good Morning!!!");

    return "greeting";
  }

  @GetMapping("/evening")
  public String evening(Model model) {
    model.addAttribute("message", "Good Evening!!!");

    return "greeting";
  }

}
