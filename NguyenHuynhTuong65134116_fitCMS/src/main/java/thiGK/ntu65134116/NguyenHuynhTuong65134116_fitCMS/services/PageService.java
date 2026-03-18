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
	List<Page65134116> getAllPage(){
		return pRepos.findAll();
	}
}
