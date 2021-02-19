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
public class Libro  {

    protected String autores, titulo, genero, Editoriales, idioma, estado_libro,isbn, año_escribió,año_ingresa;
    

    public Libro(String autores, String titulo, String genero, String Editoriales, String idioma,String año_escribió,String isbn, String año_ingresa,String estado_libro) {
        this.autores = autores;
        this.titulo = titulo;
        this.genero = genero;
        this.Editoriales = Editoriales;
        this.idioma = idioma;
        this.estado_libro = estado_libro;
        this.isbn = isbn;
        this.año_escribió = año_escribió;
        this.año_ingresa = año_ingresa;
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

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAño_escribió() {
        return año_escribió;
    }

    public void setAño_escribió(String año_escribió) {
        this.año_escribió = año_escribió;
    }

    public String getAño_ingresa() {
        return año_ingresa;
    }

    public void setAño_ingresa(String año_ingresa) {
        this.año_ingresa = año_ingresa;
    }

   
    @Override
    public String toString() {
        return  titulo ;
    }
    


 
    
}

