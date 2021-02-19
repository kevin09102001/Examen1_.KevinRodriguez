/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1_kevinrodriguez;

import java.util.ArrayList;

/**
 *
 * @author Kevin
 */
public class usuario {
    protected String codigo, primer_nombre,primer_apellido,edad;
    private ArrayList <Libro> libro=new ArrayList();

    public usuario(String codigo, String primer_nombre, String primer_apellido,String edad) {
        this.codigo = codigo;
        this.primer_nombre = primer_nombre;
        this.primer_apellido = primer_apellido;
        this.edad=edad;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    

    public String getPrimer_nombre() {
        return primer_nombre;
    }

    public void setPrimer_nombre(String primer_nombre) {
        this.primer_nombre = primer_nombre;
    }

    public String getPrimer_apellido() {
        return primer_apellido;
    }

    public void setPrimer_apellido(String primer_apellido) {
        this.primer_apellido = primer_apellido;
    }

    public ArrayList<Libro> getLibro() {
        return libro;
    }

    public void setLibro(ArrayList<Libro> libro) {
        this.libro = libro;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }
    

    @Override
    public String toString() {
        return "usuario{" + "codigo=" + codigo + ", primer_nombre=" + primer_nombre + ", primer_apellido=" + primer_apellido + ", libro=" + libro + '}';
    }

  
    
    
}
