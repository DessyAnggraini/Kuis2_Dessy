/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.kuis_1018.controller;

import com.example.kuis_1018.entity.ipk;
import com.example.kuis_1018.service.ipkService;
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
@RequestMapping("/ipk")
public class ipkController {
    
    @Autowired
    private ipkService ipkService;

    @RequestMapping(method = RequestMethod.POST)
    public ipk insertOrUpdate(@RequestBody ipk ipk) {
        return ipkService.insert(ipk);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public ipk update(@RequestBody ipk ipk) {
        return ipkService.update(ipk);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public boolean delete(@PathVariable("id") Long id) {
        return ipkService.delete(id);
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public ipk getById(@PathVariable("id") Long id){
        return ipkService.getById(id);
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public List<ipk> getAll(){
        return ipkService.getAll();
    }
}
