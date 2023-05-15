package com.ensakh.sitegestion.controller;

import com.ensakh.sitegestion.service.FiliereService;
import com.ensakh.sitegestion.service.impl.FiliereServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FiliereControllor {
    @Autowired
    private FiliereService filiereService ;

    public FiliereControllor(FiliereService filiereService) {
        this.filiereService = filiereService;
    }

    @GetMapping("Filiere")
    public String listFiliere(Model model){
        model.addAttribute( "listFiliere" , filiereService.getAll());
        System.out.println(filiereService.getAll());
        return "filieres" ;
    }
}
