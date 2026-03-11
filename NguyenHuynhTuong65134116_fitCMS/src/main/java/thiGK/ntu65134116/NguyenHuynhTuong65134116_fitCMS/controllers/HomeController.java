package thiGK.ntu65134116.NguyenHuynhTuong65134116_fitCMS.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import thiGK.ntu65134116.NguyenHuynhTuong65134116_fitCMS.models.Page65134116;
import thiGK.ntu65134116.NguyenHuynhTuong65134116_fitCMS.models.Post65134116;


@Controller
public class HomeController {
	
    ArrayList<Page65134116> dsTrang = new ArrayList<Page65134116>();
    ArrayList<Post65134116> dsPost = new ArrayList<Post65134116>();
    
	@GetMapping("/")
	public String Home() {
		return "Home";
	}
	
    public HomeController(){

        dsTrang.add(new Page65134116(001,"Home","home","Trang chủ",0));
        dsTrang.add(new Page65134116(002,"About","about","Giới thiệu",0));
        dsTrang.add(new Page65134116(003,"Contact","contact","Liên hệ",0));

        dsPost.add(new Post65134116(01,"Java","Học Java cơ bản",001));
        dsPost.add(new Post65134116(02,"Spring","Học Spring Boot",001));
        dsPost.add(new Post65134116(03,"Thymeleaf","Template engine",002));

    }

}


