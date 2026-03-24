package thiGK.ntu65134116.NguyenHuynhTuong65134116_fitCMS.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import thiGK.ntu65134116.NguyenHuynhTuong65134116_fitCMS.models.Page65134116;
import thiGK.ntu65134116.NguyenHuynhTuong65134116_fitCMS.repositories.PageRepository;

@Service
public class PageService {
	@Autowired
	PageRepository pRepos;
	public List<Page65134116> getAllPage(){
		return pRepos.findAll();
	}
	
	public Page65134116 getPageById(int id) {
		return pRepos.getById(id);
//		return pRepos.findById(id).orElse(null);
	}
	
	public Page65134116 savePage(Page65134116 page) {
	    return pRepos.save(page);
	}
	
	public void deletePage(int id) {
	    if (!pRepos.existsById(id)) {
	        throw new RuntimeException("ID không tồn tại");
	    }
	    pRepos.deleteById(id);
	}
}
