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
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Tinh generated by hbm2java
 */
@Entity
@Table(name="TINH"
    ,schema="dbo"
    ,catalog="sql"
)
public class Tinh  implements java.io.Serializable {


     private String maT;
     private String tenTinh;
     private Quequan quequan;
     private Set<Nhanvien> nhanviens = new HashSet<Nhanvien>(0);

    public Tinh() {
    }

	
    public Tinh(String maT, String tenTinh) {
        this.maT = maT;
        this.tenTinh = tenTinh;
    }
    public Tinh(String maT, String tenTinh, Quequan quequan, Set<Nhanvien> nhanviens) {
       this.maT = maT;
       this.tenTinh = tenTinh;
       this.quequan = quequan;
       this.nhanviens = nhanviens;
    }
   
     @Id 

    
    @Column(name="MaT", unique=true, nullable=false)
    public String getMaT() {
        return this.maT;
    }
    
    public void setMaT(String maT) {
        this.maT = maT;
    }

    
    @Column(name="TenTinh", nullable=false)
    public String getTenTinh() {
        return this.tenTinh;
    }
    
    public void setTenTinh(String tenTinh) {
        this.tenTinh = tenTinh;
    }

@OneToOne(fetch=FetchType.LAZY, mappedBy="tinh")
    public Quequan getQuequan() {
        return this.quequan;
    }
    
    public void setQuequan(Quequan quequan) {
        this.quequan = quequan;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="tinh")
    public Set<Nhanvien> getNhanviens() {
        return this.nhanviens;
    }
    
    public void setNhanviens(Set<Nhanvien> nhanviens) {
        this.nhanviens = nhanviens;
    }




}


