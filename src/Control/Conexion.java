package Control;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Conexion {
    private Connection conex = null;
    private String bd = "ts";
    private String usuario = "root";
    private String clave = "";
    private String cadena = "jdbc:mysql://localhost:3306/" + bd;
    
    public Connection conectate(){
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conex = DriverManager.getConnection(cadena, usuario, clave);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error: "+ ex);
        }
        return conex;
    }    
}