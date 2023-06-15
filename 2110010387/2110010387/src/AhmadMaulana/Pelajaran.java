/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AhmadMaulana;

/**
 *
 * @author ACER
 */
public class Pelajaran {
    
    private String KodePelajaran;
    private String NamaPelajaran;
    
    public Pelajaran() {}
    
    public Pelajaran(String a){
        setKodePelajaran(a);
    }
    
    public Pelajaran(String a, String b){
        setKodePelajaran(a);
        setNamaPelajaran(b);
    }
    
        public void setKodePelajaran(String a){
        this.KodePelajaran=a;
    }
    
    public String getKodePelajaran(){
        return this.KodePelajaran;
    }
    
    public void setNamaPelajaran(String b){
        this.NamaPelajaran=b;
    }
    
    public String getNamaPelajaran(){
        return this.NamaPelajaran;
    }
    
    public String dataPelajaran(){
        return getKodePelajaran()+getNamaPelajaran(); 
    }
    public String dataPelajaran(String a,String b){
        setKodePelajaran(a);
        setNamaPelajaran(b);
    return getKodePelajaran()+getNamaPelajaran();
    }
    
}
