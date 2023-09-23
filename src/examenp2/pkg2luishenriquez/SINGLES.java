/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenp2.pkg2luishenriquez;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author LUIS HENRIQUEZ
 */
public class SINGLES {
    private String titulo;
    private Date fecha;
    private int likes;
    
    private List<CANCIONES> canciones = new ArrayList<>();

    public SINGLES() {
        
        
        
    }

    public SINGLES(String titulo, Date fecha, int likes) {
        this.titulo = titulo;
        this.fecha = fecha;
        this.likes = likes;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }
    
    public void addCanciones(CANCIONES cancione) {
        canciones.add(cancione);
    }
    
    public List<CANCIONES> getCanciones() {
        return canciones;
    }

    public void setCanciones(List<CANCIONES> canciones) {
        this.canciones = canciones;
    }

    @Override
    public String toString() {
        return "SINGLES" + 
                "Titulo=" + titulo + 
                ", Fecha=" + fecha + 
                ", Likes=" + likes + 
                ", Canciones=" + canciones ;
    }
    
    
    
    
}
