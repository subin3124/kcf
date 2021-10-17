package project.Customs.Sche.find;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.Customs.Sche.ScheDTO;

import java.util.List;

@Service
public class CustomScheFindService {

    @Autowired
    CustomScheFindDAO customScheFindDAO;

    public List<ScheDTO> findScheByComapnyId(long id){
        return customScheFindDAO.findScheDTOSByCompany(id);
    }
}
