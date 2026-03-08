package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

@Controller
public class BMIController {
	@GetMapping("/bmi")
	public String showForm() {
		return "bmiForm";
	}
	
	@PostMapping("/bmi")
	public String calculateBMI(
			@RequestParam("chieuCao") double chieuCao,
			@RequestParam("canNang") double canNang,
			Model model) {
		
		double bmi = canNang / (chieuCao * chieuCao);
		
		String ketQua;
		
		if(bmi<18.5) {
			ketQua = "Gầy";
		}else if(bmi<25) {
			ketQua = "Bình Thường";
		}else if(bmi<30) {
			ketQua = "Thừa Cân";
		}else {
			ketQua = "Béo Phì";
		}
		
		model.addAttribute("bmi", String.format("%.2f", bmi));
		model.addAttribute("ketqua", ketQua);
		
		return "resultBMI";
	}
	
}
