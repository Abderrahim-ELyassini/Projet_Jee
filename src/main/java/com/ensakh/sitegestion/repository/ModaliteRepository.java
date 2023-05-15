package com.ensakh.sitegestion.repository;

import com.ensakh.sitegestion.entity.Modalite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModaliteRepository extends JpaRepository<Modalite,Long>{

}