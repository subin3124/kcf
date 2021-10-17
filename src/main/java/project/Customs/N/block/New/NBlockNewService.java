package project.Customs.N.block.New;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.Customs.Block.BlockDTO;
import project.Customs.N.block.NblockDTO;

@Service
public class NBlockNewService {

    @Autowired
    NBlockNewDAO nBlockNewDAO;
    public int NewBlock(NblockDTO nblockDTO){
        try{
            nBlockNewDAO.save(nblockDTO);
            return 200;//성공!
        }catch (Exception e){
            return 400;//오류
        }
    }
}
