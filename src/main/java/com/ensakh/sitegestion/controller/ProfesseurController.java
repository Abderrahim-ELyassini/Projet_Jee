package com.ensakh.sitegestion.controller;


import com.ensakh.sitegestion.entity.Professeur;
import com.ensakh.sitegestion.service.FiliereService;
import com.ensakh.sitegestion.service.ProfesseurService;
import com.ensakh.sitegestion.service.impl.ProfesseurServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ProfesseurController {
    @Autowired
    private ProfesseurServiceImpl professeurServiceImpl;
    private ProfesseurService professeurService;

    public ProfesseurController(ProfesseurService professeurService) {

        this.professeurService = professeurService;
    }

    @RequestMapping("/dashboard")
    public String home(Model model) {
        return "Dashboard";

    }

    @GetMapping("/Professeur")
    public String listProfesseur(Model model) {
        model.addAttribute("listProfs", professeurService.getAll());
        System.out.println(professeurService.getAll());
        return "professeurs";

    }



}













//package com.ensakh.sitegestion.controller;
//
//import com.ensakh.sitegestion.service.ProfesseurService;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//@Controller
//public class ProfesseurController {
//    private ProfesseurService professeurService;
//
//    public ProfesseurController(ProfesseurService professeurService) {
//        this.professeurService = professeurService;
//    }
//
//    @RequestMapping("/")
//    public String home(Model model) {
//        return "Professeur";
//
//    }
//
//    @RequestMapping("/Professeur")
//    public String Professeur(Model model) {
//        model.addAttribute("Professeur", professeurService.getAll());
//        return "Professeur";
//    }
//
////    @GetMapping("/etudiants/new")
////    public String addEtudiants(Model model) {
////        model
////    }
//}
