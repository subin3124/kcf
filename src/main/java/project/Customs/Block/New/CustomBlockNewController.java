package project.Customs.Block.New;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.Customs.Block.BlockDTO;

@RestController
@RequestMapping("/Custom/Block/New")
public class CustomBlockNewController {

    @Autowired
    CustomBlockNewService customBlockNewService;

    @PostMapping("/")
    private int NewCustomBlock(BlockDTO blockDTO) {
        return customBlockNewService.NewBlock(blockDTO);

    }

}
