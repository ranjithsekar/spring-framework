package jbr.springmvc.shopcart.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.support.SessionStatus;

import jbr.springmvc.shopcart.model.Product;
import jbr.springmvc.shopcart.util.ProductCategory;

@Controller
@RequestMapping("products")
public class ProductController {

  @Autowired
  @Qualifier("productList")
  public Map<ProductCategory, List<String>> allProducts;

  private ProductValidator productValidator;

  public ProductController(ProductValidator productValidator) {
    this.productValidator = productValidator;
  }

  @GetMapping
  public String productAll(Model model) {
    model.addAttribute("products", allProducts);

    return "product";
  }

  @GetMapping("{productCategory}")
  public String productByCategory(@PathVariable("productCategory") String prodCategory, Model model) {
    List<String> prods = allProducts.get(ProductCategory.valueOf(prodCategory.toUpperCase()));
    model.addAttribute("products", prods);

    return "product";
  }

  @GetMapping("product")
  public String productByName(@RequestParam(value = "name", required = false) String name,
      @RequestParam(value = "category", required = false) String category, Model model) {
    System.out.println("productByName : " + name);
    model.addAttribute("name", name);
    model.addAttribute("category", category);

    return "product";
  }

  @GetMapping("add")
  public String add(Model model) {
    model.addAttribute("product", new Product());

    return "product-add";
  }

  @PostMapping(value = "product-add")
  public String prodAdd(@ModelAttribute("product") @Validated Product product, BindingResult result, Model model, SessionStatus status) {
    System.out.println("prodAdd : " + product.getName());

    if (result.hasErrors()) {
      return "product-add";
    }

    model.addAttribute("name", product.getName());
    model.addAttribute("category", product.getCategory());

    return "product";
  }

  @ModelAttribute("prodCategories")
  public List<String> prodCategories() {
    return Arrays.asList(ProductCategory.MOBILE.name(), ProductCategory.HEADPHONE.name());
  }

  @InitBinder
  public void initBinder(WebDataBinder binder) {
    binder.setValidator(productValidator);
  }
}
