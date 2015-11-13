package dk.skat.regelapp.web;

import dk.skat.regelapp.service.KontoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Rune Molin, rmo@nine.dk
 */
@Controller
public class KontoplanCtrl {
    private final KontoService kontoService;

    @Autowired
    public KontoplanCtrl(KontoService kontoService) {
        this.kontoService = kontoService;
    }

    @RequestMapping("/kontoplan")
    public ModelAndView index() {
        final ModelMap model = new ModelMap("konti", kontoService.alleKonti());

        return new ModelAndView("kontoplan", model);
    }
}
