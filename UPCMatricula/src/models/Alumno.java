package models;

public class Alumno {
    private String codigo;
    private String nombre;
    private String apellido;

    public Alumno() {
    }

    public Alumno(String codigo, String nombre, String apellido) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Alumno{" + "codigo=" + codigo + ", nombre=" + nombre + ", apellido=" + apellido + '}';
    }
    
    
}
