/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pi.dev.Test;

import java.sql.Date;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.List;
import pi.dev.Entity.Livraison;
import pi.dev.Entity.Produit;
import pi.dev.Entity.Reclamation;
import pi.dev.Service.ReclamationServices;
import pi.dev.Service.ServiceLivraison;
import pi.dev.Service.produitSevice;

/**
 *
 * @author Ach
 */
public class Test {
 public static void main(String[] args) {
   
     
        Produit p1 = new Produit("sofsos", 14, "er5isa insaf", 10000);
        
        produitSevice ps = new produitSevice();
        
     ReclamationServices pss= new  ReclamationServices();
     Calendar calendar = Calendar.getInstance();
     Date startDate = new Date(calendar.getTime().getTime());
     
       Reclamation r = new Reclamation(25, "ben khedhe", "Hamza",false,startDate);
       Reclamation r1 = new Reclamation(25, "ben khedhe", "Hamzaa",false,startDate);


        
        ServiceLivraison ser = new ServiceLivraison();
        
        Livraison l1 = new Livraison("Achraf", "A", "B", 2000, 28546619, "Ach.Thamri@gmail.com");
        Livraison l2 = new Livraison("Achraff", "Aa", "Bb", 2001, 28546619, "Ach.Thamri@gmail.com");
        
        try {
                   pss.ajouterReclamation2(r);
                   pss.ajouterReclamation2(r1);
       pss.SupprimerReclamation();
       pss.ModificationReclamation(r);
//         
ps.insererProduit(p1);
            ser.ajouter1(l2);
            ser.ajouter(l1);
            
            
            List<Livraison> list = ser.readAll();
            
            System.out.println(list);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }      
}
