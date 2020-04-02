/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pi.dev;

import java.net.URL;
import java.sql.Connection;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import pi.dev.Entity.categorief;
import pi.dev.Service.categorieservice;
import pi.dev.Utility.ConnectDB;

/**
 * FXML Controller class
 *
 * @author ASUS
 */
public class InsercatController implements Initializable {
        Connection cnx2;

    public InsercatController() {
        cnx2 = ConnectDB.getInstance().getConnection();
    }
    @FXML
    private TextField nom;
   

   
 
    @FXML
    private void a(ActionEvent event) {
         categorief c =new categorief();
         
        String nom1 =nom.getText();
        c.setNomc(nom1);
         categorieservice ser = new categorieservice();
        ser.ajouter(c);
        
        
          Alert alert;
                alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Ajout!");
                alert.setHeaderText("CAtegorie");
                alert.setContentText("ajoute avec succee");
                alert.showAndWait();
        
        
    }
       @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    
}
