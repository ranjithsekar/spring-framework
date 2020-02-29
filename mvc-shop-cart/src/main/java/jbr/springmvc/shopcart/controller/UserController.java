package jbr.springmvc.shopcart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@RequestMapping("users")
@SessionAttributes
public class UserController {

  @GetMapping
  public String add(Model model) {
    model.addAttribute("message", "User page");

    return "user";
  }

}
