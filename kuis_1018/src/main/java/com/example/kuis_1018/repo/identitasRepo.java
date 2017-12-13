/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.kuis_1018.repo;

import com.example.kuis_1018.entity.identitas;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Mahasiswa 21
 */
public interface identitasRepo extends CrudRepository<identitas, Long>{
    
    @Query("select g from identitas g")
    public List<identitas> findAllidentitas();

}
