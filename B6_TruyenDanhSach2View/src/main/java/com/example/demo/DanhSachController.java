package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

import com.example.demo.SinhVien;

import java.util.ArrayList;
import java.util.List;

@Controller
public class DanhSachController {
	@GetMapping("/danhsach")
	public String showList(Model model) {
		List<SinhVien> list = new ArrayList<>();
        list.add(new SinhVien("65134116", "Nguyễn Huỳnh Tường", 2005, "Nam"));
        list.add(new SinhVien("65133979", "Huỳnh Thanh Trình", 2005, "Nam"));
        list.add(new SinhVien("65131111", "Nguyễn Hữu Trọng", 2005, "Nam"));
        list.add(new SinhVien("65132222", "Nguyễn Gia Khiêm", 2005, "Nam"));
        
        model.addAttribute("listsv", list);
        return "danhSachView";
	}
}
