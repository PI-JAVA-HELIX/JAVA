package pi.dev.Service;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import pi.dev.Entity.Produit;
import pi.dev.Utility.ConnectDB;




public class produitSevice {
    
    
    
    public void insererProduit(Produit p ){
        
        Connection conn = ConnectDB.getInstance().getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement("insert into produit (nom,description,prix,quantite) values (?,?,?,?)");
            ps.setString(1, p.getNom());
            ps.setString(2, p.getDescription());
            ps.setFloat(3, p.getPrix());
            ps.setInt(4, p.getQuantite());
            
            ps.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        System.out.println("done");
    }
    
    public Produit getProduit(int id){
        
        Produit p = new Produit();
        Connection conn = ConnectDB.getInstance().getConnection();
        try {
            //*********
            PreparedStatement ps = conn.prepareStatement("select ...... where id ="+id);
            ResultSet rs  = ps.executeQuery();
            p.setId(rs.getInt("id"));
            //*******
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return p;
    }
}
