package project.Customs.Block.New;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.Customs.Block.BlockDTO;

@Service
public class CustomBlockNewService {

    @Autowired
    CustomBlockNewDAO customBlockNewDAO;

    public int NewBlock(BlockDTO blockDTO){
        try{
            customBlockNewDAO.save(blockDTO);
            return 200;//성공!
        }catch (Exception e){
            return 400;//오류
        }
    }
}
