package project.Company;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import project.Company.CompanyDTO;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
@Table(name = "company")
@Entity
public class CompanyDTO {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Company_pk")
    private long id;
    
    @Column(name = "cp_owner")
    private String owner;
    
    @Column(name = "cp_name")
    private String name;
    
    @Column(name = "cp_region")
    private String region;
    
    
    @Column(name = "cp_owner_name")
    private String ownername;
    
    @Column(name = "cp_info")
    private String info;
    
    @Column(name = "cp_positionX") 
    private float positionX;
    
    @Column(name = "cp_positionY")
    private float positionY;
    
    @Column(name = "category")
    private String category;
    
    @Column(name = "filter1")
    private int filter1;
    
    @Column(name = "filter2")
    private int filter2;
    
    @Column(name = "filter3")
    private int filter3;

    @Column(name = "image_greencustom")
    private String imggc;

    @Column(name = "greenpara")
    private String greenpara;

    /**
 * @return the id
 */
public long getId() {
	return id;
}
    /**
 * @param region the region to set
 */
public void setRegion(String region) {
	this.region = region;
}
    /**
 * @return the region
 */
public String getRegion() {
	return region;
}
    /**
 * @param positionY the positionY to set
 */
public void setPositionY(float positionY) {
	this.positionY = positionY;
}
    /**
 * @return the positionY
 */
public float getPositionY() {
	return positionY;
}
    /**
 * @param positionX the positionX to set
 */
public void setPositionX(float positionX) {
	this.positionX = positionX;
}
    /**
 * @return the positionX
 */
public float getPositionX() {
	return positionX;
}
    /**
 * @param owner the owner to set
 */
public void setOwner(String owner) {
	this.owner = owner;
}
    /**
 * @return the owner
 */
public String getOwner() {
	return owner;
}
    /**
 * @param ownername the ownername to set
 */
public void setOwnername(String ownername) {
	this.ownername = ownername;
}
    /**
 * @return the ownername
 */
public String getOwnername() {
	return ownername;
}
    /**
 * @param name the name to set
 */
public void setName(String name) {
	this.name = name;
}
    /**
 * @return the name
 */
public String getName() {
	return name;
}
    /**
 * @param logoImage the logoImage to set
 */

    /**
 * @param info the info to set
 */
public void setInfo(String info) {
	this.info = info;
}
    /**
 * @return the info
 */
public String getInfo() {
	return info;
}
    /**
 * @param image the image to set
 */

    /**
 * @param id the id to set
 */
public void setId(long id) {
	this.id = id;
}
    /**
 * @return the category
 */
public String getCategory() {
	return category;
}
    /**
 * @param filter3 the filter3 to set
 */
public void setFilter3(int filter3) {
	this.filter3 = filter3;
}
    /**
 * @return the filter3
 */
public int isFilter3() {
	return filter3;
}
    /**
 * @param filter2 the filter2 to set
 */
public void setFilter2(int filter2) {
	this.filter2 = filter2;
}
    /**
 * @return the filter2
 */
public int isFilter2() {
	return filter2;
}
    /**
 * @param filter1 the filter1 to set
 */
public void setFilter1(int filter1) {
	this.filter1 = filter1;
}
    /**
 * @return the filter1
 */
public int isFilter1() {
	return filter1;
}
    /**
 * @param category the category to set
 */
public void setCategory(String category) {
	this.category = category;
}
}