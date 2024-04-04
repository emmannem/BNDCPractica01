/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.uv.bdncpractica01;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author JMRes
 */
public class DAOProducto implements IDAO<Producto> {

    @Override
    public boolean create(Producto p) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.getCurrentSession();
        Transaction tran = null;
        try {
            tran = session.beginTransaction();
            session.save(p);
            tran.commit();
            return true;
        } catch (Exception ex) {
            if (tran != null) {
                tran.rollback();
            }
            Logger.getLogger(DAOProducto.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public boolean update(Producto p) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.getCurrentSession();
        Transaction tran = null;
        try {
            tran = session.beginTransaction();
            session.update(p);
            tran.commit();
            return true;
        } catch (Exception ex) {
            if (tran != null) {
                tran.rollback();
            }
            Logger.getLogger(DAOProducto.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public boolean delete(Producto p) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.getCurrentSession();
        Transaction tran = null;
        try {
            tran = session.beginTransaction();
            session.delete(p);
            tran.commit();
            return true;
        } catch (Exception ex) {
            if (tran != null) {
                tran.rollback();

            }
            Logger.getLogger(DAOProducto.class
                    .getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public Producto readByID(long id) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.getCurrentSession();
        Transaction tran = null;
        Producto producto = null;
        try {
            tran = session.beginTransaction();
            producto = session.get(Producto.class, id);
            tran.commit();
        } catch (Exception ex) {
            if (tran != null) {
                tran.rollback();

            }
            Logger.getLogger(DAOProducto.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        return producto;
    }

    @Override
    public List<Producto> readAll() {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.getCurrentSession();
        Transaction tran = null;
        List<Producto> producto = null;
        try {
            tran = session.beginTransaction();
            producto = session.createQuery("FROM Producto",Producto.class).list();
            tran.commit();
        } catch (Exception ex) {
            if (tran != null) {
                tran.rollback();

            }
            Logger.getLogger(DAOProducto.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        return producto;
    }
}