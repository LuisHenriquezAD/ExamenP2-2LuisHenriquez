/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenp2.pkg2luishenriquez;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author LUIS HENRIQUEZ
 */
public class ALBUM {
    private String titulo;
    private Date fecha;
    private int likes;
    private int canciones;
    private List<CANCIONES> Canciones = new ArrayList<>();

    ALBUM() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void addCanciones(CANCIONES cancione) {
        Canciones.add(cancione);
    }
    
    public List<CANCIONES> getCanciones() {
        return Canciones;
    }
    public ALBUM(String titulo, Date fecha, int likes, int canciones) {
        this.titulo = titulo;
        this.fecha = fecha;
        this.likes = likes;
        this.canciones = canciones;
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

    public int getCancioness() {
        return canciones;
    }

    public void setCanciones(int canciones) {
        this.canciones = canciones;
    }

    @Override
    public String toString() {
        return  titulo;
    }
    
    
    
    
}
