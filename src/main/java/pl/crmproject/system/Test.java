package pl.crmproject.system;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Test {

    @GetMapping("/login")
    @ResponseBody
    public String getForm(){

        return "login";
    }
}
