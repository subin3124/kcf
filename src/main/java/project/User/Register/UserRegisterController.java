package project.User.Register;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import project.User.UserDTO;

@RestController("/User/Register")
public class UserRegisterController {
    
    @Autowired
    UserRegisterService RegisterService;
    @PostMapping("/")
    private int Register(@RequestParam String id,@RequestParam String username,@RequestParam String email, @RequestParam boolean isboss,@RequestParam String mobile, @RequestParam String password, BindingResult result){
        UserDTO dto = new UserDTO();
        dto.setId(id);
        dto.setUsername(username);
        dto.setEmail(email);
        dto.setIsboss(isboss);
        dto.setMobile(mobile);
        dto.setPassword(password);
        
    RegisterVO registerVO = RegisterService.Register(dto,result);
    return registerVO.getCode();
    }
    
}
