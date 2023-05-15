package com.ensakh.sitegestion.service.impl;

import com.ensakh.sitegestion.entity.Etudiant;
import com.ensakh.sitegestion.repository.EtudiantRepository;
import com.ensakh.sitegestion.service.EtudiantService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class EtudiantServiceImp implements EtudiantService {
    private EtudiantRepository etudiantRepository ;

    public EtudiantServiceImp(EtudiantRepository etudiantRepository) {
        this.etudiantRepository = etudiantRepository;
    }

    @Override
    public List<Etudiant> getAll() {
        return etudiantRepository.findAll();
    }
}
