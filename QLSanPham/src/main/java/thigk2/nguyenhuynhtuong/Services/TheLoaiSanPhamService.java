package thigk2.nguyenhuynhtuong.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import thigk2.nguyenhuynhtuong.Models.TheLoaiSanPham;
import thigk2.nguyenhuynhtuong.Repositories.TheLoaiSanPhamRepository;

@Service
public class TheLoaiSanPhamService {
    @Autowired
    private TheLoaiSanPhamRepository theLoaiRepo;

    public List<TheLoaiSanPham> getAll() {
        return theLoaiRepo.findAll();
    }
}
