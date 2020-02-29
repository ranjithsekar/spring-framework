package jbr.springmvc.shopcart.controller;

import java.util.Arrays;
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import jbr.springmvc.shopcart.model.User;

@Controller
public class RegistrationController {

  @GetMapping
  public String show(Model model) {
    model.addAttribute("user", new User());

    return "registration";
  }

  @PostMapping(value = "registration-process")
  public String registrationProcess(@Valid @ModelAttribute("user") User user, BindingResult result, Model model) {
    System.out.println("registrationProcess");
    if (result.hasErrors()) return "registration";
    model.addAttribute("message", "Welcome: " + user.getUsername());

    return "redirect:product";
  }

  @ModelAttribute("countries")
  public List<String> countries() {
    return Arrays.asList(new String[] { "India", "US", "China" });
  }

  @ModelAttribute("languages")
  public List<String> languages() {
    return Arrays.asList(new String[] { "Tamil", "English", "Hindi" });
  }

  @ModelAttribute("genders")
  public List<String> genders() {
    return Arrays.asList(new String[] { "Male", "Female" });
  }

  @ModelAttribute("married")
  public List<String> married() {
    return Arrays.asList(new String[] { "Single", "Married" });
  }
}
