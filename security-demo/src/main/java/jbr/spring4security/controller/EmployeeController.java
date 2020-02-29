package jbr.spring4security.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class EmployeeController {

  @GetMapping
  public String homePage(ModelMap model) {
    model.addAttribute("greeting", "Welcome to Home Page!!!");

    return "welcome";
  }

  @RequestMapping(value = "/manager", method = RequestMethod.GET)
  public String adminPage(ModelMap model) {
    model.addAttribute("user", getPrincipal());

    return "manager";
  }

  @RequestMapping(value = "/leave_approval", method = RequestMethod.GET)
  public String leavePage(ModelMap model) {
    model.addAttribute("user", getPrincipal());

    return "leave_approval";
  }

  @RequestMapping(value = "/employee", method = RequestMethod.GET)
  public String dbaPage(ModelMap model) {
    model.addAttribute("user", getPrincipal());

    return "employee";
  }

  @RequestMapping(value = "/logout", method = RequestMethod.GET)
  public String logoutPage(HttpServletRequest request, HttpServletResponse response) {
    Authentication authentication = SecurityContextHolder.getContext()
        .getAuthentication();

    if (null != authentication) {
      new SecurityContextLogoutHandler().logout(request, response, authentication);
    }

    return "welcome";
  }

  @RequestMapping(value = "/access_denied", method = RequestMethod.GET)
  public String accessDeniedPage(ModelMap model) {
    model.addAttribute("user", getPrincipal());

    return "accessDenied";
  }

  private String getPrincipal() {
    Object principal = SecurityContextHolder.getContext()
        .getAuthentication()
        .getPrincipal();

    return principal instanceof UserDetails ? ((UserDetails) principal).getUsername() : principal.toString();
  }
}
