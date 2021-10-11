package project.Custom.ViewCustomDetails;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.Custom.CustomDTO;

@Service
public class ViewCustomDetailService {
    
    @Autowired
    CustomDetailsDAO customDetailsDAO;
    
    public CustomDTO findCustomById(long id){
        return customDetailsDAO.findCustomDTOById(id);
    }
    public CustomDTO findCustomByOrder(long orderid){
        return customDetailsDAO.findCustomDTOByOrderfk(orderid);
    }
}
