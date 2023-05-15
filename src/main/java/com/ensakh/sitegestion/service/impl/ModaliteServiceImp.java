package com.ensakh.sitegestion.service.impl;

import com.ensakh.sitegestion.entity.Modalite;
import com.ensakh.sitegestion.repository.ModaliteRepository;
import com.ensakh.sitegestion.service.ModaliteService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class ModaliteServiceImp implements ModaliteService {

    private ModaliteRepository modaliteRepository ;

    public ModaliteServiceImp(ModaliteRepository modaliteRepository) {
        this.modaliteRepository = modaliteRepository;
    }

    @Override
    public List<Modalite> getAll() {
        return modaliteRepository.findAll();
    }
}
