package project.Customs.Sche.New;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.Customs.Sche.ScheDTO;

@Service
public class CustomScheNewService {

    @Autowired
    CustomScheNewDAO scheNewDAO;

    public void NewSche(ScheDTO scheDTO) {
        scheNewDAO.save(scheDTO);
    }
}
