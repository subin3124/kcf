package project.Customs.Sche.New;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import project.Customs.Sche.ScheDTO;

import java.util.List;

@RestController
@RequestMapping("/Custom/New")
public class CustomScheNewController {

    @Autowired
    CustomScheNewService customScheNewService;

    @PostMapping("/")
    private void NewCustom(@RequestParam long companyid, @RequestParam int greencompare, @RequestParam int greenpara, @RequestParam String image, @RequestParam long orderid, @RequestParam float height, @RequestParam float weight, @RequestParam String name, @RequestParam List<MultipartFile> files){

        ScheDTO scheDTO = new ScheDTO();
        scheDTO.setCompany();
        scheDTO.setGreencompare();
        scheDTO.setGreenpara();
        scheDTO.setImage();
        scheDTO.setOrderid();
        scheDTO.setHeight();
        scheDTO.setWidth();
        scheDTO.setName();
    }

}
