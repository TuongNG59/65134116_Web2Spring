package clc65.tuong.qltintuc.Models;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.ToString;

@Entity
@Table(name = "LoaiTinTuc")
@Data
public class LoaiTinTuc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ten")
    private String ten;

    @OneToMany(mappedBy = "loaiTinTuc") 
    @ToString.Exclude 
    private List<TinTuc> danhSachTinTuc;
}
