package com.app.model;
// Generated Oct 16, 2018 12:07:59 PM by Hibernate Tools 4.3.1


import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * Nhanvien generated by hbm2java
 */
@Entity
@Table(name="NHANVIEN"
    ,schema="dbo"
    ,catalog="sql"
)
public class Nhanvien  implements java.io.Serializable {


     private String maNv;
     private Chucvu chucvu;
     private Chuyenmon chuyenmon;
     private Huyen huyen;
     private Phongban phongban;
     private Thannhan thannhan;
     private Tinh tinh;
     private Trinhdohv trinhdohv;
     private Trinhdonn trinhdonn;
     private String hoTen;
     private boolean phai;
     private Date ngSinh;
     private String dc;
     private int dienThoai;
     private String email;
     private String password;
     private Set<KtklNhanvien> ktklNhanviens = new HashSet<KtklNhanvien>(0);
     private Set<Phieuluong> phieuluongs = new HashSet<Phieuluong>(0);
     private NhanvienLilichct nhanvienLilichct;

    public Nhanvien() {
    }

	
    public Nhanvien(Chucvu chucvu, Chuyenmon chuyenmon, Huyen huyen, Phongban phongban, Thannhan thannhan, Tinh tinh, Trinhdohv trinhdohv, Trinhdonn trinhdonn, String hoTen, boolean phai, Date ngSinh, String dc, int dienThoai, String email, String password) {
        this.chucvu = chucvu;
        this.chuyenmon = chuyenmon;
        this.huyen = huyen;
        this.phongban = phongban;
        this.thannhan = thannhan;
        this.tinh = tinh;
        this.trinhdohv = trinhdohv;
        this.trinhdonn = trinhdonn;
        this.hoTen = hoTen;
        this.phai = phai;
        this.ngSinh = ngSinh;
        this.dc = dc;
        this.dienThoai = dienThoai;
        this.email = email;
        this.password = password;
    }
    public Nhanvien(Chucvu chucvu, Chuyenmon chuyenmon, Huyen huyen, Phongban phongban, Thannhan thannhan, Tinh tinh, Trinhdohv trinhdohv, Trinhdonn trinhdonn, String hoTen, boolean phai, Date ngSinh, String dc, int dienThoai, String email, String password, Set<KtklNhanvien> ktklNhanviens, Set<Phieuluong> phieuluongs, NhanvienLilichct nhanvienLilichct) {
       this.chucvu = chucvu;
       this.chuyenmon = chuyenmon;
       this.huyen = huyen;
       this.phongban = phongban;
       this.thannhan = thannhan;
       this.tinh = tinh;
       this.trinhdohv = trinhdohv;
       this.trinhdonn = trinhdonn;
       this.hoTen = hoTen;
       this.phai = phai;
       this.ngSinh = ngSinh;
       this.dc = dc;
       this.dienThoai = dienThoai;
       this.email = email;
       this.password = password;
       this.ktklNhanviens = ktklNhanviens;
       this.phieuluongs = phieuluongs;
       this.nhanvienLilichct = nhanvienLilichct;
    }
   
     @GenericGenerator(name="generator", strategy="foreign", parameters=@Parameter(name="property", value="thannhan"))@Id @GeneratedValue(generator="generator")

    
    @Column(name="MaNV", unique=true, nullable=false)
    public String getMaNv() {
        return this.maNv;
    }
    
    public void setMaNv(String maNv) {
        this.maNv = maNv;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="MaCV", nullable=false)
    public Chucvu getChucvu() {
        return this.chucvu;
    }
    
    public void setChucvu(Chucvu chucvu) {
        this.chucvu = chucvu;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="MaCM", nullable=false)
    public Chuyenmon getChuyenmon() {
        return this.chuyenmon;
    }
    
    public void setChuyenmon(Chuyenmon chuyenmon) {
        this.chuyenmon = chuyenmon;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="MaH", nullable=false)
    public Huyen getHuyen() {
        return this.huyen;
    }
    
    public void setHuyen(Huyen huyen) {
        this.huyen = huyen;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="MaPB", nullable=false)
    public Phongban getPhongban() {
        return this.phongban;
    }
    
    public void setPhongban(Phongban phongban) {
        this.phongban = phongban;
    }

@OneToOne(fetch=FetchType.LAZY)@PrimaryKeyJoinColumn
    public Thannhan getThannhan() {
        return this.thannhan;
    }
    
    public void setThannhan(Thannhan thannhan) {
        this.thannhan = thannhan;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="MaT", nullable=false)
    public Tinh getTinh() {
        return this.tinh;
    }
    
    public void setTinh(Tinh tinh) {
        this.tinh = tinh;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="MaTDHV", nullable=false)
    public Trinhdohv getTrinhdohv() {
        return this.trinhdohv;
    }
    
    public void setTrinhdohv(Trinhdohv trinhdohv) {
        this.trinhdohv = trinhdohv;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="MaTDNN", nullable=false)
    public Trinhdonn getTrinhdonn() {
        return this.trinhdonn;
    }
    
    public void setTrinhdonn(Trinhdonn trinhdonn) {
        this.trinhdonn = trinhdonn;
    }

    
    @Column(name="HoTen", nullable=false)
    public String getHoTen() {
        return this.hoTen;
    }
    
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    
    @Column(name="Phai", nullable=false)
    public boolean isPhai() {
        return this.phai;
    }
    
    public void setPhai(boolean phai) {
        this.phai = phai;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="NgSinh", nullable=false, length=23)
    public Date getNgSinh() {
        return this.ngSinh;
    }
    
    public void setNgSinh(Date ngSinh) {
        this.ngSinh = ngSinh;
    }

    
    @Column(name="DC", nullable=false)
    public String getDc() {
        return this.dc;
    }
    
    public void setDc(String dc) {
        this.dc = dc;
    }

    
    @Column(name="DienThoai", nullable=false)
    public int getDienThoai() {
        return this.dienThoai;
    }
    
    public void setDienThoai(int dienThoai) {
        this.dienThoai = dienThoai;
    }

    
    @Column(name="Email", nullable=false)
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    
    @Column(name="Password", nullable=false)
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="nhanvien")
    public Set<KtklNhanvien> getKtklNhanviens() {
        return this.ktklNhanviens;
    }
    
    public void setKtklNhanviens(Set<KtklNhanvien> ktklNhanviens) {
        this.ktklNhanviens = ktklNhanviens;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="nhanvien")
    public Set<Phieuluong> getPhieuluongs() {
        return this.phieuluongs;
    }
    
    public void setPhieuluongs(Set<Phieuluong> phieuluongs) {
        this.phieuluongs = phieuluongs;
    }

@OneToOne(fetch=FetchType.LAZY, mappedBy="nhanvien")
    public NhanvienLilichct getNhanvienLilichct() {
        return this.nhanvienLilichct;
    }
    
    public void setNhanvienLilichct(NhanvienLilichct nhanvienLilichct) {
        this.nhanvienLilichct = nhanvienLilichct;
    }




}

