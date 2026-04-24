package thigk2.nguyenhuynhtuong.Repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import thigk2.nguyenhuynhtuong.Models.NguoiDung;

public interface NguoiDungRepository extends JpaRepository<NguoiDung, Long> {
    Optional<NguoiDung> findByUsername(String username);
}
