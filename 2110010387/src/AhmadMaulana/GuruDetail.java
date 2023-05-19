/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AhmadMaulana;

/**
 *
 * @author ACER
 */
public class GuruDetail {
    
    private String KodeGuru;
    private String KodePelajaran;
    private String Hari;
    private String Ruang;
    private String Kelas;
    private String JamMulai;
    private String JamSelesai;
    private String TanggalMulai;
    private String JumlahPertemuan;
    
    public GuruDetail() {}
    
    public GuruDetail(String a){
        setKodeGuru(a);
    }
    
    public GuruDetail(String a, String b){
        setKodeGuru(a);
        setKodePelajaran(b);
    }
    
    public GuruDetail(String a, String b, String c){
        setKodeGuru(a);
        setKodePelajaran(b);
        setHari(c);
    }
    
    public GuruDetail(String a, String b, String c, String d){
        setKodeGuru(a);
        setKodePelajaran(b);
        setHari(c);
        setRuang(d);
    }
    
    public GuruDetail(String a, String b, String c, String d, String e){
        setKodeGuru(a);
        setKodePelajaran(b);
        setHari(c);
        setRuang(d);
        setKelas(e);
    }
    
    public GuruDetail(String a, String b, String c, String d, String e, String f){
        setKodeGuru(a);
        setKodePelajaran(b);
        setHari(c);
        setRuang(d);
        setKelas(e);
        setJamMulai(f);
    }
    
    public GuruDetail(String a, String b, String c, String d, String e, String f, String g){
        setKodeGuru(a);
        setKodePelajaran(b);
        setHari(c);
        setRuang(d);
        setKelas(e);
        setJamMulai(f);
        setJamSelesai(g);
    }
    
    public GuruDetail(String a, String b, String c, String d, String e, String f, String g, String h){
        setKodeGuru(a);
        setKodePelajaran(b);
        setHari(c);
        setRuang(d);
        setKelas(e);
        setJamMulai(f);
        setJamSelesai(g);
        setTanggalMulai(h);
    }
    
    public GuruDetail(String a, String b, String c, String d, String e, String f, String g, String h, String i){
        setKodeGuru(a);
        setKodePelajaran(b);
        setHari(c);
        setRuang(d);
        setKelas(e);
        setJamMulai(f);
        setJamSelesai(g);
        setTanggalMulai(h);
        setJumlahPertemuan(i);
    }
        
    public void setKodeGuru(String a){
        this.KodeGuru=a;
    }
    
    public String getKodeGuru(){
        return this.KodeGuru;
    }
    
    public void setKodePelajaran(String b){
        this.KodePelajaran=b;
    }
    
    public String getKodePelajaran(){
        return this.KodePelajaran;
    }
    
    public void setHari(String c){
        this.Hari=c;
    }
    
    public String getHari(){
        return this.Hari;
    }

    public void setRuang(String d){
        this.Ruang=d;
    }
    
    public String getRuang(){
        return this.Ruang;
    }
    
    public void setKelas(String e){
        this.Kelas=e;
    }
    
    public String getKelas(){
        return this.Kelas;
    }

    public void setJamMulai(String f){
        this.JamMulai=f;
    }
    
    public String getJamMulai(){
        return this.JamMulai;
    }

    public void setJamSelesai(String g){
        this.JamSelesai=g;
    }
    
    public String getJamSelesai(){
        return this.JamSelesai;
    }

    public void setTanggalMulai(String h){
        this.TanggalMulai=h;
    }
    
    public String getTanggalMulai(){
        return this.TanggalMulai;
    }

    public void setJumlahPertemuan(String i){
        this.JumlahPertemuan=i;
    }
    
    public String getJumlahPertemuan(){
        return this.JumlahPertemuan;
    }
    
    public String dataDetailGuru(){
        return getKodeGuru()+getKodePelajaran()+getHari()+getRuang()+getKelas()+getJamMulai()+getJamSelesai()+getTanggalMulai()+getJumlahPertemuan(); 
    }
    public String dataDetailGuru(String a,String b,String c,String d,String e,String f,String g,String h,String i){
        setKodeGuru(a);
        setKodePelajaran(b);
        setHari(c);
        setRuang(d);
        setKelas(e);
        setJamMulai(f);
        setJamSelesai(g);
        setTanggalMulai(h);
        setJumlahPertemuan(i);
        return getKodeGuru()+getKodePelajaran()+getHari()+getRuang()+getKelas()+getJamMulai()+getJamSelesai()+getTanggalMulai()+getJumlahPertemuan();
    }
    
}
