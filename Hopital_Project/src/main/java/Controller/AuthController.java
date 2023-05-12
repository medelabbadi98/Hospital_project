package Controller;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.actuate.autoconfigure.wavefront.WavefrontProperties.Application;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class AuthController {

	 @RequestMapping("/")
	 public String home(Model model) {
		 return "home.html";
	 }
	 @RequestMapping("/SignIn")
	 public void SignIn() {
		 
	 }
	 @RequestMapping("/SignUp")
	 public void SignUp() {
		 
	 }
	 
	 public void checkConnection() {
		 if (1==1) {
			
		}
	 }
}
