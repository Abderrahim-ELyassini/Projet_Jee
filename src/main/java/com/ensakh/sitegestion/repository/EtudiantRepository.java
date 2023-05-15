package com.ensakh.sitegestion.repository;

import com.ensakh.sitegestion.entity.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EtudiantRepository extends JpaRepository<Etudiant,Long>{

}