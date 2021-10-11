package project.User.Register;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import project.User.UserDTO;

@RestController("/User/Register")
public class UserRegisterController {
    
    @Autowired
    UserRegisterService RegisterService;
    @PostMapping("/")
    private int Register(@RequestBody UserDTO userDTO, BindingResult result){
    RegisterVO registerVO = RegisterService.Register(userDTO,result);
    return registerVO.getCode();
    }
    
}
