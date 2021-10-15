package project.Custom.ViewCustomDetails;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import project.Custom.CustomDTO;
import project.Image.ImageService;

@RestController
@RequestMapping("/Custom/View")
public class ViewCustomDetailsController {
    
    @Autowired
    ViewCustomDetailService viewCustomDetailService;
    
    @Autowired
    ImageService imageService;
    
    @GetMapping("/id/{idx}")
    private CustomDTO ViewCustomDetailsById(@PathVariable("idx") long idx){
        return viewCustomDetailService.findCustomById(idx);
    }
    @GetMapping("/Order/{idx}")
    private CustomDTO ViewCustomDetailsByOrder(@PathVariable("idx") long orderidx){
        return viewCustomDetailService.findCustomByOrder(orderidx);
    }
    
    @GetMapping("/Image/")
    private List<String> ViewCustomImage(@RequestParam String Customidx) throws IOException{
        return imageService.GetImagesByCustomId(Customidx);
        
    }
}
