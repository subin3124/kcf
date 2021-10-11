package project.User.Login;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/User/Login")
public class LoginController {
    
    @Autowired
    LoginService loginService;
    
    @PostMapping("/")
    private int loginMapping(@RequestBody String json) throws Exception{
        JSONParser jsonParser = new JSONParser();
        JSONObject JSONObject = (JSONObject) jsonParser.parse(json);
        return loginService.Login(JSONObject.get("id").toString(),JSONObject.get("pw").toString());
        
    }
}
