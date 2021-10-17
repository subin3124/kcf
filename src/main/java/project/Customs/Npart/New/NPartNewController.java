package project.Customs.Npart.New;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.Customs.N.block.NblockDTO;
import project.Customs.Npart.NpartDTO;

@RestController
@RequestMapping("/Custom/NPart/New")
public class NPartNewController {

    @Autowired
    NPartNewService nPartNewService;

    @PostMapping("/")
    private int NewCustomBlock(NpartDTO npartDTO) {
        return nPartNewService.NewBlock(npartDTO);

    }

}
