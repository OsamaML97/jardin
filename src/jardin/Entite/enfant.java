/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jardin.Entite;

/**
 *
 * @author OsamaML97
 */
public class enfant {
    private int id;
    private String nom;
    private String prenom;
    private int age;
    private float note;
    private int absence;

    public enfant(int id, String nom, String prenom, int age , float note , int absence) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.note=note;
        this.absence=absence;
    }

    public enfant(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }

   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public float getNote() {
        return note;
    }

    public void setNote(float note) {
        this.note = note;
    }

    public int getAbsence() {
        return absence;
    }

    public void setAbsence(int absence) {
        this.absence = absence;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "enfant{" + "id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", age=" + age + ", note=" + note + ", absence=" + absence + '}';
    }


}

