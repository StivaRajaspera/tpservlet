/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rajaspera
 */
public class Personne {
    
    private static int id;
    private String name;
    private String middlename;
    private String lastname;
    private String sexe;
    private String phone;
    private String mail;
    
    
    public Personne(){
        this.id++;
    }
    
    public Personne(String name, String middlename, String lastname, String sexe, String phone, String mail){
        this.name = name;
        this.middlename = middlename;
        this.lastname = lastname;
        this.sexe = sexe;
        this.phone = phone;
        this.mail = mail;
        this.id++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddlename() {
        return middlename;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }


    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
