package org.example;

public class Producto {
    private String codigo;
    private String nombre;
    private String proveedor;
    private double precio;

    public Producto(String codigo, String nombre, String proveedor, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.proveedor = proveedor;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", proveedor='" + proveedor + '\'' +
                ", precio=" + precio +
                '}';
    }
}

