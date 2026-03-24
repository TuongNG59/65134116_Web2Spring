package thiGK.ntu65134116.NguyenHuynhTuong65134116_fitCMS.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import thiGK.ntu65134116.NguyenHuynhTuong65134116_fitCMS.models.Post65134116;
import thiGK.ntu65134116.NguyenHuynhTuong65134116_fitCMS.services.PostService;

@RestController
public class RESAPIPostController {
	@Autowired
    PostService pService;

    @GetMapping("/restAPI/post/all")
    public List<Post65134116> getAllPost() {
        return pService.getAllPost();
    }

    @GetMapping("/restAPI/post/{id}")
    public Post65134116 getPost(@PathVariable int id) {
        return pService.getPostById(id);
    }
}
