package jbr.springmvc.shopcart.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {

  @GetMapping
  public String home(Model model) {
    Date today = new Date();
    model.addAttribute("today", today);

    return "home";
  }

}
