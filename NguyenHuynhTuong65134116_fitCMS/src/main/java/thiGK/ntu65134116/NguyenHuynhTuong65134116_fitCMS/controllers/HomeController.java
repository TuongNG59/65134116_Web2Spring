package thiGK.ntu65134116.NguyenHuynhTuong65134116_fitCMS.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class HomeController {
	@GetMapping("/")
	public String Home() {
		return "Home";
	}
}
