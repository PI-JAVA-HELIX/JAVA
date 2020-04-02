/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pi.dev.Test;

import pi.dev.Entity.categorief;
import pi.dev.Service.categorieservice;

/**
 *
 * @author Ach
 */
public class Test {
    public static void main(String[] args) {
      categorieservice ss=new categorieservice();
      categorief c = new categorief(3,"ri");
      ss.ajouter(c);
    }
}