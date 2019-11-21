/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.appweb.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * servlet que genera una respuesta en formato html
 *
 * @author PC
 */
public class HolaHtmlServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest peticionHttp,HttpServletResponse respuestaHttp) throws IOException {
        //definimos el tipo de contenido segun los tipos MINE
        //formatos conocidos de ficheros para emails
        respuestaHttp.setContentType("text/html;charset=UTF-8");
        try (PrintWriter salida = respuestaHttp.getWriter()) {

            salida.print("<html>");
            salida.print("<head>");
            salida.print("<title>Web html desde Servlet</title>");
            salida.print("<link  rel='stylesheet' href='/AppWebServlets/saludos/holaCSS'/>");
            salida.print("</head>");
            salida.print("<body>"
                    + "<h1>web HTML desde servlets</h1>"
                    + "<h2>Hola que pasa</h2>"
                    + "<ul>");
            for (int i = 0; i < 10; i++) {
                salida.print("<li class='tamaño"+i+"'>Iteracion " + i + "</li>");
            }
            salida.print("</ul>");
            salida.print("</br>Ruta: "+ peticionHttp.getContextPath());
            salida.print("</br>Metodos: "+ peticionHttp.getMethod());
            salida.print("</body>");
            salida.print("<html>");
            //salida.close(); //ya no hace falta ya que el try lo cierra
        }
    }
}
