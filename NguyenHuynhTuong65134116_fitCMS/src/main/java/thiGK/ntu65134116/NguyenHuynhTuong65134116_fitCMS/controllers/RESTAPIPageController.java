package thiGK.ntu65134116.NguyenHuynhTuong65134116_fitCMS.controllers;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import thiGK.ntu65134116.NguyenHuynhTuong65134116_fitCMS.models.Page65134116;

@RestController
public class RESTAPIPageController {

    ArrayList<Page65134116> dsTrang = new ArrayList<>();

    public RESTAPIPageController() {
        dsTrang.add(new Page65134116(0,"TenTrang","TuKhoa","Noidung",0));
    }

    @GetMapping("/api/page")
    public ArrayList<Page65134116> getAllPage() {
        return dsTrang;
    }
}
