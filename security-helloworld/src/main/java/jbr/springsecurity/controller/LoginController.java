package jbr.springsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import jbr.springsecurity.model.Login;

@Controller
public class LoginController {

  @RequestMapping(value = "/", method = RequestMethod.GET)
  public String init(Model model) {
    model.addAttribute("msg", "Please Enter Your Login Details");
    return "login";
  }

  @RequestMapping(value = "/login", method = RequestMethod.POST)
  public String submit(Model model, @Validated Login login) {
    String page = "login";

    if (login != null && login.getUsername() != null & login.getPassword() != null) {
      if (login.getUsername().equals("ranjith") && login.getPassword().equals("sekar")) {
        page = "welcome";
        model.addAttribute("username", login.getUsername());
      } else {
        model.addAttribute("error", "Invalid Details");
      }
    } else {
      model.addAttribute("error", "Please enter Details");
    }

    return page;
  }
}
