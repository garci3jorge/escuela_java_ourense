/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg06_proyectousuarios_bbdd;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PC
 */
public class ServicioUsuarios {

    public void insertar(int id, String email, String password, String nombre, int age) {
        try {
            Connection miConecxion = DriverManager.getConnection("jdbc:derby://localhost:1527/Usuario", "root", "1234");

            PreparedStatement sentenciaSQL = miConecxion.prepareStatement("INSERT INTO USUARIO( EMAIL, PASSWORD, NOMBRE, AGE) VALUES(?, ?, ?,?)");

            sentenciaSQL.setString(1, email);
            sentenciaSQL.setString(2, password);
            sentenciaSQL.setString(3, nombre);
            sentenciaSQL.setInt(4, age);
            sentenciaSQL.executeUpdate();

        } catch (Exception e) {
            System.out.print("<p style='color:red'>No se ha cargado DerbyDB</p>");
        }
    }

    public void modificar(String email, String password, String nombre, int age) {
        try {
            Connection miConecxion = DriverManager.getConnection("jdbc:derby://localhost:1527/Usuario", "root", "1234");

            PreparedStatement sentenciaSQL = miConecxion.prepareStatement("UPDATE USUARIO SET EMAIL=?, PASSWORD=?, NOMBRE=?, AGE=? WHERE EMAIL=?");

            sentenciaSQL.setString(1, email);
            sentenciaSQL.setString(3, password);
            sentenciaSQL.setString(2, nombre);
            sentenciaSQL.setInt(4, age);
            sentenciaSQL.setString(5, "paco@paco.como");
            sentenciaSQL.executeUpdate();
            System.out.println("DATOS MODIFICADOS CORRECTAMENTE");

        } catch (Exception e) {
            System.out.print("<p style='color:red'>No se ha añadido modificado al usuario</p>");
        }
    }
    
    public void eliminar() {
        try {
            Connection miConecxion = DriverManager.getConnection("jdbc:derby://localhost:1527/Usuario", "root", "1234");

            PreparedStatement sentenciaSQL = miConecxion.prepareStatement("DELETE FROM USUARIO WHERE EMAIL=?");

            
            sentenciaSQL.setString(1, "paco@paco.como");
            sentenciaSQL.executeUpdate();
            System.out.println("Usuario eliminado correctamente");

        } catch (Exception e) {
            System.out.print("<p style='color:red'>No se ha podido eliminar al usuario</p>");
        }
    }

    public List<Usuario> leerUnoPorEmail(String busq) {
        ArrayList<Usuario> datos = new ArrayList<>();
        busq = busq == null ? "" : busq;
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver());
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Usuario", "root", "1234");

            String sqlQuery = "SELECT EMAIL FROM USUARIO WHERE upper(trim(EMAIL)) like ? escape '!'";
            PreparedStatement sentenciaSQL = con.prepareStatement(sqlQuery);
            busq = busq.toUpperCase().trim();
            busq = busq.replace("!", "!!");
            busq = busq.replace("%", "!%");
            busq = busq.replace("_", "!_");
            busq = busq.replace("[", "![");
            sentenciaSQL.setString(1, "%" + busq.toUpperCase().trim() + "%");// sustituir el primer ? por el '(contenido del nombre)'
            ResultSet resultado = sentenciaSQL.executeQuery();
            while (resultado.next()) {

                String email = resultado.getString("email");
                Usuario miUsuario = new Usuario(email, sqlQuery, email, 0);
                miUsuario.setEmail(email);
                datos.add(miUsuario);
            }
            return datos;

        } catch (Exception e) {
            System.out.print("<p style='color:red'>No se ha devuelto el usuario por email</p>");
        }
        return null;
    }

    public List<Usuario> leerUnoPorID(int busqueda) {
        ArrayList<Usuario> datos2 = new ArrayList<>();

        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver());
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Usuario", "root", "1234");

            String sqlQuery = "SELECT ID FROM USUARIO WHERE ID = ? escape '!'";
            PreparedStatement sentenciaSQL = con.prepareStatement(sqlQuery);

            sentenciaSQL.setInt(1, busqueda);// sustituir el primer ? por el '(contenido del nombre)'
            ResultSet resultado = sentenciaSQL.executeQuery();
            while (resultado.next()) {

                int id = resultado.getInt(0);
                Usuario miUsuario2 = new Usuario(sqlQuery, sqlQuery, sqlQuery, id);

                miUsuario2.setId(id);
                datos2.add(miUsuario2);
            }
            return datos2;

        } catch (Exception e) {
            System.out.print("<p style='color:red'>No se ha devuelto el usuario por id</p>");
        }
        return null;
    }

}
