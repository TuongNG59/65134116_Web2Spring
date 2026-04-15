package clc65.tuong.qltintuc.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import clc65.tuong.qltintuc.Models.LoaiTinTuc;
import clc65.tuong.qltintuc.Repositories.LoaiTinTucRepository;

@Service
public class LoaiTinTucService {

    @Autowired
    private LoaiTinTucRepository loaiTinTucRepo;

    public List<LoaiTinTuc> getAll() {
        return loaiTinTucRepo.findAll();
    }
}
