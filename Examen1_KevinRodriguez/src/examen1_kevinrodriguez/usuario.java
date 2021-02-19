/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1_kevinrodriguez;

/**
 *
 * @author Kevin
 */
public class usuario {
    protected int codigo;
    protected String primer_nombre,primer_apellido;

    public usuario(int codigo, String primer_nombre, String primer_apellido) {
        this.codigo = codigo;
        this.primer_nombre = primer_nombre;
        this.primer_apellido = primer_apellido;
    }
    

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
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

    @Override
    public String toString() {
        return "usuario{" + "codigo=" + codigo + ", primer_nombre=" + primer_nombre + ", primer_apellido=" + primer_apellido + '}';
    }
    
    
}
