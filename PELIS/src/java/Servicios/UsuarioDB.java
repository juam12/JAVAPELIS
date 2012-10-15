/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Modelo.Usuario;
import PoolDB.ConexionPool;
import PoolDB.IConexionPool;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Juan
 */
public class UsuarioDB {
    
    public static boolean loguin(Usuario usu) throws SQLException{
      IConexionPool pool= new ConexionPool();
      Connection conn= pool.extraerConexion();
      Statement stm = conn.createStatement();
      ResultSet rs;
      int existe = -1;
        try { 
            rs=stm.executeQuery(String.format("select count(*) as existe from usuario where user= '%s'and passoword = '%s'",usu.getUser(), usu.getPassoword()));
            if ( rs.next()) {
                existe = rs.getInt("existe");
                //System.out.println("Entro");
            } 
                          
        }catch (SQLException ex) {
            ex.printStackTrace();    
        }finally{
            pool.liberarConexion(conn);
        }
        if (existe == 1) {
            return true;
        }
        else {
            return false;
        }  
    }
    
}
