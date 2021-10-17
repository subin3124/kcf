package project.Customs.Sche.find;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import project.Customs.Sche.ScheDTO;

import java.util.List;

@RestController
@RequestMapping("/Custom/Sche/Find")
public class CustomScheFindController {

    @Autowired
    CustomScheFindService customScheFindService;

    @GetMapping("/")
    private List<ScheDTO> findScheByCompanyId(@RequestParam long id){
              return customScheFindService.findScheByComapnyId(id);
    }
}
