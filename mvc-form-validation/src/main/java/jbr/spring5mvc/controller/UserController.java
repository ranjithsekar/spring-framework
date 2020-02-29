package jbr.spring5mvc.controller;

import java.util.Arrays;
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import jbr.spring5mvc.model.User;

@Controller
public class UserController {

  @GetMapping(value = { "/", "/reg" })
  public String showRegPage(Model model) {
    model.addAttribute("user", new User());

    return "registration";
  }

  @PostMapping(value = { "/proceedReg" })
  public String proceedReg(@Valid User user, BindingResult result, ModelMap model) {
    if (result.hasErrors()) return "registration";

    model.addAttribute("message", "Registration Success");

    return "regSuccess";
  }

  @ModelAttribute("countries")
  public List<String> initializeCountries() {
    return Arrays.asList(new String[] { "India", "US", "China" });
  }
}
