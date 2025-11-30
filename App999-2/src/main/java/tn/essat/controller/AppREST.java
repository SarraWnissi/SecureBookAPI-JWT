package tn.essat.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tn.essat.dao.ILivre;
import tn.essat.model.Livre;

@RestController
public class AppREST {

    @Autowired
    ILivre dao;

    @GetMapping("/livres")
    public List<Livre> getAllLivres() {
        return dao.findAll();
    }
    
    @PostMapping("/addLivre")
    public void addLivre(@RequestBody Livre lv) {
        dao.save(lv);
    }
    
    @DeleteMapping("/deleteLivre/{id}")
    public void deleteLivre(@PathVariable("id") int id) {
        dao.deleteById(id);
    }
}
