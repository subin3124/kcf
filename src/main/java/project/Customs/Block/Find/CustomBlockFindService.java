package project.Customs.Block.Find;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.Customs.Block.BlockDTO;

import java.util.List;

@Service
public class CustomBlockFindService {

    @Autowired
    CustomBlockFindDAO customBlockFindDAO;

    public List<BlockDTO> FindCustomBlockBySche(long scheid){
        return customBlockFindDAO.findBlockDTOSByScheid(scheid);
    }
    public List<BlockDTO> FindCustomBlockByCompany(long companyid) {
        return customBlockFindDAO.findBlockDTOSByCompany(companyid);
    }
}
