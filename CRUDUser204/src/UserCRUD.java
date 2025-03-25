/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mclov
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
        
public class UserCRUD {
    
    private Connection conexion;
    
    //constructor denla clase aranca la conexion con base de datos
    public UserCRUD(){
    conexion = ConexionMySQL.conectar();
    
    }
    public boolean InsertUsuario(String nombre,String correo,String contra){
    
        String insertSQL = "INSERT INTO Usuarios(Nombre, Correo, Contrasena)VALUES (?,?,?)";
        try{
           PreparedStatement ps =  conexion.prepareStatement(insertSQL);
           ps.setString(1, nombre);
           ps.setString(2, correo);
           ps.setString(3, contra);
           return ps.executeUpdate()>0;
        
        }
    catch(SQLException e){
        //se imprime solo si no se ejecuto el insert into
        System.out.println("Error al crear el Usuario"+e.getMessage());
        return false;
    }
    } 
   public ResultSet buscarPorID(int id){
   String sqlBuscar = "SELECT * fROM usuarios WHERE id = ?";
   try{
       PreparedStatement ps =  conexion.prepareStatement(sqlBuscar);
       ps.setInt(1, id);
       return ps.executeQuery();  
   }
   catch(SQLException e){
       
       System.out.println("Error al buscar por ID"+ e.getMessage());
       return null;
   }
   }
   public ResultSet obteneTodos(){
   
       String sqlTodos = "SELECT* FROM usuarios";
       
       try{
          PreparedStatement ps =  conexion.prepareStatement(sqlTodos);
          return ps.executeQuery();
       
       }
       catch(SQLException s){
           System.out.println("Error al consultar todos"+s.getMessage());
           return null;
       }
   
   }
   
}
