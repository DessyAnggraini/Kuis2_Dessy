/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.kuis_1018.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Mahasiswa 21
 */
@Entity
@Table(name = "tbl_ipk")
public class ipk implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 100, nullable = false, unique = true)
    private String nilai;
    @Column(length = 255, nullable = true)
    private String jurusan;
   @Column(length = 255, nullable = true)
    private String id_identitas;
    
    
    @ManyToOne
    private identitas identitas;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getNilai() {
        return nilai;
    }

    /**
     * @param nilai the name to set
     */
    public void setNilai(String nilai) {
        this.nilai= nilai;
    }

    /**
     * @return the description
     */
    public String getJurusan() {
        return jurusan;
    }

    /**
     * @param jurusan the name to set
     */
    public void setJurusan(String jurusan) {
        this.jurusan= jurusan;
    }

    /**
     * @return the description
     */
    public String getId_identitas() {
        return id_identitas;
    }

    /**
     * @param id_identitas the name to set
     */
    public void setId_identitas(String id_identitas) {
        this.id_identitas= id_identitas;
    }

    /**
     * @return the description
     */
}
