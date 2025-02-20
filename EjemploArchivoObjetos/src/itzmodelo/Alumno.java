package itzmodelo;

import java.io.Serializable;

public class Alumno implements Serializable{
    private long noctrl;
    private String nombre;
    private String carrera;
    private int semestre;
    //Constructores sobre carga de constructores
    public Alumno(long noctrl, String nombre, String carrera, int semestre) {
        this.noctrl = noctrl;
        this.nombre = nombre;
        this.carrera = carrera;
        this.semestre = semestre;
    }
    public Alumno() {
    }
    public Alumno(long noctrl) {
        this.noctrl = noctrl;
    }
    // getters y setters
    public long getNoctrl() {
        return noctrl;
    }
    public void setNoctrl(long noctrl) {
       if (noctrl>0) this.noctrl = noctrl;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCarrera() {
        return carrera;
    }
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    public int getSemestre() {
        return semestre;
    }
    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
    @Override
    public String toString() {
        return "noctrl=" + noctrl + ", nombre=" + nombre + ", carrera=" + carrera + ", semestre=" + semestre
                ;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (noctrl ^ (noctrl >>> 32));
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Alumno other = (Alumno) obj;
        if (noctrl != other.noctrl)
            return false;
        return true;
    }

    

    
    



}
