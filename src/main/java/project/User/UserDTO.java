package project.User;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;



@Table(name = "user")
@Entity
public class UserDTO {
    //ERD확정후 수정할것!
    
   
    @NotBlank
    @NotEmpty
    @Id
    private String id;
    @NotEmpty
    @NotBlank
    @Column
    private String password;
    
    @Column
    private boolean isboss;
    
    @Column
    @Email
    private String email;
    @NotEmpty
    @Column
    private String mobile;
    
    @Column(name = "username")
    private String username;
    /**
 * @return the id
 */
public String getId() {
	return id;
}
    /**
 * @param id the id to set
 */
public void setId(String id) {
	this.id = id;
}
    /**
 * @return the password
 */
public String getPassword() {
	return password;
}
    /**
 * @param password the password to set
 */
public void setPassword(String password) {
	this.password = password;
}
 /**
 * @param isboss the isboss to set
 */
public void setIsboss(boolean isboss) {
	this.isboss = isboss;
}
    /**
 * @return the isboss
 */
public boolean isIsboss() {
	return isboss;
}
    /**
 * @param username the username to set
 */
public void setUsername(String username) {
	this.username = username;
}
    /**
 * @return the username
 */
public String getUsername() {
	return username;
}
    /**
 * @param mobile the mobile to set
 */
public void setMobile(String mobile) {
	this.mobile = mobile;
}
    /**
 * @return the mobile
 */
public String getMobile() {
	return mobile;
}
    /**
 * @param email the email to set
 */
public void setEmail(String email) {
	this.email = email;
}
    /**
 * @return the email
 */
public String getEmail() {
	return email;
}
}
