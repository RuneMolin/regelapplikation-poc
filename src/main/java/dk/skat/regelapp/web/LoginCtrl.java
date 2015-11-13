package dk.skat.regelapp.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Rune Molin, rmo@nine.dk
 */
@Controller
public class LoginCtrl {

    @RequestMapping("/login")
    public String login() {
        return "login";
    }
}
