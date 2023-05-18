package com.ensakh.sitegestion.controller;

import com.ensakh.sitegestion.repository.EtudiantRepository;
import com.ensakh.sitegestion.service.EtudiantService;
import com.ensakh.sitegestion.service.impl.EtudiantServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EtudiantController {

    @Autowired
    private EtudiantService etudiantService;
    private EtudiantServiceImp etudiantServiceImp;

    public EtudiantController(EtudiantService etudiantService) {
        this.etudiantService = etudiantService;
    }

    @GetMapping("Etudiant")
    public String listEtudiant(Model model) {
        model.addAttribute("listEtud", etudiantService.getAll());
        System.out.println(etudiantService.getAll());
        return "etudiants";
    }

    // C'est la modification pour ltp devops ....
}
