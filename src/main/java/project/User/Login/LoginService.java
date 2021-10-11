package project.User.Login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.User.UserDTO;
@Service
public class LoginService {
    
    @Autowired
    LoginDAO loginDAO;
    
    public int Login(String id, String pw){
       try{
           UserDTO userdto = loginDAO.findUserDTOById(id);
           if(userdto.getPassword().equals(pw)){
               return 200; //로그인 성공
           }else{
               return 400; //비밀번호 오류
           }
       }catch(Exception e){
           return 404; //아이디없음
       }
    }
}
