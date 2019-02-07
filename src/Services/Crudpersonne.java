/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;
import java.sql.*;
import Entities.Personne;
import Utils.MyConnection;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Raid
 */
public class Crudpersonne {
    
    Connection C = MyConnection.getInstance().getConn();
    //Connection C = MyConnection.getConn();
    
    public void ajouterpersonne(Personne p)
    {
        try {
            Statement st = C.createStatement();
            String req="insert into personne values ("+p.getId()+",'"+p.getNom()+"','"+p.getPrenom()+"')";
            st.executeUpdate(req);
        } catch (SQLException ex) {
            Logger.getLogger(Crudpersonne.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void afficherpersonne()
    {
        try {
            Statement st = C.createStatement();
            String req="select * from personne";
            ResultSet rs = st.executeQuery(req);
            while(rs.next())
            {
                System.out.println("personne"+rs.getInt(1)+"nom"+rs.getString(2)+rs.getString(3));
                
            }   } catch (SQLException ex) {
            Logger.getLogger(Crudpersonne.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void modiferpersonne(int id,String nom)
    {
        try {
            PreparedStatement pt = C.prepareStatement("update personne set nom = ? where id =?");
            pt.setString(1,nom);
            pt.setInt(2,id);
            
            pt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Crudpersonne.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public  void Supprimerpersonne(int id)
    {
        try {
            PreparedStatement pt = C.prepareStatement("delete  from personne  where id =?");
            pt.setInt(1,id);
            pt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Crudpersonne.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
            
    
    
}
