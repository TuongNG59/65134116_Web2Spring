package clc65.tuong.qltintuc.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import clc65.tuong.qltintuc.Services.TinTucService;

@Controller
public class PublicController {

    @Autowired
    private TinTucService tinTucService;

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("dsTinTuc", tinTucService.getAll());
        return "user/home"; 
    }
}
