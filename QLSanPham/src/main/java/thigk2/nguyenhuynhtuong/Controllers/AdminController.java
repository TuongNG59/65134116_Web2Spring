package thigk2.nguyenhuynhtuong.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import thigk2.nguyenhuynhtuong.Models.SanPham;
import thigk2.nguyenhuynhtuong.Services.SanPhamService;
import thigk2.nguyenhuynhtuong.Services.TheLoaiSanPhamService;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private SanPhamService sanPhamService;

    @Autowired
    private TheLoaiSanPhamService theLoaiService;

    @GetMapping("/products")
    public String index(Model model) {
        model.addAttribute("listSP", sanPhamService.getAll());
        return "admin/index"; 
    }

    @GetMapping("/products/add")
    public String addForm(Model model) {
        model.addAttribute("sp", new SanPham());
        model.addAttribute("listLoai", theLoaiService.getAll());
        model.addAttribute("title", "Thêm Sản phẩm Mới"); 
        return "admin/form";
    }

    @GetMapping("/products/edit/{id}")
    public String editForm(@PathVariable Long id, Model model) {
        SanPham sp = sanPhamService.getById(id);
        model.addAttribute("sp", sp);
        model.addAttribute("listLoai", theLoaiService.getAll());
        model.addAttribute("title", "Cập nhật Sản phẩm"); 
        return "admin/form";
    }

    @PostMapping("/products/save")
    public String save(@ModelAttribute("sp") SanPham sp) {
        sanPhamService.save(sp); 
        return "redirect:/admin/products";
    }

    @GetMapping("/products/delete/{id}")
    public String delete(@PathVariable Long id) {
        sanPhamService.delete(id);
        return "redirect:/admin/products";
    }
}
