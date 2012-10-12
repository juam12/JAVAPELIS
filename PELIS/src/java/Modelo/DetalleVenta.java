/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Juan
 */
public class DetalleVenta {
    private int _codigoVenta;
    private int _codigoPelicula;
    private double _cantidad;

    public int getCodigoVenta() {
        return _codigoVenta;
    }

    public void setCodigoVenta(int _codigoVenta) {
        this._codigoVenta = _codigoVenta;
    }

    public int getCodigoPelicula() {
        return _codigoPelicula;
    }

    public void setCodigoPelicula(int _codigoPelicula) {
        this._codigoPelicula = _codigoPelicula;
    }

    public double getCantidad() {
        return _cantidad;
    }

    public void setCantidad(double _cantidad) {
        this._cantidad = _cantidad;
    }

    
}
