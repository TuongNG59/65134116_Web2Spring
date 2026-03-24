package thiGK.ntu65134116.NguyenHuynhTuong65134116_fitCMS.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import thiGK.ntu65134116.NguyenHuynhTuong65134116_fitCMS.models.Post65134116;
import thiGK.ntu65134116.NguyenHuynhTuong65134116_fitCMS.repositories.PostRepository;

@Service
public class PostService {

    @Autowired
    PostRepository pRepos;

    public List<Post65134116> getAllPost() {
        return pRepos.findAll();
    }

    public Post65134116 getPostById(int id) {
        return pRepos.findById(id).orElse(null);
    }

}