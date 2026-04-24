package thigk2.nguyenhuynhtuong.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import thigk2.nguyenhuynhtuong.Models.NguoiDung;
import thigk2.nguyenhuynhtuong.Repositories.NguoiDungRepository;

@Service
public class NguoiDungService {
    @Autowired
    private NguoiDungRepository nguoiDungRepo;

    public NguoiDung findByUsername(String username) {
        return nguoiDungRepo.findByUsername(username).orElse(null);
    }
}
