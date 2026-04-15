package clc65.tuong.qltintuc.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import clc65.tuong.qltintuc.Models.TinTuc;
import clc65.tuong.qltintuc.Repositories.TinTucRepository;

@Service
public class TinTucService {

    @Autowired
    private TinTucRepository tinTucRepo;

    public List<TinTuc> getAll() {
        return tinTucRepo.findAll();
    }

    public TinTuc getById(Long id) {
        return tinTucRepo.findById(id).orElse(null);
    }

    public void save(TinTuc tin) {
        tinTucRepo.save(tin);
    }

    public void delete(Long id) {
        tinTucRepo.deleteById(id);
    }
}
