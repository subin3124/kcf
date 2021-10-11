package project.Company.Register;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import project.Company.CompanyDTO;
import project.Image.ImageService;

@Service
public class RegisterService {
    
    @Autowired
    RegisterDAO registerDAO;
    
    @Autowired
    ImageService imageService;
    
    public int Register(CompanyDTO dto,List<MultipartFile> images){
        try{
           registerDAO.save(dto); 
           imageService.RegisterCompanyImages(images,dto);
           return 200;
        }catch (Exception e){
            return 100;
        }
    }
}
