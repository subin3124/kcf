package project.Company.Register;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import project.Company.CompanyDTO;
import project.Image.ImageService;
//반드시 테스트 해볼것! (테스트 필수 필수 필수)!!!!!
@RestController
@RequestMapping("/company/Register")
public class RegisterController {
    @Autowired
    RegisterService registerService;
    

    @PostMapping("/")
    private int Register(@RequestParam String owner,@RequestParam String name, @RequestParam String region, 
@RequestParam String ownername,@RequestParam String info,@RequestParam String positionX, @RequestParam String positionY, @RequestParam List<MultipartFile> images) throws Exception {
       
     
        CompanyDTO company = new CompanyDTO();
        company.setOwner(owner);
        company.setInfo(info);
        company.setName(name);
        company.setOwnername(ownername);
        company.setRegion(region);
        company.setPositionX(Float.parseFloat(positionX));
        company.setPositionY(Float.parseFloat(positionY));
        
        return registerService.Register(company, images);
    }
}
