package project.Customs.N.block.Find;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.Customs.Block.BlockDTO;
import project.Customs.N.block.NblockDTO;

import java.util.List;

@Service
public class NblockFindService {

    @Autowired
    NblockFindDAO nblockFindDAO;


    public List<NblockDTO> FindCustomBlockBypartid(long partid){
        return nblockFindDAO.findNblockDTOSByPartid(partid);
    }
}
