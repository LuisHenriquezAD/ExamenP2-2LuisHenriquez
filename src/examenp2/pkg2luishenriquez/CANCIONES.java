/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenp2.pkg2luishenriquez;

/**
 *
 * @author LUIS HENRIQUEZ
 */
class CANCIONES {
 private String titulo;
 private int duracion;

    public CANCIONES(String titulo, int duracion) {
        this.titulo = titulo;
        this.duracion = duracion;
    }

    CANCIONES() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "CANCIONES " + 
                "Titulo=" + titulo + 
                ", Duracion=" + duracion ;
    }
 
 
}
