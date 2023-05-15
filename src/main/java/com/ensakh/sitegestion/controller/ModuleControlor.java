package com.ensakh.sitegestion.controller;

import com.ensakh.sitegestion.service.ModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ModuleControlor {
    @Autowired
    private ModuleService moduleService ;

    public ModuleControlor(ModuleService moduleService) {
        this.moduleService = moduleService;
    }

    @GetMapping("Module")
    public String listModule(Model model){
        model.addAttribute("listModule" , moduleService.getAll());
        System.out.println(moduleService.getAll());
        return "modules";
    }
}
