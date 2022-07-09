package app.backend.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import app.backend.common.model.Payload;
import app.backend.user.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
    
    @Autowired
    UserService userService;
    
    @ResponseBody
    @PostMapping("/getUser")
    public ResponseEntity<Payload> getUser(@RequestBody Payload request) {
    	Payload result = new Payload();
    	result.set("userSeq", 1);
    	result.set("userName", "minchang");
    	result.set("userAge", request.get("userAge"));
    	
    	return ResponseEntity.ok(result);
    }
    
}
