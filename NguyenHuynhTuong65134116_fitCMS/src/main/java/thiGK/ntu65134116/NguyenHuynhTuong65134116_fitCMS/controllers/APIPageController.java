package thiGK.ntu65134116.NguyenHuynhTuong65134116_fitCMS.controllers;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import thiGK.ntu65134116.NguyenHuynhTuong65134116_fitCMS.models.Page65134116;

@RestController
public class APIPageController {
	ArrayList<Page65134116> dsTrang = new ArrayList<Page65134116>();
	public APIPageController() {
		Page65134116 p1 = new Page65134116(0, "GioiThieu", "nht", "Noi dung", 0);
		Page65134116 p2 = new Page65134116(1, "TimKiem", "nht", "Noi dung", 0);
		Page65134116 p3 = new Page65134116(2, "HoTro", "nht", "Noi dung", 0);
		
		dsTrang.add(p1);
		dsTrang.add(p2);
		dsTrang.add(p3);
	}
	
	@GetMapping("/api/pages")
	public ArrayList<Page65134116> getAllPages(){
			return dsTrang;
	}
	
	@GetMapping("/api/page/{id}")
	public Page65134116 getOneOBJ(@PathVariable long id) {
		for(Page65134116 p:dsTrang)
			if(p.getId()==id) {
				return p;
			}
		return null;
	}
	
	
	@DeleteMapping("/api/pages/del/{id}")
	public boolean pageDelete(@PathVariable int id) {
		for(Page65134116 p: dsTrang) {
			if(p.getId()==id) {
				boolean kq = dsTrang.remove(p);
				return kq;
			}
		}
		return false;
	}
	
	@PostMapping("/api/pages/add")
	public boolean pageAdd(@RequestBody Page65134116 entity) {
		boolean kqThemDuoc = dsTrang.add(entity);
		return kqThemDuoc;
	}
	
	@PutMapping("/api/pages/update/{id}")
	public boolean pageUpdate(@PathVariable int id, @RequestBody Page65134116 entity) {
		for(Page65134116 p: dsTrang) {
			if(p.getId()==id) {
				dsTrang.remove(p);
				dsTrang.add(entity);
				return true;
			}
		}
		return false;
	}
}
