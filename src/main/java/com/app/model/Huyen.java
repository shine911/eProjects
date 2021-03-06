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
 * Huyen generated by hbm2java
 */
@Entity
@Table(name="HUYEN"
    ,schema="dbo"
    ,catalog="sql"
)
public class Huyen  implements java.io.Serializable {


     private String maH;
     private String tenHuyen;
     private Set<Nhanvien> nhanviens = new HashSet<Nhanvien>(0);
     private Set<Quequan> quequans = new HashSet<Quequan>(0);

    public Huyen() {
    }

	
    public Huyen(String maH) {
        this.maH = maH;
    }
    public Huyen(String maH, String tenHuyen, Set<Nhanvien> nhanviens, Set<Quequan> quequans) {
       this.maH = maH;
       this.tenHuyen = tenHuyen;
       this.nhanviens = nhanviens;
       this.quequans = quequans;
    }
   
     @Id 

    
    @Column(name="MaH", unique=true, nullable=false)
    public String getMaH() {
        return this.maH;
    }
    
    public void setMaH(String maH) {
        this.maH = maH;
    }

    
    @Column(name="TenHuyen")
    public String getTenHuyen() {
        return this.tenHuyen;
    }
    
    public void setTenHuyen(String tenHuyen) {
        this.tenHuyen = tenHuyen;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="huyen")
    public Set<Nhanvien> getNhanviens() {
        return this.nhanviens;
    }
    
    public void setNhanviens(Set<Nhanvien> nhanviens) {
        this.nhanviens = nhanviens;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="huyen")
    public Set<Quequan> getQuequans() {
        return this.quequans;
    }
    
    public void setQuequans(Set<Quequan> quequans) {
        this.quequans = quequans;
    }




}


