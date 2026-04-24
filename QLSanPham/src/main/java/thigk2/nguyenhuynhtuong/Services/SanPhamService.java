package thigk2.nguyenhuynhtuong.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import thigk2.nguyenhuynhtuong.Models.SanPham;
import thigk2.nguyenhuynhtuong.Repositories.SanPhamRepository;

@Service
public class SanPhamService {
    @Autowired
    private SanPhamRepository sanPhamRepo;

    public List<SanPham> getAll() {
        return sanPhamRepo.findAll();
    }

    public List<SanPham> getByTheLoai(Long loaiId) {
        return sanPhamRepo.findByTheLoaiId(loaiId);
    }

    public SanPham getById(Long id) {
        return sanPhamRepo.findById(id).orElse(null);
    }
    
    public void save(SanPham sp) {
        sanPhamRepo.save(sp);
    }

    public void delete(Long id) {
        sanPhamRepo.deleteById(id);
    }
}
