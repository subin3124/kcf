package project.Custom.NewCustom;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import project.Custom.CustomDTO;
import project.Image.ImageService;

@Service
public class NewCustomService {
    
    @Autowired
    NewCustomDAO newCustomDAO;
    
    @Autowired
    ImageService imageService;
    
    public int NewCustom(CustomDTO custom,List<MultipartFile> images){
            try{
           newCustomDAO.save(custom); 
           imageService.RegisterCustomImages(images,custom);
           return 200;
        }catch (Exception e){
            return 100;
        }
    }

}
