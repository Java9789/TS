package Control;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
    
public class NSemanaT {
    Conexion con = new Conexion();
    Connection cx = null;
    Statement st = null, st1 = null;
    ResultSet rs = null;
    String sql;
    
    public void CrearSemanaFinal(String b){
        sql = "insert into semana_final (total_final, fecha_referencia) values ('0.00','"+b+"') ";
        try {
            cx = con.conectate();                    
            st = cx.createStatement();
            st.executeUpdate(sql);
        } catch(SQLException ex){
            // System.out.println("Error en semana final: " + ex);
        }
    }
    
    public ResultSet ListarTipoSabado(){
        sql = "select * from tipo_ofrenda_sabado";
        try {
            cx = con.conectate();
            st = cx.createStatement();
            rs = st.executeQuery(sql);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return rs;
    }
    
    public ResultSet ListarTipoSemana(){
        sql = "select * from tipo_ofrenda_semana";
        try {
            cx = con.conectate();
            st = cx.createStatement();
            rs = st.executeQuery(sql);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return rs;
    }
    
    public ResultSet UltimaSemana1(){
        sql = "SELECT id_semana_final FROM semana_final ORDER BY id_semana_final DESC LIMIT 1";
        try {
            cx = con.conectate();
            st = cx.createStatement();
            rs = st.executeQuery(sql);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return rs;
    }
    
    public void InsertarSabado(String a, double b, String c){
        sql = "insert into sabado (id_semana_final, total, fecha) values ('"+a+"','"+b+"','"+c+"')";
        try {
            cx = con.conectate();                    
            st = cx.createStatement();
            st.executeUpdate(sql);
        } catch(SQLException ex){
            // System.out.println("Error en insertar sabado: " + ex);
        }
    }
    
    public void InsertarSemana(String a, double b){
        sql = "insert into semana (id_semana_final, total) values ('"+a+"','"+b+"')";
        try {
            cx = con.conectate();                    
            st = cx.createStatement();
            st.executeUpdate(sql);
        } catch(SQLException ex){
            System.out.println("Error en insertar semana: " + ex);
        }
    }
    
    public void ActualizarSemanaFinal(double a, String b){
        sql = "update semana_final set total_final = "+a+" where id_semana_final = '"+b+"' ";
        try {
            cx = con.conectate();                    
            st = cx.createStatement();
            st.executeUpdate(sql);
        } catch(SQLException ex){
            // System.out.println("Error en actualizar semana final: " + ex);
        }
    }
    
    public ResultSet ListarIDSabado(){
        sql = "select id_sabado from sabado";
        try {            
            cx = con.conectate();
            st = cx.createStatement();
            rs = st.executeQuery(sql);            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return rs;
    }
    
    public void InsertarDetalleSabado(int a, String b, double c){
        sql = "insert into detalle_sabado values ("+a+",'"+b+"',"+c+")";
        try{
            cx = con.conectate();
            st = cx.createStatement();
            st.executeUpdate(sql);
        } catch(SQLException ex){
            // System.out.println("Error en insertar detalle_sabado: " + ex);
        }
    }
    
    public ResultSet ListarIDSemana(){
        sql = "select id_semana from semana";
        try {            
            cx = con.conectate();
            st = cx.createStatement();
            rs = st.executeQuery(sql);            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return rs;
    }
    
    public void InsertarDetalleSemana(String a, int b, double c, String d){
        sql = "insert into detalle_semana values ('"+a+"',"+b+","+c+",'"+d+"')";
        try{
            cx = con.conectate();
            st = cx.createStatement();
            st.executeUpdate(sql);
        } catch(SQLException ex){
            // System.out.println("Error en insertar detalle_semana: " + ex);
        }
    }
    
}
