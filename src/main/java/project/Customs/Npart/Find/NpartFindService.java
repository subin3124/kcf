package project.Customs.Npart.Find;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.Customs.Block.BlockDTO;
import project.Customs.Npart.NpartDTO;

import java.util.List;

@Service
public class NpartFindService {

    @Autowired
    NpartFindDAO npartFindDAO;

    public List<NpartDTO> FindCustomBlockBySche(long scheid){
        return npartFindDAO.findNpartDTOSByScheid(scheid);
    }
}
