package project.Image;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "images")
@Entity
public class ImageDTO {
    
    @Id
    @Column(name = "image_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    @Column(name = "image_company_fk")
    private String company;
    
    @Column(name = "image_src")
    private String src;
    
    @Column(name = "type")
    private int type;
    @Column(name = "image_Sche_fk")
    private String Sche;
    /**
 * @param src the src to set
 */
public void setSrc(String src) {
	this.src = src;
}
    /**
 * @return the src
 */
public String getSrc() {
	return src;
}
    /**
 * @param id the id to set
 */
public void setId(long id) {
	this.id = id;
}
    /**
 * @return the id
 */
public long getId() {
	return id;
}
    /**
 * @param company the company to set
 */
public void setCompany(String company) {
	this.company = company;
}
    /**
 * @return the company
 */
public String getCompany() {
	return company;
}
    /**
 * @param type the type to set
 */
public void setType(int type) {
	this.type = type;
}
    /**
 * @return the type
 */
public int getType() {
	return type;
}
    /**
 * @param custom the custom to set
 */
    public String getSche() {
        return Sche;
    }

    public void setSche(String sche) {
        Sche = sche;
    }
}
