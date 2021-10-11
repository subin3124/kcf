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
}