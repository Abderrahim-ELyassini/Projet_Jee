package com.ensakh.sitegestion.service.impl;

import com.ensakh.sitegestion.entity.Mod_Elm;
import com.ensakh.sitegestion.entity.Module;
import com.ensakh.sitegestion.repository.ModuleRepository;
import com.ensakh.sitegestion.service.ModuleService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
@Service
@Transactional
public class ModuleServiceImp implements ModuleService {

    private ModuleRepository moduleRepository ;

    public ModuleServiceImp(ModuleRepository moduleRepository) {
        this.moduleRepository = moduleRepository;
    }

    @Override
    public List<Module> getAll() {
        return moduleRepository.findAll();
    }

    @Override
    public List<Mod_Elm> listModElm(Module module) {
        return null;
    }

//    @Override
//    public List<Mod_Elm> listModElm(Module module) {
//        ArrayList<Mod_Elm> listMod_Elm = new ArrayList<Mod_Elm>();
//
//
//        return null;
//    }
}
