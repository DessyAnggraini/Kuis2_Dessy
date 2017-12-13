/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.kuis_1018.service;

import com.example.kuis_1018.entity.identitas;
import com.example.kuis_1018.repo.identitasRepo;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Mahasiswa 21
 */
@Service("identitasService")
@Transactional
public class identitasService {
    @Autowired
    private identitasRepo repo;

    public identitas insert(identitas identitas) {
        return repo.save(identitas);
    }
    
    public identitas update(identitas identitas) {
        return repo.save(identitas);
    }
    
    public boolean delete(Long id){
        repo.delete(id);
        return true;
    }
    
    public identitas getById(Long id){
        return repo.findOne(id);
    }
    
    public List<identitas> getAll(){
        return repo.findAllidentitas();
    }
}
