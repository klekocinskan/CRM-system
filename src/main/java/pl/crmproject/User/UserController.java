package pl.crmproject.User;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping("/addNewUser")
    public String login(Model model){
        model.addAttribute("user", new User());
        return "newuser";
    }


    @PostMapping("/addNewUser")
    @ResponseBody
    public String loginApproved(UserDto user){
        userService.add(user);
        return user.toString();
    }
}
