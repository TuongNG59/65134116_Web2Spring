package clc65.tuong.qltintuc.Models;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table(name = "TinTuc")
public class TinTuc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "tieude")
    private String tieude;

    @Column(name = "noidung", columnDefinition = "TEXT")
    private String noidung;

    @Column(name = "ngaydang")
    private LocalDateTime ngaydang = LocalDateTime.now();

    @ManyToOne
    @JoinColumn(name = "id_loaitintuc")
    private LoaiTinTuc loaiTinTuc;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTieude() {
		return tieude;
	}

	public void setTieude(String tieude) {
		this.tieude = tieude;
	}

	public String getNoidung() {
		return noidung;
	}

	public void setNoidung(String noidung) {
		this.noidung = noidung;
	}

	public LocalDateTime getNgaydang() {
		return ngaydang;
	}

	public void setNgaydang(LocalDateTime ngaydang) {
		this.ngaydang = ngaydang;
	}

	public LoaiTinTuc getLoaiTinTuc() {
		return loaiTinTuc;
	}

	public void setLoaiTinTuc(LoaiTinTuc loaiTinTuc) {
		this.loaiTinTuc = loaiTinTuc;
	}

	public TinTuc() {
		super();
	}

    
}