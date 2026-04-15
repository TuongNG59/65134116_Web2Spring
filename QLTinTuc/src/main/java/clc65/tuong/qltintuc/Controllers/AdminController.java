package clc65.tuong.qltintuc.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import clc65.tuong.qltintuc.Models.TinTuc;
import clc65.tuong.qltintuc.Services.LoaiTinTucService;
import clc65.tuong.qltintuc.Services.TinTucService;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private TinTucService tinTucService;

    @Autowired
    private LoaiTinTucService loaiTinTucService;

    @GetMapping("/tintuc")
    public String index(Model model) {
        model.addAttribute("dsTinTuc", tinTucService.getAll());
        return "admin/index";
    }

    @GetMapping("/tintuc/them")
    public String add(Model model) {
        model.addAttribute("tinTuc", new TinTuc());
        model.addAttribute("dsLoaiTin", loaiTinTucService.getAll());
        return "admin/add";
    }
    
    @PostMapping("/tintuc/save")
    public String save(@ModelAttribute("tinTuc") TinTuc tinTuc) {
        tinTucService.save(tinTuc);
        return "redirect:/admin/tintuc";
    }
    
    @GetMapping("/tintuc/xoa/{id}")
    public String delete(@PathVariable("id") Long id) {
        tinTucService.delete(id);
        return "redirect:/admin/tintuc";
    }
    
    @GetMapping("/tintuc/sua/{id}")
    public String edit(@PathVariable("id") Long id, Model model) {
        TinTuc tinTuc = tinTucService.getById(id);
        
        model.addAttribute("tinTuc", tinTuc);
        model.addAttribute("dsLoaiTin", loaiTinTucService.getAll());
        
        return "admin/edit";
    }
}
