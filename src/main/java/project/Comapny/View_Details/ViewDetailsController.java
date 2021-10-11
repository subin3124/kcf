package project.Comapny.View_Details;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import project.Company.CompanyDTO;


@RestController
@RequestMapping("/company/Details")
public class ViewDetailsController {
    
    @Autowired
    ViewDetailsService viewDetailsService;
    
    @GetMapping("/info/{idx}")
    public CompanyDTO GetViewDetails(@PathVariable("idx") Long idx){
        return viewDetailsService.GetCompanyDetails(idx);
    }
   
    @GetMapping(value = "/image/{idx}")
    public List<String> GetImageURIs(@PathVariable("idx") Long idx) throws IOException{
       return viewDetailsService.GetCompanyImageURIs(idx);
    }
}
