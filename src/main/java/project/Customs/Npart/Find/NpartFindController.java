package project.Customs.Npart.Find;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import project.Customs.Block.BlockDTO;
import project.Customs.Npart.NpartDTO;

import java.util.List;

@RestController
@RequestMapping("/Custom/Npart/Find")
public class NpartFindController {

    @Autowired
    NpartFindService service;

    @GetMapping("/")
    private List<NpartDTO> findBySche(@RequestParam long id){
       return service.FindCustomBlockBySche(id);
    }




}
