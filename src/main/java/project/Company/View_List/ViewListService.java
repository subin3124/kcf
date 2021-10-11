package project.Company.View_List;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.Company.CompanyDTO;

@Service
public class ViewListService {
    
    @Autowired
    ViewListDAO viewListDAO;
    public List<CompanyDTO> CompanyListsByRegion(String Region){
        try{
            List<CompanyDTO> companyList = viewListDAO.findCompanyDTOsByRegion(Region);
            return companyList;
        } catch(Exception e){
            return null;
        }
    }
}
