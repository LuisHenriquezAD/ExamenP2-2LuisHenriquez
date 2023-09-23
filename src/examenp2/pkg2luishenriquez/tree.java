/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenp2.pkg2luishenriquez;
import java.util.ArrayList;
import java.util.List;

class tree {
    private TreeNode root;

    public tree() {
        this.root = new TreeNode("Root"); // El nodo raíz es ficticio y no contiene datos.
    }

    public TreeNode getRoot() {
        return root;
    }

    public void agregarArtista(ARTISTAS artista) {
        TreeNode artistaNode = new TreeNode(artista);
        root.addChild(artistaNode);
    }

    public void agregarAlbum(ALBUM album) {
        TreeNode albumNode = new TreeNode(album);
        TreeNode artistaNode = root.getChildren().get(root.getChildren().size() - 1); // Obtén el último nodo de Artistas
        artistaNode.addChild(albumNode);
    }

    public void agregarSingle(SINGLES single) {
        TreeNode singleNode = new TreeNode(single);
        TreeNode artistaNode = root.getChildren().get(root.getChildren().size() - 1); // Obtén el último nodo de Artistas
        artistaNode.addChild(singleNode);
    }

    public void agregarCancion(CANCIONES cancion) {
        TreeNode cancionNode = new TreeNode(cancion);
        TreeNode artistaNode = root.getChildren().get(root.getChildren().size() - 1); // Obtén el último nodo de Artistas
        TreeNode albumNode = artistaNode.getChildren().get(artistaNode.getChildren().size() - 1); // Obtén el último nodo de Albums o Singles
        albumNode.addChild(cancionNode);
    }
}
