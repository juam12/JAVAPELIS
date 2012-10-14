/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PoolDB;

import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Juan
 */
public interface IConexionPool {
    public Connection extraerConexion() throws SQLException;
    public void liberarConexion(Connection conn) throws SQLException;
}
