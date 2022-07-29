package Principal;

import Vistas.*;
import Modelo.*;

public class Main {
    
    public static void main(String[] args){
        //1.  Llamar la clase conexion para conectar con la BD
        Conexion conexionDB = new Conexion();
        
        //2. Crear la instancia de la vista Login
        Login login = new Login();
        // se hace visible la interfaz
        login.setVisible(true);
    
    }
    
}
