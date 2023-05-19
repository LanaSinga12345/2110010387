/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AhmadMaulana;

/**
 *
 * @author ACER
 */
public class Sekolah {
    
    private String KodeSekolah;
    private String Nama;
    private String Alamat;
    private String Telepon;
    private String Fax;
    private String Email;
    private String Website;
    
    public Sekolah() {}
    
    public Sekolah(String a){
        setKodeSekolah(a);
    }
    
    public Sekolah(String a, String b){
        setKodeSekolah(a);
        setNama(b);
    }
    
    public Sekolah(String a, String b, String c){
        setKodeSekolah(a);
        setNama(b);
        setAlamat(c);
    }
    
    public Sekolah(String a, String b, String c, String d){
        setKodeSekolah(a);
        setNama(b);
        setAlamat(c);
        setTelepon(d);
    }
    
    public Sekolah(String a, String b, String c, String d, String e){
        setKodeSekolah(a);
        setNama(b);
        setAlamat(c);
        setTelepon(d);
        setFax(e);
    }
    
    public Sekolah(String a, String b, String c, String d, String e, String f){
        setKodeSekolah(a);
        setNama(b);
        setAlamat(c);
        setTelepon(d);
        setFax(e);
        setEmail(f);
    }
    
    public Sekolah(String a, String b, String c, String d, String e, String f, String g){
        setKodeSekolah(a);
        setNama(b);
        setAlamat(c);
        setTelepon(d);
        setFax(e);
        setEmail(f);
        setWebsite(g);
    }
        
    public void setKodeSekolah(String a){
        this.KodeSekolah=a;
    }
    
    public String getKodeSekolah(){
        return this.KodeSekolah;
    }
    
    public void setNama(String b){
        this.Nama=b;
    }
    
    public String getNama(){
        return this.Nama;
    }
    
    public void setAlamat(String c){
        this.Alamat=c;
    }
    
    public String getAlamat(){
        return this.Alamat;
    }

    public void setTelepon(String d){
        this.Telepon=d;
    }
    
    public String getTelepon(){
        return this.Telepon;
    }
    
    public void setFax(String e){
        this.Fax=e;
    }
    
    public String getFax(){
        return this.Fax;
    }

    public void setEmail(String f){
        this.Email=f;
    }
    
    public String getEmail(){
        return this.Email;
    }

    public void setWebsite(String g){
        this.Website=g;
    }
    
    public String getWebsite(){
        return this.Website;
    }

    public String dataSekolah(){
        return getKodeSekolah()+getNama()+getAlamat()+getTelepon()+getFax()+getEmail()+getWebsite(); 
    }
    public String dataSekolah(String a,String b,String c,String d,String e,String f,String g){
        setKodeSekolah(a);
        setNama(b);
        setAlamat(c);
        setTelepon(d);
        setFax(e);
        setEmail(f);
        setWebsite(g);
    return getKodeSekolah()+getNama()+getAlamat()+getTelepon()+getFax()+getEmail()+getWebsite();
    }
    
}
