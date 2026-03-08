package com.example.demo;

public class SinhVien {
    private String mssv;
    private String hoten;
    private int namsinh;
    private String gioitinh;
    
	public SinhVien(String mssv, String hoten, int namsinh, String gioitinh) {
		this.mssv = mssv;
		this.hoten = hoten;
		this.namsinh = namsinh;
		this.gioitinh = gioitinh;
	}

	public String getMssv() {
		return mssv;
	}

	public void setMssv(String mssv) {
		this.mssv = mssv;
	}

	public String getHoten() {
		return hoten;
	}

	public void setHoten(String hoten) {
		this.hoten = hoten;
	}

	public int getNamsinh() {
		return namsinh;
	}

	public void setNamsinh(int namsinh) {
		this.namsinh = namsinh;
	}

	public String getGioitinh() {
		return gioitinh;
	}

	public void setGioitinh(String gioitinh) {
		this.gioitinh = gioitinh;
	}
    
    
}
