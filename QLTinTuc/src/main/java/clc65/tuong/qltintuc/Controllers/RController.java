package clc65.tuong.qltintuc.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import clc65.tuong.qltintuc.Models.LoaiTinTuc;
import clc65.tuong.qltintuc.Models.TinTuc;
import clc65.tuong.qltintuc.Services.LoaiTinTucService;
import clc65.tuong.qltintuc.Services.TinTucService;

@RestController
public class RController {

    @Autowired
    private TinTucService tinTucService;

    @Autowired
    private LoaiTinTucService loaiTinTucService;

    @GetMapping("/api/alltintuc")
    public List<TinTuc> getAllTinTuc() {
        return tinTucService.getAll();
    }
    
    @GetMapping("/api/allloaitintuc")
    public List<LoaiTinTuc> getAllLoaiTinTuc() {
        return loaiTinTucService.getAll();
    }
}
