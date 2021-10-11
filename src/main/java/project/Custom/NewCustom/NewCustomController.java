package project.Custom.NewCustom;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import project.Custom.CustomDTO;

@RestController
@RequestMapping("/Custom/New")
public class NewCustomController {

    @Autowired
    NewCustomService newCustomService;
    
    @PostMapping("/")
    private int NewCustom(@RequestParam long company, @RequestParam String name, @RequestParam String kinds, @RequestParam String userfk, @RequestParam long orderfk, @RequestParam String customImage, @RequestParam List<MultipartFile> images){
    CustomDTO customDto = new CustomDTO();
        customDto.setName(name);
        customDto.setImage(customImage);
        customDto.setCompanyfk(company);
        customDto.setKinds(kinds);
        customDto.setOrderfk(orderfk);
        customDto.setUserfk(userfk);
       return newCustomService.NewCustom(customDto,images);
    }
}
