package Control;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RSemanaT {
    Conexion con = new Conexion();
    Connection cx = null;
    Statement st = null, st1 = null;
    ResultSet rs = null;
    String sql;
    
    public ResultSet ListarSemana1(){
        sql = "select id_semana_final, fecha_referencia, total_final from semana_final";
        try {            
            cx = con.conectate();
            st = cx.createStatement();
            rs = st.executeQuery(sql);
        } catch(SQLException ex){
            System.out.println(ex);
        }
        return rs;
    }
    
    public ResultSet ListarSabado1(String a){
        sql = "SELECT t.nombre, c.monto FROM tipo_ofrenda_sabado t JOIN detalle_sabado c ON (t.id_tipo_ofrenda_sabado = c.id_tipo_ofrenda_sabado) JOIN sabado d ON (d.id_sabado = c.id_sabado) JOIN semana_final f ON (f.id_semana_final = d.id_semana_final) WHERE f.id_semana_final = '"+a+"'";
        try {            
            cx = con.conectate();
            st = cx.createStatement();
            rs = st.executeQuery(sql);
        } catch(SQLException ex){
            System.out.println(ex);
        }
        return rs;
    }
    
    public ResultSet ListarSabado2(String a){
        sql = "SELECT c.total, c.fecha FROM sabado c JOIN semana_final d ON (d.id_semana_final = c.id_semana_final) WHERE d.id_semana_final = '"+a+"'";
        try {            
            cx = con.conectate();
            st = cx.createStatement();
            rs = st.executeQuery(sql);
        } catch(SQLException ex){
            System.out.println(ex);
        }
        return rs;
    }
    
    public ResultSet ListarSemanaMi(String a){
        sql = "SELECT c.fecha, c.monto FROM tipo_ofrenda_semana t  JOIN detalle_semana c ON (t.id_tipo_ofrenda_semana = c.id_tipo_ofrenda_semana) JOIN semana d ON (d.id_semana = c.id_semana) JOIN semana_final f ON (f.id_semana_final = d.id_semana_final) WHERE f.id_semana_final = '"+a+"' AND t.dia = 'Miercoles'";
        try {            
            cx = con.conectate();
            st = cx.createStatement();
            rs = st.executeQuery(sql);
        } catch(SQLException ex){
            System.out.println(ex);
        }
        return rs;
    }
    
    public ResultSet ListarSemanaVi(String a){
        sql = "SELECT c.fecha, c.monto FROM tipo_ofrenda_semana t  JOIN detalle_semana c ON (t.id_tipo_ofrenda_semana = c.id_tipo_ofrenda_semana) JOIN semana d ON (d.id_semana = c.id_semana) JOIN semana_final f ON (f.id_semana_final = d.id_semana_final) WHERE f.id_semana_final = '"+a+"' AND t.dia = 'Viernes'";
        try {            
            cx = con.conectate();
            st = cx.createStatement();
            rs = st.executeQuery(sql);
        } catch(SQLException ex){
            System.out.println(ex);
        }
        return rs;
    }
    
}
