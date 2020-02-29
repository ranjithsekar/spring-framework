package jbr.springanno.requestmapping;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/request-mapping/*")
public class RequestMappingController {

  @RequestMapping("add")
  public String add(Model model) {
    System.out.println("add method");
    model.addAttribute("message", " Product Added!!");

    return "product";
  }

  @RequestMapping({ "delete", "remove" })
  public String delete(Model model) {
    System.out.println("delete method");
    model.addAttribute("message", "Product Removed!!");

    return "product";
  }

}
