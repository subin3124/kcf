package project.User.Register;

import java.util.List;

import org.springframework.validation.ObjectError;

// 회원가입용 VO 
public class RegisterVO{
    private boolean isRegister;
    private List<ObjectError> vaildErrors;
    private int code;
    /**
 * @param isRegister the isRegister to set
 */
public void setRegister(boolean isRegister) {
	this.isRegister = isRegister;
}
    /**
 * @return the isRegister
 */
public boolean isRegister() {
	return isRegister;
}
    /**
 * @return the vaildErrors
 */
public List<ObjectError> getVaildErrors() {
	return vaildErrors;
}
    /**
 * @param vaildErrors the vaildErrors to set
 */
public void setVaildErrors(List<ObjectError> vaildErrors) {
	this.vaildErrors = vaildErrors;
}
    /**
 * @param code the code to set
 */
public void setCode(int code) {
	this.code = code;
}
    /**
 * @return the code
 */
public int getCode() {
	return code;
}
public RegisterVO(boolean isRegister, List<ObjectError> errors, int code){
    this.isRegister = isRegister;
    this.vaildErrors = errors;
    this.code = code;
}
}