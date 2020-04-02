
package pi.dev.Service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import pi.dev.Entity.categorief;
import pi.dev.Utility.ConnectDB;

public class categorieservice {
    
    Connection cnx2;

    public categorieservice() {
        cnx2 = ConnectDB.getInstance().getConnection();
    }
        public void ajouter(categorief p) {
       

        try {
           

          String requete = "INSERT INTO categorief (idf,nomC) VALUES(?,?)";
            PreparedStatement pst = cnx2.prepareStatement(requete);
            pst.setInt(1, p.getIdf());
            pst.setString(2, p.getNomc());
            pst.executeUpdate();
          

        }  catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    

    }
    
}
