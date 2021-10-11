package project.Image;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Image")
public class ImageController {
    
    @Autowired
    ImageService imagesService;
    
    @GetMapping(value = "/download",produces = MediaType.IMAGE_PNG_VALUE)
    private byte[] downloadImage(@RequestParam String url) throws Exception{
        return imagesService.ReturnImage(url);
    }
}
