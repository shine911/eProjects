package com.app.model.dao;

import com.app.conf.HibernateUtil;
import com.app.model.Mucluong;
import org.hibernate.Session;

import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MucLuongDAO {
    Session session = HibernateUtil.getSessionFactory().openSession();

    public List<Mucluong> getList(){
        String sql = "Select ml from "+Mucluong.class.getName()+" ml order by ml.maMl";
        Query<Mucluong> mucluongQuery = session.createQuery(sql);
        List<Mucluong> mucluongList = mucluongQuery.getResultList();
        return mucluongList;
    }

    public Mucluong getById(String id){
        String sql = "Select ml from " + Mucluong.class.getName() + " ml where ml.maMl = :maMl";
        Query<Mucluong> mucluongQuery = session.createQuery(sql);
        mucluongQuery.setParameter("maMl", id);
        return (Mucluong) mucluongQuery.getSingleResult();
    }

    public Mucluong insert(String MaML, long Sotien){
        session.beginTransaction();
        Mucluong mucluong = new Mucluong();
        mucluong.setMaMl(MaML);
        mucluong.setSoTien(Sotien);
        session.save(mucluong);
        session.getTransaction().commit();
        return mucluong;
    }

    public Mucluong update(String MaML, long Sotien){
        session.beginTransaction();
        Mucluong mucluong = session.get(Mucluong.class, MaML);
        mucluong.setSoTien(Sotien);
        session.update(mucluong);
        session.getTransaction().commit();
        return mucluong;
    }

    public void delete(String MaML){
        session.beginTransaction();
        Mucluong mucluong = session.get(Mucluong.class, MaML);
        session.delete(mucluong);
        session.getTransaction().commit();
    }
}
