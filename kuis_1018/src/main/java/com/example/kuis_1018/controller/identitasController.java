/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.kuis_1018.controller;

import com.example.kuis_1018.entity.identitas;
import com.example.kuis_1018.service.identitasService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Mahasiswa 21
 */
@RestController
@RequestMapping("/identitas")
public class identitasController {
    
    @Autowired
    private identitasService identitasService;

    @RequestMapping(method = RequestMethod.POST)
    public identitas insert(@RequestBody identitas identitas) {
        return identitasService.insert(identitas);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public identitas update(@RequestBody identitas identitas) {
        return identitasService.update(identitas);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public boolean delete(@PathVariable("id") Long id) {
        return identitasService.delete(id);
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public identitas getById(@PathVariable("id") Long id){
        return identitasService.getById(id);
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public List<identitas> getAll(){
        return identitasService.getAll();
    }
}
