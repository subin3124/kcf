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
    
    @GetMapping("/NameWithFilterAndRegionskinds")
    private List<CompanyDTO> GetCompaniesByFileterAndName(@RequestParam String Name, @RequestParam String Filter1, @RequestParam String Filter2,@RequestParam String Filter3, @RequestParam String Region, @RequestParam String Kinds){
       
        System.out.println("value test : "+Filter1);
        return viewListService.CompanyListsWithFilteringAndName(Name, Boolean.parseBoolean(Filter1),                       Boolean.parseBoolean(Filter2),
        Boolean.parseBoolean(Filter3),
        Region,
        Kinds);
    }
    
}
