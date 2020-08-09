/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author raul
 */
public class Alumno {
    
    /*
    Esta clase va a representar a la tabla alumnos de la bd
    a la cual le aplicaremos los principios de poo, implementando
    encapsulamiento, para el acceso a los datos de la tabla 
    a traves de los metodos get y set correspondientes
    */
    
    private int id;
    private String nombre, password, email, pais;
    
    //ahora creamos los getter y setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    
}
