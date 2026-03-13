package thiGK.ntu65134116.NguyenHuynhTuong65134116_fitCMS.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import thiGK.ntu65134116.NguyenHuynhTuong65134116_fitCMS.models.Page65134116;
import thiGK.ntu65134116.NguyenHuynhTuong65134116_fitCMS.models.Post65134116;


@Controller
public class HomeController {
	
    ArrayList<Page65134116> dsTrang = new ArrayList<Page65134116>();
    ArrayList<Post65134116> dsPost = new ArrayList<Post65134116>();
    
    public HomeController(){

        dsTrang.add(new Page65134116(0,"Home","home","Trang chủ",0));
        dsTrang.add(new Page65134116(1,"About","about","Giới thiệu",0));
        dsTrang.add(new Page65134116(2,"Contact","contact","Liên hệ",0));

        dsPost.add(new Post65134116(0,"Java","Học Java cơ bản",001));
        dsPost.add(new Post65134116(1,"Spring","Học Spring Boot",001));
        dsPost.add(new Post65134116(2,"Thymeleaf","Template engine",002));

    }
    
    
    @GetMapping("/")
	public String Home() {
		return "Home";
	}
    
    
    @GetMapping("/page/all")
    public String getAllPage(ModelMap m){

        m.addAttribute("lstPages", dsTrang);

        return "allpages";
    }
    
    @GetMapping("/page/new")
    	public String addPageForm(ModelMap m) {
    		
    		m.addAttribute("page", new Page65134116());
    		
    		return "newpage";
    }
    
    @PostMapping("/page/new")
    public String saveNewPage(@ModelAttribute("page") Page65134116 newPage) {

        dsTrang.add(newPage);

        return "redirect:/page/all";
    }
}


