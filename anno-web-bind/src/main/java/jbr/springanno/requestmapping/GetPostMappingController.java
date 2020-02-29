package jbr.springanno.requestmapping;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jbr.springanno.model.Product;

@Controller
@RequestMapping("/get-post-mapping/*")
public class GetPostMappingController {

  @GetMapping("add")
  public String add(Model model) {
    System.out.println("add method");
    model.addAttribute("message", " Product Added!!");

    return "product";
  }

  @GetMapping({ "delete", "remove" })
  public String delete(Model model) {
    System.out.println("delete method");
    model.addAttribute("message", "Product Removed!!");

    return "product";
  }

  @GetMapping("add-product")
  public String addProduct(Model model) {
    System.out.println("addProduct method");
    model.addAttribute("product", new Product());

    return "add-product";
  }

  @PostMapping("add-product-process")
  public String addProductProcess(@ModelAttribute("product") Product prod, Model model) {
    System.out.println("addProductProcess method");
    model.addAttribute("product", prod);

    return "add-product-success";
  }

}
