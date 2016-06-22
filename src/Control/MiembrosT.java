package Control;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class MiembrosT {
    Conexion con = new Conexion();
    Connection cx = null;
    Statement st = null, st1 = null;
    ResultSet rs = null;
    String sql;
    
    public ResultSet ListarMiembros(){
        sql = "select id_miembro, apellido_paterno, apellido_materno, nombre, telefono_1, condicion, grupo, pertenece_a from miembro order by apellido_paterno";
        try {
            cx = con.conectate();
            st = cx.createStatement();
            rs = st.executeQuery(sql);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return rs;
    }
    
    public ResultSet ListarDetalleMiembro(int a){
        sql = "SELECT id_miembro, apellido_paterno, apellido_materno, nombre, sexo, direccion, telefono_1, telefono_2, telefono_3, email, cumpleaños, (YEAR(CURDATE())-YEAR(cumpleaños)) - (RIGHT(CURDATE(),5)<RIGHT(cumpleaños,5)) AS edad, dni, estado_civil, condicion, grupo, pertenece_a FROM miembro where id_miembro = '"+a+"';";
        try {
            cx = con.conectate();
            st = cx.createStatement();
            rs = st.executeQuery(sql);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return rs;
    }
    
    public ResultSet BuscarMiembros(String a, String b){
        sql = "SELECT id_miembro, apellido_paterno, apellido_materno, nombre, telefono_1, condicion, grupo, pertenece_a FROM miembro WHERE "+a+" LIKE '"+b+"%' ORDER BY apellido_paterno";
        try {
            cx = con.conectate();
            st = cx.createStatement();
            rs = st.executeQuery(sql);
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
        return rs;        
    }    
    
    public void InsertarMiembros(String nombre, String app, String apm, String sexo, String direccion, String telefono1, String telefono2, String telefono3, String email, String cumple, String DNI, String estado, String condicion, String grupo, String pertenece){
        sql = "insert into miembro (nombre, apellido_paterno, apellido_materno, sexo, direccion, telefono_1, telefono_2, telefono_3, email, cumpleaños, dni, estado_civil, condicion, grupo, pertenece_a) values ('"+nombre+"','"+app+"','"+apm+"','"+sexo+"','"+direccion+"','"+telefono1+"','"+telefono2+"','"+telefono3+"','"+email+"','"+cumple+"','"+DNI+"','"+estado+"','"+condicion+"','"+grupo+"','"+pertenece+"')";
        try {
            cx = con.conectate();
            st = cx.createStatement();
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Miembro registrado con éxito");  
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);                        
        }      
    }
    
    public void ModificarMiembros(int id, String nombre, String app, String apm, String sexo, String direccion, String telefono1, String telefono2, String telefono3, String email, String DNI, String estado, String condicion, String grupo, String pertenece){
        sql = "update miembro set nombre='"+nombre+"', apellido_paterno='"+app+"', apellido_materno='"+apm+"', sexo='"+sexo+"', direccion='"+direccion+"', telefono_1='"+telefono1+"', telefono_2='"+telefono2+"', telefono_3='"+telefono3+"', email='"+email+"', dni='"+DNI+"', estado_civil='"+estado+"', condicion='"+condicion+"', grupo='"+grupo+"', pertenece_a='"+pertenece+"' where id_miembro='"+id+"'";
        try {
            cx = con.conectate();
            st = cx.createStatement();
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Datos del miembro modificados");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }      
    }
    
    public void EliminarMiembros(int a){
        sql = "delete from miembro where id_miembro = '"+a+"'";
        try {
            cx = con.conectate();
            st = cx.createStatement();
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Miembro eliminado con éxito");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    public ResultSet ListarTalentos(){
        sql = "select * from talento";
        try {
            cx = con.conectate();
            st = cx.createStatement();
            rs = st.executeQuery(sql);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return rs;
    }

    public ResultSet ListarMMMM(String id){
        sql = "SELECT id_miembro, apellido_paterno, apellido_materno, nombre FROM miembro where id_miembro = '"+id+"'";
        try {
          cx = con.conectate();
          st = cx.createStatement();
          rs = st.executeQuery(sql);
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
        return rs;
    }
    
    public ResultSet ListarTalentosDeeee(String id) {                                    
        sql = "SELECT t.nombre FROM miembro a JOIN miembro_talento b ON (a.id_miembro = b.id_miembro) JOIN talento t ON (b.id_talento = t.id_talento) WHERE a.id_miembro = '"+id+"'";
        try {
            cx = con.conectate();
            st = cx.createStatement();
            rs = st.executeQuery(sql);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return rs;
    }
    
    public void AgregarTalentoM(String a, int b){
        sql = "insert into miembro_talento values ('"+a+"','"+b+"')";
        try {
            cx = con.conectate();
            st = cx.createStatement();
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Miembro registrado con éxito");  
        } catch (SQLException ex) {
            System.out.println(ex);
            // JOptionPane.showMessageDialog(null, ex);                        
        }
    }
    
}
