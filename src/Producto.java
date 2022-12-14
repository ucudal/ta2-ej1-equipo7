/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author juanc
 */
public class Producto implements IProducto {

    private Comparable codProducto;
    private Integer precio;
    private Integer stock;
    private String nombre;

    public Producto(Comparable codProducto, Integer precio, Integer stock, String nombre){
        this.codProducto = codProducto;
        this.precio = precio;
        this.stock = stock;
        this.nombre = nombre;
    }

    @Override
    public Comparable getCodProducto() {
        return this.codProducto;
    }

    @Override
    public Integer getPrecio() {
        return this.precio;
    }

    @Override
    public void setPrecio(Integer precio) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Integer getStock() {
        return this.stock;
    }

    @Override
    public void agregarCantidadStock(Integer stock) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void restarCantidadStock(Integer stock) {
        this.stock -= stock;
        if (this.stock < 0) {
            this.stock = 0;
        }
    }

    @Override
    public String getNombre() {
        return this.nombre;
    }

    @Override
    public void setNombre(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
