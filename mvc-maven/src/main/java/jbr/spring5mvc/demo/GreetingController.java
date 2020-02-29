package jbr.spring5mvc.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class GreetingController {

	@RequestMapping(value = "/morning", method = RequestMethod.GET)
	public String morning(Model model) {
		model.addAttribute("message", "Good Morning!!!");

		return "greeting";
	}

	@RequestMapping(value = "/evening", method = RequestMethod.GET)
	public String evening(Model model) {
		model.addAttribute("message", "Good Evening!!!");

		return "greeting";
	}

}
