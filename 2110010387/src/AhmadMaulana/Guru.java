/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AhmadMaulana;
import java.util.Scanner;
/**
 *
 * @author ACER
 */
public class Guru {
    private String KodeGuru;
    private String NamaGuru;
    private String AlamatGuru;
    private String TeleponGuru;
    private String EmailGuru;
    private String StatusGuru;
    private String UserName;
    private String Password;
    private String KodeSekolah;
    private String KodeUser;
    
    public Guru() {}
    
    public Guru(String a){
        setKodeGuru(a);
    }
    
    public Guru(String a, String b){
        setKodeGuru(a);
        setNamaGuru(b);
    }
    
    public Guru(String a, String b, String c){
        setKodeGuru(a);
        setNamaGuru(b);
        setAlamatGuru(c);
    }
    
    public Guru(String a, String b, String c, String d){
        setKodeGuru(a);
        setNamaGuru(b);
        setAlamatGuru(c);
        setTeleponGuru(d);
    }
    
    public Guru(String a, String b, String c, String d, String e){
        setKodeGuru(a);
        setNamaGuru(b);
        setAlamatGuru(c);
        setTeleponGuru(d);
        setEmailGuru(e);
    }
    
    public Guru(String a, String b, String c, String d, String e, String f){
        setKodeGuru(a);
        setNamaGuru(b);
        setAlamatGuru(c);
        setTeleponGuru(d);
        setEmailGuru(e);
        setStatusGuru(f);
    }
    
    public Guru(String a, String b, String c, String d, String e, String f, String g){
        setKodeGuru(a);
        setNamaGuru(b);
        setAlamatGuru(c);
        setTeleponGuru(d);
        setEmailGuru(e);
        setStatusGuru(f);
        setUserName(g);
    }
    
    public Guru(String a, String b, String c, String d, String e, String f, String g, String h){
        setKodeGuru(a);
        setNamaGuru(b);
        setAlamatGuru(c);
        setTeleponGuru(d);
        setEmailGuru(e);
        setStatusGuru(f);
        setUserName(g);
        setPassword(h);
    }
    
    public Guru(String a, String b, String c, String d, String e, String f, String g, String h, String i){
        setKodeGuru(a);
        setNamaGuru(b);
        setAlamatGuru(c);
        setTeleponGuru(d);
        setEmailGuru(e);
        setStatusGuru(f);
        setUserName(g);
        setPassword(h);
        setKodeSekolah(i);
    }
    
    public Guru(String a, String b, String c, String d, String e, String f, String g, String h, String i, String j){
        setKodeGuru(a);
        setNamaGuru(b);
        setAlamatGuru(c);
        setTeleponGuru(d);
        setEmailGuru(e);
        setStatusGuru(f);
        setUserName(g);
        setPassword(h);
        setKodeSekolah(i);
        setKodeUser(j);
    }
        
    public void setKodeGuru(String a){
        this.KodeGuru=a;
    }
    
    public String getKodeGuru(){
        return this.KodeGuru;
    }
    
    public void setNamaGuru(String b){
        this.NamaGuru=b;
    }
    
    public String getNamaGuru(){
        return this.NamaGuru;
    }
    
    public void setAlamatGuru(String c){
        this.AlamatGuru=c;
    }
    
    public String getAlamatGuru(){
        return this.AlamatGuru;
    }

    public void setTeleponGuru(String d){
        this.TeleponGuru=d;
    }
    
    public String getTeleponGuru(){
        return this.TeleponGuru;
    }
    
    public void setEmailGuru(String e){
        this.EmailGuru=e;
    }
    
    public String getEmailGuru(){
        return this.EmailGuru;
    }

    public void setStatusGuru(String f){
        this.StatusGuru=f;
    }
    
    public String getStatusGuru(){
        return this.StatusGuru;
    }

    public void setUserName(String g){
        this.UserName=g;
    }
    
    public String getUserName(){
        return this.UserName;
    }

    public void setPassword(String h){
        this.Password=h;
    }
    
    public String getPassword(){
        return this.Password;
    }

    public void setKodeSekolah(String i){
        this.KodeSekolah=i;
    }
    
    public String getKodeSekolah(){
        return this.KodeSekolah;
    }

    public void setKodeUser(String j){
        this.KodeUser=j;
    }
    
    public String getKodeUser(){
        return this.KodeUser;
    }
    
    public String dataGuru(){
        return getKodeGuru()+getNamaGuru()+getAlamatGuru()+getTeleponGuru()+getEmailGuru()+getStatusGuru()+getUserName()+getPassword()+getKodeSekolah()+getKodeUser(); 
    }
    public String dataGuru(String a,String b,String c,String d,String e,String f,String g,String h,String i,String j){
        setKodeGuru(a);
        setNamaGuru(b);
        setAlamatGuru(c);
        setTeleponGuru(d);
        setEmailGuru(e);
        setStatusGuru(f);
        setUserName(g);
        setPassword(h);
        setKodeSekolah(i);
        setKodeUser(j);
        return getKodeGuru()+getNamaGuru()+getAlamatGuru()+getTeleponGuru()+getEmailGuru()+getStatusGuru()+getUserName()+getPassword()+getKodeSekolah()+getKodeUser();
    }
}
