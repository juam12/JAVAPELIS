/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PoolDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Stack;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Juan
 */
public class ConexionPool implements IConexionPool{
   protected Stack pool;
    protected String connectionURL="jdbc:mysql://localhost:3306/javabus";
    protected String userName="root";
    protected String password="33732856bag";

    /**
     * Genera Pool básico de conexión utilizando URL , contraseña y nombre
     */
    public ConexionPool()
    {
	pool = new Stack();
    }
    public ConexionPool(String aConnectionURL, String aUserName, String aPassword)
    {
	connectionURL = aConnectionURL;
	userName = aUserName;
	password = aPassword;
	pool = new Stack();
    } 
    


    /** Adquiere conexión del Pool o genera una nueva si el pool esta vacío
     */

    public synchronized Connection extraerConexion()
    throws SQLException

    { 
	// Si el pool no esta vacio, tomar una conexion  
	if(!pool.empty()) 
	    { 
		return (Connection) pool.pop();
	    } 
	else 
	    { 
            try {
                // Entonces generar una conexion nueva
                Class.forName("com.mysql.jdbc.Driver");
                return DriverManager.getConnection(connectionURL, userName, password);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ConexionPool.class.getName()).log(Level.SEVERE, null, ex);
            }
	    } 
        return null;
    }

 

    
    /** Regresar conexion al pool 
     */
	public synchronized void liberarConexion(Connection conn)
	throws SQLException 
	{ 
            conn.close();
	    pool.push(conn);
	   } 
    
}
