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
import lombok.Data;


@Entity
@Table(name = "TinTuc")
@Data
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
    
}