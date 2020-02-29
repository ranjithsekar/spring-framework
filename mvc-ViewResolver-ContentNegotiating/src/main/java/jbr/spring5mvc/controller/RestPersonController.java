package jbr.spring5mvc.controller;

import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jbr.spring5mvc.model.Person;
import jbr.spring5mvc.model.Persons;

@Controller
public class RestPersonController {

  @RequestMapping("/rest-persons")
  @ResponseBody
  public Persons getPersons() {
    Persons pers = new Persons();
    pers.addPersons(Arrays.asList(new Person("kumar")));

    return pers;
  }
}
