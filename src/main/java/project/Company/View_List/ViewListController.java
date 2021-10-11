package project.Company.View_List;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import project.Company.CompanyDTO;

@RestController
@RequestMapping("/company/ViewLists")
public class ViewListController {
    
    @Autowired
    ViewListService viewListService;
    
    @GetMapping("/Regions")
    private List<CompanyDTO> GetCompaniesByRegions(@RequestParam String Region){
        return viewListService.CompanyListsByRegion(Region);
    }
    
}
