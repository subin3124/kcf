package project.Customs.N.block.New;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.Customs.Block.BlockDTO;
import project.Customs.N.block.NblockDTO;

@RestController
@RequestMapping("/Custom/Nblock/New")
public class NBlockNewController {

    @Autowired
    NBlockNewService nBlockNewService;

    @PostMapping("/")
    private int NewCustomBlock(NblockDTO nblockDTO) {
        return nBlockNewService.NewBlock(nblockDTO);

    }

}
