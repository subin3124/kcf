package project.Customs.N.block.Find;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import project.Customs.Block.BlockDTO;
import project.Customs.N.block.NblockDTO;

import java.util.List;

@RestController
@RequestMapping("/Custom/Nblock/Find")
public class NblockFindController {

    @Autowired
    NblockFindService service;

    @GetMapping("/")
    private List<NblockDTO> findByCompany(@RequestParam long id){
       return service.FindCustomBlockBypartid(id);
    }




}
