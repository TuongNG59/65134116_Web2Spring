package thiGK.ntu65134116.NguyenHuynhTuong65134116_fitCMS.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
    
    @GetMapping("/restAPI/page/{id}")
    public Page65134116 getPage(@PathVariable("id") int id) {
    	return pService.getPageById(id);
    }
    
    
    @PostMapping("/restAPI/page")
    public Page65134116 createPage(@RequestBody Page65134116 page) {
        return pService.savePage(page);
    }
    
    
    @DeleteMapping("/restAPI/page/{id}")
    public String deletePage(@PathVariable int id) {
        pService.deletePage(id);
        return "Xoá thành công";
    }
}
