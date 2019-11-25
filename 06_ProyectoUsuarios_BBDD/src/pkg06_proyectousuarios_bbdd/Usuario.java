/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg06_proyectousuarios_bbdd;

/**
 *
 * @author PC
 */
public class Usuario {
    int id;
    String email;
    String password;
    String nombre;
    int age;

     public Usuario(String email, String password, String nombre, int age) {
        this.email = email;
        this.password = password;
        this.nombre = nombre;
        this.age = age;
    }
   
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

  
}
