package com.ensakh.sitegestion.service.impl;

import com.ensakh.sitegestion.entity.Filiere;
import com.ensakh.sitegestion.repository.FiliereRepository;
import com.ensakh.sitegestion.service.FiliereService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class FiliereServiceImp implements FiliereService {
    private FiliereRepository filiereRepository ;

    public FiliereServiceImp(FiliereRepository filiereRepository) {
        this.filiereRepository = filiereRepository;
    }

    public List<Filiere> getAll(){
       return filiereRepository.findAll() ;
    }
}
