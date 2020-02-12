/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jardin.Service;

import jardin.Entite.enfant;
import jardin.IService.IService;
import java.sql.SQLException;
import java.util.List;
import java.sql.*;
import jardin.Utils.DataBase;
import jardin.Entite.enfant;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author House
 */
public class ServiceEnfant implements IService<enfant> {

    private Connection con;
    private Statement ste;

    public ServiceEnfant() {
        con = DataBase.getInstance().getConnection();

    }

    @Override
    public void ajouter(enfant t) throws SQLException {
        ste = con.createStatement();
        String requeteInsert = "INSERT INTO `jardin`.`enfant` (`id`, `nom`, `prenom`, `age`,'note','absence') VALUES (NULL, '" + t.getNom() + "', '" + t.getPrenom() + "', '" + t.getAge() +"', '"+t.getNote()+"', '"+t.getAbsence()+ "');";
        ste.executeUpdate(requeteInsert);
    }
    public void ajouter1(enfant e) throws SQLException
    {
    PreparedStatement pre=con.prepareStatement("INSERT INTO `esprit1`.`personne` ( `nom`, `prenom`, `age`,'note','absence') VALUES ( ?, ?, ?,?,?);");
    pre.setString(1, e.getNom());
    pre.setString(2, e.getPrenom());
    pre.setInt(3, e.getAge());
    pre.setFloat(4, e.getNote());
    pre.setInt(5, e.getAbsence());
    pre.executeUpdate();
    }
            

    public boolean delete(enfant e) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean update(enfant e) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<enfant> readAll() throws SQLException {
    List<enfant> arr=new ArrayList<>();
    ste=con.createStatement();
    ResultSet rs=ste.executeQuery("select * from enfant");
     while (rs.next()) {                
               int id=rs.getInt(1);
               String nom=rs.getString("nom");
               String prenom=rs.getString(3);
               int age=rs.getInt("age");
               float note=rs.getFloat("note");
               int absence=rs.getInt("absence");
               enfant p=new enfant(id, nom, prenom, age,note ,absence);
     arr.add(p);
     }
    return arr;
    }

    
}
