package thigk2.nguyenhuynhtuong.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "sanpham")
public class SanPham {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String ten;
    private Double gia;
    private String mota;

    @ManyToOne
    @JoinColumn(name = "theloai_id")
    private TheLoaiSanPham theLoai;

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

	public Double getGia() {
		return gia;
	}

	public void setGia(Double gia) {
		this.gia = gia;
	}

	public String getMota() {
		return mota;
	}

	public void setMota(String mota) {
		this.mota = mota;
	}

	public TheLoaiSanPham getTheLoai() {
		return theLoai;
	}

	public void setTheLoai(TheLoaiSanPham theLoai) {
		this.theLoai = theLoai;
	}

	public SanPham() {
		super();
	}

    
}
