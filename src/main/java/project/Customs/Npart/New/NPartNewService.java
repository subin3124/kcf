package project.Customs.Npart.New;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.Customs.N.block.NblockDTO;
import project.Customs.Npart.NpartDTO;

@Service
public class NPartNewService {

    @Autowired
    NPartNewDAO nPartNewDAO;
    public int NewBlock(NpartDTO npartDTO){
        try{
            nPartNewDAO.save(npartDTO);
            return 200;//성공!
        }catch (Exception e){
            return 400;//오류
        }
    }
}
