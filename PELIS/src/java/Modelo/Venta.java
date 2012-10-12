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
     private int _codigoVenta;
    private int _idUsuario;
    private Timestamp _fecha;

    public int getCodigoVenta() {
        return _codigoVenta;
    }

    public void setCodigoVenta(int _codigoVenta) {
        this._codigoVenta = _codigoVenta;
    }

    public Timestamp getFecha() {
        return _fecha;
    }

    public void setFecha(Timestamp _fecha) {
        this._fecha = _fecha;
    }

    public int getIdUsuario() {
        return _idUsuario;
    }

    public void setIdUsuario(int _idUsuario) {
        this._idUsuario = _idUsuario;
    }
    
    
}
