package thigk2.nguyenhuynhtuong.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import thigk2.nguyenhuynhtuong.Models.SanPham;
import thigk2.nguyenhuynhtuong.Models.TheLoaiSanPham;
import thigk2.nguyenhuynhtuong.Services.SanPhamService;
import thigk2.nguyenhuynhtuong.Services.TheLoaiSanPhamService;

@RestController
@RequestMapping("/api")
public class RController {

    @Autowired
    private SanPhamService sanPhamService;

    @Autowired
    private TheLoaiSanPhamService theLoaiService;

    @GetMapping("/theloai")
    public List<TheLoaiSanPham> getAllTheLoai() {
        return theLoaiService.getAll();
    }

    @GetMapping("/sanpham/theloai/{id}")
    public List<SanPham> getByTheLoai(@PathVariable("id") Long id) {
        return sanPhamService.getByTheLoai(id);
    }
}
