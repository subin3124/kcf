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
            System.out.println("데이터 : "+companyList.get(0).getName());
            return companyList;
        } catch(Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }
    public List<CompanyDTO> CompanyListsWithFilteringAndName(String name, boolean filter1, boolean filter2, boolean filter3,String Region,String kinds) {
        try{
            System.out.println("회사목록서비스 디버그2 : "+filter1);
            
            List<CompanyDTO> companyList = viewListDAO.findCompanyDTOsByNameContainsAndFilter1AndFilter2AndFilter3AndRegionAndCategory(name,(filter1)?1:0,(filter2)?1:0,(filter3)?1:0,Region,kinds);
            System.out.println("회사목록서비스 디버그2 : "+companyList.get(0).getName());
            return companyList;
        }catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }
}
