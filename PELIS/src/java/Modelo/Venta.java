/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Timestamp;

/**
 *
 * @author Juan
 */
public class Venta {
     private int idVenta;
    private int idUsuario;
    private Timestamp fecha;

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

 

    public Timestamp getFecha() {
        return fecha;
    }

    public void setFecha(Timestamp _fecha) {
        this.fecha = _fecha;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int _idUsuario) {
        this.idUsuario = _idUsuario;
    }
    
    
}
