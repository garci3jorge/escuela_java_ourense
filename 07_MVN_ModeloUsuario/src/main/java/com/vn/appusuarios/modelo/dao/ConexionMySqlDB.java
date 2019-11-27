/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.appusuarios.modelo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pc
 */
public class ConexionMySqlDB {

	// public static final String URL_CONEXION ="jdbc:derby://localhost:1527/db_usuarios";
	public static final String URL_CONEXION = "jdbc:mysql://localhost:3306/db_usuarios";
	public static final String USUARIO_DB = "root";
	public static final String PASSWORD_DB = "1234";
	private static boolean driversCargados = false;

	private static void cargarDrivers() throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException {

		Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

	}

	public static Connection obtenerConexion() throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException {
		if (!driversCargados) {
			cargarDrivers();
			//crearDBusuarios();
			driversCargados = true;
		}

		return DriverManager.getConnection(URL_CONEXION, USUARIO_DB, PASSWORD_DB);

	}

	public static void crearDBusuarios() throws SQLException {
    	Connection conex= DriverManager.getConnection(URL_CONEXION,USUARIO_DB, PASSWORD_DB);
    	Statement stmt= conex.createStatement();
    	String createTableSQL = "CREATE TABLE usuario (\n" + 
    			"	id INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY \n" + 
    			"		(START WITH 1, INCREMENT BY 1),\n" + 
    			"	email VARCHAR(255) NOT NULL,\n" + 
    			"	password VARCHAR(50) NOT NULL,\n" + 
    			"	nombre VARCHAR(50) NOT NULL,\n" + 
    			"	edad INTEGER NOT NULL,\n" + 
    			"	CONSTRAINT primary_key PRIMARY KEY(id),\n" + 
    			"	CONSTRAINT unique_email UNIQUE(email)\n" + 
    			")";
    	stmt.executeUpdate(createTableSQL);
    	conex.close();
    	
    }
}
