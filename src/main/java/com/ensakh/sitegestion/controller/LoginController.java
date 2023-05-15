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
public class LoginController {


    @GetMapping("/Login")
    public String listProfesseur(Model model) {

        return "login";

    }
}
