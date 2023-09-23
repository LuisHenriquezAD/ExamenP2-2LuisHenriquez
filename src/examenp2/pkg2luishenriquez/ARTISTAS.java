package examenp2.pkg2luishenriquez;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LUIS HENRIQUEZ
 */
public class ARTISTAS {

    private String nombre;
    private int canciones;
    private int albums;
    private List<ALBUM> albumes = new ArrayList<>();
    private List<SINGLES> singles = new ArrayList<>();

    public ARTISTAS() {
    }

    public ARTISTAS(String nombre, int canciones, int albums) {
        this.nombre = nombre;
        this.canciones = canciones;
        this.albums = albums;
    }

    public void addSingle(SINGLES single) {
        singles.add(single);
    }

    public void addAlbum(ALBUM album) {
        albumes.add(album);
    }

    public List<ALBUM> getAlbumes() {
        return albumes;
    }

    public List<SINGLES> getSingles() {
        return singles;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCanciones() {
        return canciones;
    }

    public void setCanciones(int canciones) {
        this.canciones = canciones;
    }

    public int getAlbums() {
        return albums;
    }

    public void setAlbums(int albums) {
        this.albums = albums;
    }

    @Override
    public String toString() {
        return "ARTISTAS" + "Nombre=" + nombre
                + ", Canciones=" + canciones
                + ", Albums=" + albums;
    }
    
    

}
