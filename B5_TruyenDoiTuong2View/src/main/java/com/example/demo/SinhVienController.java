package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

import com.example.demo.SinhVien;

@Controller
public class SinhVienController {
	@GetMapping("/sinhvien")
	public String showSinhVien(Model model) {
		SinhVien sv = new SinhVien(
				"65134116",
				"Nguyễn Huỳnh Tường",
				2005,
				"Nam");
		model.addAttribute("sv", sv);
		return "sinhVienView";
	}
}
