package Sql;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Consultas extends Conexion{
    
    public boolean autenticacionPRO(String dni){
        PreparedStatement pst = null;
        ResultSet rs = null;
        
        try {
            String consulta = "select * from profesores where dni_pro = ? ";
            pst = getConexion().prepareStatement(consulta);
            pst.setString(1, dni);
            rs = pst.executeQuery();
            if(rs.absolute(1)){
                return true;
            }      
        } catch (Exception e) {
            System.err.println("ERROR"+ e);
        }finally{
            try {
                 if (getConexion() != null) getConexion().close();
                 if (pst != null) pst.close();
                 if (rs != null) rs.close();
            } catch (Exception e) {
            }
        }
        return false;
    }
 
    public boolean ingreso(int idsesion,String hora){ 
        
        PreparedStatement pst = null;
        
        try {
            String consulta="insert into ingreso(id_sesion,horaingreso) values(?,?)";
            pst = getConexion().prepareStatement(consulta);
            pst.setInt(1, idsesion);
            pst.setString(2, hora);
            if(pst.executeUpdate() == 1){
            return true;
            }
        } catch (Exception ex) {
            System.err.println("ERROR"+ ex);
        }finally{
            try {
                 if (getConexion() != null) getConexion().close();
                 if (pst != null) pst.close();
                } catch (Exception e) {
            System.err.println("ERROR"+ e);
        }
      }
        return false;
    }
    
    public boolean salida(int idingreso,String hora){ 
        
        PreparedStatement pst = null;
        
        try {
            String consulta="insert into salida(id_ingreso,horasalida) values(?,?)";
            pst = getConexion().prepareStatement(consulta);
            pst.setInt(1, idingreso);
            pst.setString(2, hora);

            if(pst.executeUpdate() == 1){
            return true;
            }
        } catch (Exception ex) {
            System.err.println("ERROR"+ ex);
        }finally{
            try {
                 if (getConexion() != null) getConexion().close();
                 if (pst != null) pst.close();
                } catch (Exception e) {
            System.err.println("ERROR"+ e);
        }
      }
        return false;
    }
          
} 
    
    
    
    
    
   
