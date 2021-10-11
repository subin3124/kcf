package project.User.Register;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import java.util.List;
import project.User.UserDTO;
@Service
public class UserRegisterService {
    
    @Autowired
    UserRegisterDAO registerDAO;
    
    public RegisterVO Register(@Valid UserDTO userDTO, BindingResult result){
        if(result.hasErrors()){
            List<ObjectError> errorList = result.getAllErrors();
            return new RegisterVO(false, errorList,401); // 코드
        }                                                // 200 : 정상 회원가입
        try{                                             // 401 : 가입정보가 유효하지 않음
            registerDAO.save(userDTO);                   // 405 : 데이터베이스 오류
            return new RegisterVO(true, null, 200);
        }catch (DataAccessException e){
            return new RegisterVO(false,null,405);
        }
    }
}

