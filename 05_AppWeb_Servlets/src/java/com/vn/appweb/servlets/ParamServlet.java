/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.appweb.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Creando un formulario y recibiendo sus campos como parametros
 *
 * @author PC
 */
public class ParamServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
//     <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest peticionHttp, HttpServletResponse respuestaHttp)
            throws ServletException, IOException {

        respuestaHttp.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = respuestaHttp.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Form y Param</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ParamServlet at " + peticionHttp.getContextPath() + "</h1>");
            out.println("<form name='formDatos' action='./formulario' method='POST'>");
            //campo nombre
            out.println("<label>Nombre: </label>");
            out.println("<input id='nombre_campo' name='nombre_campo' required/>");
            //campo email
            out.println("<br/><br/><label>Email: </label>");
            out.println("<input type='email' id='email' name='email'required/>");

            out.println("<br/><br/><input type='submit' value='Envia parametros'/>");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
        }

    }
//    static boolean isValid(String email) {
//      String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
//      return email.matches(regex);
//   }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest peticionHttp, HttpServletResponse respuestaHttp)
            throws ServletException, IOException {
        respuestaHttp.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = respuestaHttp.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Form y Param</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ParamServlet at " + peticionHttp.getContextPath() + "</h1>");
            //salida de nombre
            String valorCampo = peticionHttp.getParameter("nombre_campo");
            if (valorCampo == null || "".equals(valorCampo)) {
                out.print("<p style='color:red'>No se ha recibido el parametro</p>");
            } else {
                out.print("<p style='color:green'>Nombre del campo: " + valorCampo + "</p>");
            }
            //salida de email
            String valorEmail = peticionHttp.getParameter("email");
            if (valorEmail == null || "".equals(valorEmail)) {
                out.print("<p style='color:red'>No se ha recibido el parametro</p>");
            } else {
                out.print("<p style='color:green'>Nombre del campo: " + valorEmail + "</p>");
            }

            //vamos a insertar los datos recibidos
            //jdbc:derby://localhost:1527/db_prueba
            try {
                Class.forName("org.apache.derby.jdbc.ClientDriver");
                DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver());

            } catch (Exception e) {
                out.print("<p style='color:red'>No se ha cargado DerbyDB</p>");
            }

            try (Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/db_prueba", "root", "1234")) {

                String sqlQuery = "INSERT INTO PERSONA(NOMBRE,EMAIL) VALUES('" + valorCampo + "','" + valorEmail +"')";
                Statement sentenciaSql= con.createStatement();
                sentenciaSql.executeUpdate(sqlQuery);

            } catch (SQLException ex) {
                out.print("<p style='color:red'>error sql de paramServlet</p>");
            }

            out.println("</body>");
            out.println("</html>");
        }

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Servlet ue envia formularios";
    }// </editor-fold>

}
