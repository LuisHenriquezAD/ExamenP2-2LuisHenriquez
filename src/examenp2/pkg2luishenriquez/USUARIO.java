/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenp2.pkg2luishenriquez;

 
public class USUARIO {
    
private int edad;
private String usuario;
private String contra;
private String tipo;

    public USUARIO(int edad, String usuario, String contra, String tipo) {
        this.edad = edad;
        this.usuario = usuario;
        this.contra = contra;
        this.tipo = tipo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "USUARIO" 
                + "Usuario=" + usuario 
                + ", Edad=" + edad 
                + ", Contrasena=" + contra 
                + ", Tipo=" + tipo + ',' ;
    }


    
}
