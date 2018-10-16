package com.app.model;
// Generated Oct 16, 2018 12:07:59 PM by Hibernate Tools 4.3.1


import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * Phongban generated by hbm2java
 */
@Entity
@Table(name="PHONGBAN"
    ,schema="dbo"
    ,catalog="sql"
)
public class Phongban  implements java.io.Serializable {


     private String maPb;
     private PhongbanChucvu phongbanChucvu;
     private String tenPb;
     private String dc;
     private Set<Nhanvien> nhanviens = new HashSet<Nhanvien>(0);

    public Phongban() {
    }

	
    public Phongban(PhongbanChucvu phongbanChucvu, String tenPb, String dc) {
        this.phongbanChucvu = phongbanChucvu;
        this.tenPb = tenPb;
        this.dc = dc;
    }
    public Phongban(PhongbanChucvu phongbanChucvu, String tenPb, String dc, Set<Nhanvien> nhanviens) {
       this.phongbanChucvu = phongbanChucvu;
       this.tenPb = tenPb;
       this.dc = dc;
       this.nhanviens = nhanviens;
    }
   
     @GenericGenerator(name="generator", strategy="foreign", parameters=@Parameter(name="property", value="phongbanChucvu"))@Id @GeneratedValue(generator="generator")

    
    @Column(name="MaPB", unique=true, nullable=false)
    public String getMaPb() {
        return this.maPb;
    }
    
    public void setMaPb(String maPb) {
        this.maPb = maPb;
    }

@OneToOne(fetch=FetchType.LAZY)@PrimaryKeyJoinColumn
    public PhongbanChucvu getPhongbanChucvu() {
        return this.phongbanChucvu;
    }
    
    public void setPhongbanChucvu(PhongbanChucvu phongbanChucvu) {
        this.phongbanChucvu = phongbanChucvu;
    }

    
    @Column(name="TenPB", nullable=false)
    public String getTenPb() {
        return this.tenPb;
    }
    
    public void setTenPb(String tenPb) {
        this.tenPb = tenPb;
    }

    
    @Column(name="DC", nullable=false)
    public String getDc() {
        return this.dc;
    }
    
    public void setDc(String dc) {
        this.dc = dc;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="phongban")
    public Set<Nhanvien> getNhanviens() {
        return this.nhanviens;
    }
    
    public void setNhanviens(Set<Nhanvien> nhanviens) {
        this.nhanviens = nhanviens;
    }




}

