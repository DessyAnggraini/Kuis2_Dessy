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
import javax.persistence.Table;


/**
 *
 * @author Mahasiswa 21
 */
@Entity
@Table(name = "tbl_identitas")
public class identitas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 100, nullable = false, unique = true)
    private String nama;
    @Column(length = 255, nullable = true)
    private String alamat;
    @Column(length = 255, nullable = true)
    private String nohp;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the name to set
     */
    public void setNama(String nama) {
        this.nama= nama;
    }

    /**
     * @return the description
     */
    public String getAlamat() {
        return alamat;
    }

    /**
     * @param alamat the name to set
     */
    public void setAlamat(String alamat) {
        this.alamat= alamat;
    }

    /**
     * @return the description
     */
    public String getNohp() {
        return nohp;
    }

    /**
     * @param nohp the name to set
     */
    public void setNohp(String nohp) {
        this.nohp= nohp;
    }

    /**
     * @return the description
     */
}
