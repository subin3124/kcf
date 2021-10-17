package project.Customs.Block.Find;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import project.Customs.Block.BlockDTO;

import java.util.List;

@RestController
@RequestMapping("/Custom/Block/Find")
public class CustomBlockFindController {

    @Autowired
    CustomBlockFindService service;

    @GetMapping("/company/")
    private List<BlockDTO> findByCompany(@RequestParam long id){
       return service.FindCustomBlockByCompany(id);
    }
    @GetMapping("/sche/") List<BlockDTO> findBySche(@RequestParam long id){
        return service.FindCustomBlockByCompany(id);
    }



}
