package dk.skat.regelapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Rune Molin, rmo@nine.dk
 */
@Controller
public class HomeCtrl {

    @RequestMapping("/")
    public String index() {
        return "index";
    }
}
