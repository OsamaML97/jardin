/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jardin.test;

import jardin.Entite.enfant;
import jardin.Service.ServiceEnfant;
import jardin.Utils.DataBase;
import java.sql.*;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author House
 */
public class test {
    
    public static void main(String[] args) {
        ServiceEnfant ser = new ServiceEnfant();
        
        enfant e1 = new enfant(1,"yassin", "khalil",10,12.5f,12);
        enfant e2 = new enfant(2,"ahmed", "ali",10,5.7f,1);
        
        try {
//         
            ser.ajouter1(e2);
            ser.ajouter(e1);
            List<enfant> list = ser.readAll();
            System.out.println(list);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
    
}
