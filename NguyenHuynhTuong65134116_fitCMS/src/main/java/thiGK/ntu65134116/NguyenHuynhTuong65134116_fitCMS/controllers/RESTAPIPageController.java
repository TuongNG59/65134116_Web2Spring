package thiGK.ntu65134116.NguyenHuynhTuong65134116_fitCMS.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import thiGK.ntu65134116.NguyenHuynhTuong65134116_fitCMS.models.Page65134116;
import thiGK.ntu65134116.NguyenHuynhTuong65134116_fitCMS.services.PageService;

@RestController
public class RESTAPIPageController {
	
	@Autowired
    PageService pService;
	
    ArrayList<Page65134116> dsTrang = new ArrayList<>();

    @GetMapping("/restAPI/page/all")
    public List<Page65134116> getALLPage(){
    	List<Page65134116> dsTrang = new ArrayList<Page65134116>();
    	
    	dsTrang = pService.getAllPage();
    	return dsTrang;
    }
    
    
}
