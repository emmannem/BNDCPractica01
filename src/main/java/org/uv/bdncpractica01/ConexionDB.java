/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.uv.dapp02practica01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author LENOVO
 */
public class ConexionDB {

    private static ConexionDB cx = null;
    private Connection con = null;

    public static ConexionDB getInstance() {
        if (cx == null) {
            cx = new ConexionDB();
        }
        return cx;

    }

    private ConexionDB() {
        try {
            String url = "jdbc:postgresql://localhost:5432/empresa";
            String pwd = "root";
            String usr = "postgres";

            con = DriverManager.getConnection(url, usr, pwd);
            Logger.getLogger(ConexionDB.class.getName()).
                    log(Level.INFO, "Conectado");
        } catch (SQLException ex) {
            Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

        }

    }

}