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
public class Libro extends usuario {

    protected String autores, titulo, genero, Editoriales, idioma, estado_libro;
    protected int isbn, año_escribió;

    public Libro(String autores, String titulo, String genero, String Editoriales, String idioma, String estado_libro, int isbn, int año_escribió, int codigo, String primer_nombre, String primer_apellido) {
        super(codigo, primer_nombre, primer_apellido);
        this.autores = autores;
        this.titulo = titulo;
        this.genero = genero;
        this.Editoriales = Editoriales;
        this.idioma = idioma;
        this.estado_libro = estado_libro;
        this.isbn = isbn;
        this.año_escribió = año_escribió;
    }

    public String getAutores() {
        return autores;
    }

    public void setAutores(String autores) {
        this.autores = autores;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEditoriales() {
        return Editoriales;
    }

    public void setEditoriales(String Editoriales) {
        this.Editoriales = Editoriales;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getEstado_libro() {
        return estado_libro;
    }

    public void setEstado_libro(String estado_libro) {

        this.estado_libro = estado_libro;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public int getAño_escribió() {
        return año_escribió;
    }

    public void setAño_escribió(int año_escribió) {
        this.año_escribió = año_escribió;
    }

    @Override
    public String toString() {
        return super.toString() + "Libro{" + "autores=" + autores + ", titulo=" + titulo + ", genero=" + genero + ", Editoriales=" + Editoriales + ", idioma=" + idioma + ", estado_libro=" + estado_libro + ", isbn=" + isbn + ", a\u00f1o_escribi\u00f3=" + año_escribió + '}';
    }

}
