package com.viseo;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * 
 * @author o.trichot
 *
 */

@Controller

// 1 et 2 
//@RequestMapping("/bonjour")

//3 
//@RequestMapping("/bonjour/{personne}")
@RequestMapping("/bonjour2/{personne}")
public class BonjourController {

    /*@RequestMapping(method = RequestMethod.GET)
    public String afficherBonjour(final ModelMap pModel) {
        pModel.addAttribute("personne", "Regis");
        return "bonjour";
    }*/


    /*@RequestMapping(method = RequestMethod.GET)
    public String afficherBonjour(final ModelMap pModel, 
                @RequestParam(value="personne") final String pPersonne) {

        pModel.addAttribute("personne", pPersonne);
        return "bonjour";
    }*/
	
	@RequestMapping(method = RequestMethod.GET)
    public String afficherBonjour(final ModelMap pModel, 
                @PathVariable(value="personne") final String pPersonne) {

        pModel.addAttribute("personne", pPersonne);
        return "bonjour2";
    }
}
