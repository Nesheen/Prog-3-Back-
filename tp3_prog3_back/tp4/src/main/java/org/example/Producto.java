package org.example;

import java.util.Objects;

public class Producto {
    private Integer codigo;
    private String nombre;
    private Integer precio;

    public Producto(Integer codigo, String nombre, Integer precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }
    //getters
    public Integer getCodigo() {return codigo;}
    public String getNombre() {return nombre;}
    public Integer getPrecio() {return precio;}

    //setters
    public void setCodigo(Integer codigo) {this.codigo = codigo;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setPrecio(Integer precio) {this.precio = precio;}

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) return false;
        Producto producto = (Producto) obj;
        return Objects.equals(codigo, producto.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }


    @Override
    public String toString() {
        return  "\n"+
                "Codigo:" + codigo + "\n" +
                "Nombre:" + nombre + "\n" +
                "Precio:" + precio + "\n" ;
    }
}

