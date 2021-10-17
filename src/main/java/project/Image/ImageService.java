package project.Image;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.io.FileInputStream;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import java.time.LocalDateTime;
import project.Company.CompanyDTO;
import project.Custom.CustomDTO;

@Service
public class ImageService {
    
    @Autowired
    ImageDAO imageDAO;
    private static final String FILE_SERVER_PATH = "/workspace/kcf/serverImage";
    

        

    public List<String> GetImagesByCompanyId(CompanyDTO company) throws IOException{
        List<ImageDTO> imageDTOs = imageDAO.findImageDTOsByCompanyAndType(company.getName(),0); //타입 : 회사는 0, 커스텀은 1
        List<String> urls = new ArrayList<>();
        for(ImageDTO imageDTO : imageDTOs){
            System.out.println(imageDTO.getCompany()+" : "+imageDTO.getSrc());
            urls.add(imageDTO.getSrc());
        } return urls;
    }
    
    public byte[] ReturnImage(String imageurl) throws Exception{
              InputStream in = new FileInputStream(imageurl);
              return IOUtils.toByteArray(in);
    }
        
        
    
    public void RegisterCompanyImages(List<MultipartFile> images, CompanyDTO company) throws IOException{
        int increase = 0;
        for(MultipartFile image : images){
            LocalDateTime localDateTime = LocalDateTime.now();
            image.transferTo(new File(FILE_SERVER_PATH+"/image_"+company.getName()+"_"+localDateTime.toString()+"_"+increase+".png"));
            ImageDTO imageDTO = new ImageDTO();
            imageDTO.setCompany(company.getName());
            imageDTO.setSrc(FILE_SERVER_PATH+"/image_"+company.getName()+"_"+localDateTime.toString()+"_"+increase+".png");
            imageDTO.setType(0); //회사는 0, 커스텀은 1
            imageDAO.save(imageDTO);
            increase++;
        }
    }
     public void RegisterCustomImages(List<MultipartFile> images, CustomDTO custom) throws IOException{
        int increase = 0;
        for(MultipartFile image : images){
            LocalDateTime localDateTime = LocalDateTime.now();
            image.transferTo(new File(FILE_SERVER_PATH+"/image_"+custom.getImage()+"_"+localDateTime.toString()+"_"+increase+".png"));
            ImageDTO imageDTO = new ImageDTO();
            imageDTO.setSche(custom.getImage());
            imageDTO.setSrc(FILE_SERVER_PATH+"/image_"+custom.getImage()+"_"+localDateTime.toString()+"_"+increase+".png");
            imageDTO.setType(1); //회사는 0, 커스텀은 1
            imageDAO.save(imageDTO);
            increase++;
        }
    }
    public List<String> GetImagesByCustomId(String image) throws IOException{
        List<ImageDTO> imageDTOs = imageDAO.findImageDTOsByCustomAndType(image,1); //타입 : 회사는 0, 커스텀은 1
        List<String> urls = new ArrayList<>();
        for(ImageDTO imageDTO : imageDTOs){
            urls.add(imageDTO.getSrc());
        } return urls;
    }
}
