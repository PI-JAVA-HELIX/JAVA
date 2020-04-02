/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pi.dev.Service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import pi.dev.Entity.societe1;
import pi.dev.Utility.ConnectDB;

/**
 *
 * @author ASUS
 */
public class societe1service {

    Connection cnx2;

    public societe1service() {
        cnx2 = ConnectDB.getInstance().getConnection();
    }

    public void ajouter(societe1 p) {

        try {

            String requete2 = "INSERT INTO categorie (ids,names,address,email,tel,logo) VALUES(?,?,?,?,?,?)";
            PreparedStatement pst = cnx2.prepareStatement(requete2);
            pst.setInt(1, p.getIds());
            pst.setString(2, p.getNames());

            pst.setString(3, p.getAddress());
            pst.setString(4, p.getEmail());
            pst.setString(5, p.getTel());

            pst.setString(6, p.getLogo());

            pst.executeUpdate();
            System.out.println("C BN");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
