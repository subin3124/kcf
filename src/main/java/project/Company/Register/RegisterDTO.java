package project.Company.Register;

import org.springframework.web.multipart.MultipartFile;

import project.Company.CompanyDTO;

public class RegisterDTO {
    private MultipartFile Image;
    private MultipartFile logo;
    /**
 * @param logo the logo to set
 */
public void setLogo(MultipartFile logo) {
	this.logo = logo;
}
    /**
 * @return the logo
 */
public MultipartFile getLogo() {
	return logo;
}
    /**
 * @param image the image to set
 */
public void setImage(MultipartFile image) {
	Image = image;
}
    /**
 * @return the image
 */
public MultipartFile getImage() {
	return Image;
}
    /**
 * @param companyDTO the companyDTO to set
 */

}
