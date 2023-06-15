/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AhmadMaulana;

/**
 *
 * @author ACER
 */
public class User {
    
    private String KodeUser;
    private String NamaUser;
    private String PasswordUser;
    private String StatusUser;
    
    public User() {}
    
    public User(String a){
        setKodeUser(a);
    }
    
    public User(String a, String b){
        setKodeUser(a);
        setNamaUser(b);
    }
    
    public User(String a, String b, String c){
        setKodeUser(a);
        setNamaUser(b);
        setPasswordUser(c);
    }
    
    public User(String a, String b, String c, String d){
        setKodeUser(a);
        setNamaUser(b);
        setPasswordUser(c);
        setStatusUser(d);
    }
    
    public void setKodeUser(String a){
        this.KodeUser=a;
    }
    
    public String getKodeUser(){
        return this.KodeUser;
    }
    
    public void setNamaUser(String b){
        this.NamaUser=b;
    }
    
    public String getNamaUser(){
        return this.NamaUser;
    }
    
    public void setPasswordUser(String c){
        this.PasswordUser=c;
    }
    
    public String getPasswordUser(){
        return this.PasswordUser;
    }

    public void setStatusUser(String d){
        this.StatusUser=d;
    }
    
    public String getStatusUser(){
        return this.StatusUser;
    }
    
    public String dataUser(){
        return getKodeUser()+getNamaUser()+getPasswordUser()+getStatusUser(); 
    }
    public String dataUser(String a,String b,String c,String d){
        setKodeUser(a);
        setNamaUser(b);
        setPasswordUser(c);
        setStatusUser(d);
    return getKodeUser()+getNamaUser()+getPasswordUser()+getStatusUser();
    }
}
