package myspring.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TemplateController {
	@GetMapping("/main")
	public String main(Model model) {
		model.addAttribute("name", "JSP");
		//이거 앞에 / 안붙이면 경로 에러남 붙여야함 jsp로 할떄는..."
		return "/main";
	}
}
