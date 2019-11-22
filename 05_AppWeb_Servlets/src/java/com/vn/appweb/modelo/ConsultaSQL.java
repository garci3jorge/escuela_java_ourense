/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.appweb.modelo;

import com.sun.org.apache.bcel.internal.generic.RETURN;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PC
 */
public class ConsultaSQL {

    public ConsultaSQL() {
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver());

        } catch (Exception e) {
            System.out.print("<p style='color:red'>No se ha cargado DerbyDB</p>");
        }

    }

    public List<DatosPersona> leerTabla(String busq) {
        ArrayList<DatosPersona> datos = new ArrayList<>();
        busq = busq == null ? "" : busq;
        try (Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/db_prueba", "root", "1234")) {

            String sqlQuery = "SELECT * from PERSONA where upper(trim(nombre)) like ? escape '!' ";
            //sentencia preparada para eitar sql injection
            PreparedStatement sentenciaSQL = con.prepareStatement(sqlQuery);
            busq = busq.toUpperCase().trim();
            busq = busq.replace("!", "!!");
            busq = busq.replace("%", "!%");
            busq = busq.replace("_", "!_");
            busq = busq.replace("[", "![");

            sentenciaSQL.setString(1, "%" + busq.toUpperCase().trim() + "%");// sustituir el primer ? por el '(contenido del nombre)'
            ResultSet resultado = sentenciaSQL.executeQuery();
            while (resultado.next()) {
                String nombre = resultado.getString("nombre");
                String email = resultado.getString("email");
                DatosPersona dp = new DatosPersona();
                dp.setNombre(nombre);
                dp.setEmail(email);
                datos.add(dp);
            }
            return datos;

        } catch (SQLException ex) {
            System.out.print("<p style='color:red'>error sql de paramServlet</p>");
        }

        return null;
    }

}
