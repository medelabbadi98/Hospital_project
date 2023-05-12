package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthController {

	 @RequestMapping("/")
	 public String home(Model model) {
		 return "index.html";
	 }
}
