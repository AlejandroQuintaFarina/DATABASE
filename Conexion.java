/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author alex0
 */
public class Conexion {
    
    Connection con; 
    
    public Connection conectar(){//método para crear la conexión con la base de datos
    
        
        try { 
            Class.forName("com.mysql.cj.jdbc.Driver");
            //La url, el nombre del perfil, y la contraseña, para conectarse ( toda esta informacion sale en XAMPP)
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tienda", "root", "");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a la base de datos");//mensaje en el caso que no se pueda conectar
        }
        return con;
    }
}
