package com.ipiecoles.java.javaeval.service;

import com.ipiecoles.java.javaeval.model.Employe;
import com.ipiecoles.java.javaeval.model.Entreprise;
import com.ipiecoles.java.javaeval.repository.EmployeRepository;
import com.ipiecoles.java.javaeval.repository.EntrepriseRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EntrepriseService {

    @Autowired
    private EntrepriseRepository entrepriseRepository;
    private EmployeRepository employeRepository;

    public void setRepositoryEnt(EntrepriseRepository e) {
    	this.entrepriseRepository= e;
    }
    
    public void setRepositoryEmp(EmployeRepository e) {
    	this.employeRepository=e;
    }
    public Employe findById(Long id){
        return employeRepository.findOne(id);
    }

    public Long countAllEmploye() {
        return employeRepository.count();
    }

    public void deleteEmploye(Long id){
        employeRepository.delete(id);
    }

    public Entreprise creerEntreprise(Entreprise e) {
        return entrepriseRepository.save(e);
    }
}
