package itz;

import java.io.Serializable;

public class Amigo implements Serializable{
    private long telefono;
    private String nombre;
    private String direccion;
    public Amigo(String nombre) {
        this.nombre = nombre;
    }
    public Amigo(long telefono, String nombre, String direccion) {
        this.telefono = telefono;
        this.nombre = nombre;
        this.direccion = direccion;
    }
    //getter y setters
    public long getTelefono() {
        return telefono;
    }
    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    @Override
    public String toString() {
        return "Amigo [telefono=" + telefono + ", nombre=" + nombre + ", direccion=" + direccion + "]";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (telefono ^ (telefono >>> 32));
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        result = prime * result + ((direccion == null) ? 0 : direccion.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object otro) {
       if (otro instanceof Amigo) {
        Amigo otroAmigo = (Amigo) otro;
        return this.nombre.equalsIgnoreCase(otroAmigo.nombre);
        
       }else return false;
    }

    
    
    


}
