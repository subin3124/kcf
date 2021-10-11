package project.Custom.ViewCustomDetails;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import project.Custom.CustomDTO;

@RestController
@RequestMapping("/Custom/View")
public class ViewCustomDetailsController {
    
    @Autowired
    ViewCustomDetailService viewCustomDetailService;
    
    @GetMapping("/id/{idx}")
    private CustomDTO ViewCustomDetailsById(@PathVariable("idx") long idx){
        return viewCustomDetailService.findCustomById(idx);
    }
    @GetMapping("Order/{idx}")
    private CustomDTO ViewCustomDetailsByOrder(@PathVariable("idx") long orderidx){
        return viewCustomDetailService.findCustomByOrder(orderidx);
    }
}
