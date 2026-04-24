package thigk2.nguyenhuynhtuong.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import thigk2.nguyenhuynhtuong.Models.SanPham;

public interface SanPhamRepository extends JpaRepository<SanPham, Long> {
    List<SanPham> findByTheLoaiId(Long theLoaiId);
}
