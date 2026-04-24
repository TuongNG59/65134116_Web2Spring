package clc65.tuong.qltintuc.Models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;


@Entity
@Table(name = "LoaiTinTuc")
public class LoaiTinTuc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ten")
    private String ten;

    @OneToMany(mappedBy = "loaiTinTuc") 
    @JsonIgnore
    private List<TinTuc> danhSachTinTuc;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public List<TinTuc> getDanhSachTinTuc() {
		return danhSachTinTuc;
	}

	public void setDanhSachTinTuc(List<TinTuc> danhSachTinTuc) {
		this.danhSachTinTuc = danhSachTinTuc;
	}

	public LoaiTinTuc() {
		super();
	}
    
    
}
