/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.kuis_1018.service;

import com.example.kuis_1018.entity.ipk;
import com.example.kuis_1018.repo.ipkRepo;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Mahasiswa 21
 */
@Service("ipkService")
@Transactional
public class ipkService {
    @Autowired
    private ipkRepo repo;

    public ipk insert(ipk ipk) {
        return repo.save(ipk);
    }
    
    public ipk update(ipk ipk) {
        return repo.save(ipk);
    }
    
    public boolean delete(Long id){
        repo.delete(id);
        return true;
    }
    
    public ipk getById(Long id){
        return repo.findOne(id);
    }
    
    public List<ipk> getAll(){
        return repo.findAllipk();
    }
}
