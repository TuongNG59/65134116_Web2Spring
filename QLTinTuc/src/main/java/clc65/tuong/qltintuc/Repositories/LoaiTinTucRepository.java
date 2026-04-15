package clc65.tuong.qltintuc.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import clc65.tuong.qltintuc.Models.LoaiTinTuc;

@Repository
public interface LoaiTinTucRepository extends JpaRepository<LoaiTinTuc, Long> {
	
}
