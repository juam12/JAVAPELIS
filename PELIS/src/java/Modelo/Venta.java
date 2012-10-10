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
    private Usuario _cliente;
    private Timestamp _fecha;

    public int getCodigoVenta() {
        return _codigoVenta;
    }

    public void setCodigoVenta(int _codigoVenta) {
        this._codigoVenta = _codigoVenta;
    }

    public Usuario getCliente() {
        return _cliente;
    }

    public void setCliente(Usuario _cliente) {
        this._cliente = _cliente;
    }

    public Timestamp getFecha() {
        return _fecha;
    }

    public void setFecha(Timestamp _fecha) {
        this._fecha = _fecha;
    }
    
    
}
