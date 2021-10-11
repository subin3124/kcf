package project.Comapny.View_Details;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.Company.CompanyDTO;
import project.Image.ImageService;

@Service
public class ViewDetailsService {
    
    @Autowired
    ViewDetailsDAO viewDetailsDAO;
    
    @Autowired
    ImageService imageService;
    
    public CompanyDTO GetCompanyDetails(long id){
        return viewDetailsDAO.findCompanyDTOById(id);
    }
    public List<String> GetCompanyImageURIs(long id) throws IOException{
       return imageService.GetImagesByCompanyId(GetCompanyDetails(id));
    }
}
