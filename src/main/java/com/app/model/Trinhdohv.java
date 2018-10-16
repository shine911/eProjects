package com.app.model;
// Generated Oct 16, 2018 12:07:59 PM by Hibernate Tools 4.3.1


import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Trinhdohv generated by hbm2java
 */
@Entity
@Table(name="TRINHDOHV"
    ,schema="dbo"
    ,catalog="sql"
)
public class Trinhdohv  implements java.io.Serializable {


     private String maTdhv;
     private String tenTdhv;
     private Set<Nhanvien> nhanviens = new HashSet<Nhanvien>(0);

    public Trinhdohv() {
    }

	
    public Trinhdohv(String maTdhv, String tenTdhv) {
        this.maTdhv = maTdhv;
        this.tenTdhv = tenTdhv;
    }
    public Trinhdohv(String maTdhv, String tenTdhv, Set<Nhanvien> nhanviens) {
       this.maTdhv = maTdhv;
       this.tenTdhv = tenTdhv;
       this.nhanviens = nhanviens;
    }
   
     @Id 

    
    @Column(name="MaTDHV", unique=true, nullable=false)
    public String getMaTdhv() {
        return this.maTdhv;
    }
    
    public void setMaTdhv(String maTdhv) {
        this.maTdhv = maTdhv;
    }

    
    @Column(name="TenTDHV", nullable=false)
    public String getTenTdhv() {
        return this.tenTdhv;
    }
    
    public void setTenTdhv(String tenTdhv) {
        this.tenTdhv = tenTdhv;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="trinhdohv")
    public Set<Nhanvien> getNhanviens() {
        return this.nhanviens;
    }
    
    public void setNhanviens(Set<Nhanvien> nhanviens) {
        this.nhanviens = nhanviens;
    }




}


