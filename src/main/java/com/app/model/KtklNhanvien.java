package com.app.model;
// Generated Oct 16, 2018 12:07:59 PM by Hibernate Tools 4.3.1


import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * KtklNhanvien generated by hbm2java
 */
@Entity
@Table(name="KTKL_NHANVIEN"
    ,schema="dbo"
    ,catalog="sql"
)
public class KtklNhanvien  implements java.io.Serializable {


     private String maKtkl;
     private Nhanvien nhanvien;
     private Date thGian;
     private Ktkl ktkl;

    public KtklNhanvien() {
    }

	
    public KtklNhanvien(String maKtkl, Nhanvien nhanvien, Date thGian) {
        this.maKtkl = maKtkl;
        this.nhanvien = nhanvien;
        this.thGian = thGian;
    }
    public KtklNhanvien(String maKtkl, Nhanvien nhanvien, Date thGian, Ktkl ktkl) {
       this.maKtkl = maKtkl;
       this.nhanvien = nhanvien;
       this.thGian = thGian;
       this.ktkl = ktkl;
    }
   
     @Id 

    
    @Column(name="MaKTKL", unique=true, nullable=false)
    public String getMaKtkl() {
        return this.maKtkl;
    }
    
    public void setMaKtkl(String maKtkl) {
        this.maKtkl = maKtkl;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="MaNV", nullable=false)
    public Nhanvien getNhanvien() {
        return this.nhanvien;
    }
    
    public void setNhanvien(Nhanvien nhanvien) {
        this.nhanvien = nhanvien;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="ThGian", nullable=false, length=23)
    public Date getThGian() {
        return this.thGian;
    }
    
    public void setThGian(Date thGian) {
        this.thGian = thGian;
    }

@OneToOne(fetch=FetchType.LAZY, mappedBy="ktklNhanvien")
    public Ktkl getKtkl() {
        return this.ktkl;
    }
    
    public void setKtkl(Ktkl ktkl) {
        this.ktkl = ktkl;
    }




}


