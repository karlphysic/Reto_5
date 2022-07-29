package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
    
public class Conexion {
    // 1. crear la instancia de la clase Connection del JAR JDC
    Connection connection;
    //Atributos:
    String driver = "com.mysql.cj.jdbc.Driver";
    String cadenaConexion = "jdbc:mysql://localhost:3306/reto1_db";
    String usuario = "root";
    String contraseña = "";
    
    // 2. Añadimos el constructor de la clase argumentos

    public Conexion() {
     //3.  Intentar hacer conexion con la base de datos desde el constructor de la clase
    // Intentar hacer algo...
        try {
            //4. Buscamos la clase del JAR que coincide con este nombre
            Class.forName(driver);
            // 5. Llamamos la instancia connection a la cual le enviamos los parametros
            //de conexion con la base de datos (cadena de conexion, usuario, contraseña)
            connection = DriverManager.getConnection(cadenaConexion, usuario, contraseña);
            if (connection != null) {
                System.out.println("Conexion exitosa con la base de datos");    
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("No se puedo establecer conexion con la base de datos");
        }
    
    }   

 
    //6. Creamos una función que return la connection de la clase
    public Connection getConnection(){
        return connection;
    }
    
} 
