package dk.skat.regelapp.web;

import dk.skat.regelapp.domain.Konto;
import dk.skat.regelapp.service.KontoRepository;
import dk.skat.regelapp.service.KontoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Rune Molin, rmo@nine.dk
 */
@Controller
public class KontoplanCtrl {
    //private final KontoService kontoService;
    private final KontoRepository kontoRepository;

    @Autowired
    public KontoplanCtrl(KontoRepository kontoRepository) {
        this.kontoRepository = kontoRepository;
    }

    @RequestMapping("/kontoplan")
    public ModelAndView index() {
        final ModelMap model = new ModelMap("konti", kontoRepository.findAll());

        return new ModelAndView("kontoplan", model);
    }

    @RequestMapping(value = "/kontoplan/slet", method = RequestMethod.POST)
    public String slet(Konto konto) {
        kontoRepository.delete(konto);
        return "redirect:/kontoplan";
    }
}
