/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AhmadMaulana;

/**
 *
 * @author ACER
 */
public class Absen {
    
    private String KodeAbsen;
    private String KodeGuru;
    private String KodePelajaran;
    private String TanggalJadwal;
    private String HariAbsen;
    private String RuangAbsen;
    private String KelasAbsen;
    private String JadwalMulai;
    private String JadwalSelesai;
    private String Masuk;
    private String CatatanMasuk;
    private String Keluar;
    private String CatatanKeluar;
    private String TanggalAbsen;
    
    public Absen() {} 
    
    public Absen(String a){
        setKodeAbsen(a);
    }
    
    public Absen(String a, String b){
        setKodeAbsen(a);
        setKodeGuru(b);
    }
    
    public Absen(String a, String b, String c){
        setKodeAbsen(a);
        setKodeGuru(b);
        setKodePelajaran(c);
    }

    public Absen(String a, String b, String c, String d){
        setKodeAbsen(a);
        setKodeGuru(b);
        setKodePelajaran(c);
        setTanggalJadwal(d);
    }

    public Absen(String a, String b, String c, String d, String e){
        setKodeAbsen(a);
        setKodeGuru(b);
        setKodePelajaran(c);
        setTanggalJadwal(d);
        setHariAbsen(e);
    }

    public Absen(String a, String b, String c, String d, String e, String f){
        setKodeAbsen(a);
        setKodeGuru(b);
        setKodePelajaran(c);
        setTanggalJadwal(d);
        setHariAbsen(e);
        setRuangAbsen(f);
    }

    public Absen(String a, String b, String c, String d, String e, String f, String g){
        setKodeAbsen(a);
        setKodeGuru(b);
        setKodePelajaran(c);
        setTanggalJadwal(d);
        setHariAbsen(e);
        setRuangAbsen(f);
        setKelasAbsen(g);
    }

    public Absen(String a, String b, String c, String d, String e, String f, String g, String h){
        setKodeAbsen(a);
        setKodeGuru(b);
        setKodePelajaran(c);
        setTanggalJadwal(d);
        setHariAbsen(e);
        setRuangAbsen(f);
        setKelasAbsen(g);
        setJadwalMulai(h);
    }

    public Absen(String a, String b, String c, String d, String e, String f, String g, String h, String i){
        setKodeAbsen(a);
        setKodeGuru(b);
        setKodePelajaran(c);
        setTanggalJadwal(d);
        setHariAbsen(e);
        setRuangAbsen(f);
        setKelasAbsen(g);
        setJadwalMulai(h);
        setJadwalSelesai(i);
    }

    public Absen(String a, String b, String c, String d, String e, String f, String g, String h, String i, String j){
        setKodeAbsen(a);
        setKodeGuru(b);
        setKodePelajaran(c);
        setTanggalJadwal(d);
        setHariAbsen(e);
        setRuangAbsen(f);
        setKelasAbsen(g);
        setJadwalMulai(h);
        setJadwalSelesai(i);
        setMasuk(j);
    }

    public Absen(String a, String b, String c, String d, String e, String f, String g, String h, String i, String j, String k){
        setKodeAbsen(a);
        setKodeGuru(b);
        setKodePelajaran(c);
        setTanggalJadwal(d);
        setHariAbsen(e);
        setRuangAbsen(f);
        setKelasAbsen(g);
        setJadwalMulai(h);
        setJadwalSelesai(i);
        setMasuk(j);
        setCatatanMasuk(k);
    }

    public Absen(String a, String b, String c, String d, String e, String f, String g, String h, String i, String j, String k, String l){
        setKodeAbsen(a);
        setKodeGuru(b);
        setKodePelajaran(c);
        setTanggalJadwal(d);
        setHariAbsen(e);
        setRuangAbsen(f);
        setKelasAbsen(g);
        setJadwalMulai(h);
        setJadwalSelesai(i);
        setMasuk(j);
        setCatatanMasuk(k);
        setKeluar(l);
    }

    public Absen(String a, String b, String c, String d, String e, String f, String g, String h, String i, String j, String k, String l, String m){
        setKodeAbsen(a);
        setKodeGuru(b);
        setKodePelajaran(c);
        setTanggalJadwal(d);
        setHariAbsen(e);
        setRuangAbsen(f);
        setKelasAbsen(g);
        setJadwalMulai(h);
        setJadwalSelesai(i);
        setMasuk(j);
        setCatatanMasuk(k);
        setKeluar(l);
        setCatatanKeluar(m);
    }

    public Absen(String a, String b, String c, String d, String e, String f, String g, String h, String i, String j, String k, String l, String m, String n){
        setKodeAbsen(a);
        setKodeGuru(b);
        setKodePelajaran(c);
        setTanggalJadwal(d);
        setHariAbsen(e);
        setRuangAbsen(f);
        setKelasAbsen(g);
        setJadwalMulai(h);
        setJadwalSelesai(i);
        setMasuk(j);
        setCatatanMasuk(k);
        setKeluar(l);
        setCatatanKeluar(m);
        setTanggalAbsen(n);
    }
        
    public void setKodeAbsen(String a){
        this.KodeAbsen=a;
    }
    
    public String getKodeAbsen(){
        return this.KodeGuru;
    }
    
    public void setKodeGuru(String b){
        this.KodeGuru=b;
    }
    
    public String getKodeGuru(){
        return this.KodePelajaran;
    }
    
    public void setKodePelajaran(String c){
        this.KodePelajaran=c;
    }
    
    public String getKodePelajaran(){
        return this.KodePelajaran;
    }

    public void setTanggalJadwal(String d){
        this.TanggalJadwal=d;
    }
    
    public String getTanggalJadwal(){
        return this.TanggalJadwal;
    }
    
    public void setHariAbsen(String e){
        this.HariAbsen=e;
    }
    
    public String getHariAbsen(){
        return this.HariAbsen;
    }

    public void setRuangAbsen(String f){
        this.RuangAbsen=f;
    }
    
    public String getRuangAbsen(){
        return this.RuangAbsen;
    }

    public void setKelasAbsen(String g){
        this.KelasAbsen=g;
    }
    
    public String getKelasAbsen(){
        return this.KelasAbsen;
    }

    public void setJadwalMulai(String h){
        this.JadwalMulai=h;
    }
    
    public String getJadwalMulai(){
        return this.JadwalMulai;
    }

    public void setJadwalSelesai(String i){
        this.JadwalSelesai=i;
    }
    
    public String getJadwalSelesai(){
        return this.JadwalSelesai;
    }

    public void setMasuk(String j){
        this.Masuk=j;
    }
    
    public String getMasuk(){
        return this.Masuk;
    }
    
    public void setCatatanMasuk(String k){
        this.CatatanMasuk=k;
    }
    
    public String getCatatanMasuk(){
        return this.CatatanMasuk;
    }

    public void setKeluar(String l){
        this.Keluar=l;
    }
    
    public String getKeluar(){
        return this.Keluar;
    }

    public void setCatatanKeluar(String m){
        this.CatatanKeluar=m;
    }
    
    public String getCatatanKeluar(){
        return this.CatatanKeluar;
    }

    public void setTanggalAbsen(String n){
        this.TanggalAbsen=n;
    }
    
    public String getTanggalAbsen(){
        return this.TanggalAbsen;
    }


    public String dataAbsen(){
        return getKodeAbsen()+getKodeGuru()+getKodePelajaran()+getTanggalJadwal()+getHariAbsen()+getRuangAbsen()+getKelasAbsen()+getJadwalMulai()+getJadwalSelesai()+getMasuk()+getCatatanMasuk()+getKeluar()+getCatatanKeluar()+getTanggalAbsen(); 
    }
    public String dataAbsen(String a,String b,String c,String d,String e,String f,String g,String h,String i,String j, String k, String l, String m, String n){
        setKodeAbsen(a);
        setKodeGuru(b);
        setKodePelajaran(c);
        setTanggalJadwal(d);
        setHariAbsen(e);
        setRuangAbsen(f);
        setKelasAbsen(g);
        setJadwalMulai(h);
        setJadwalSelesai(i);
        setMasuk(j);
        setCatatanMasuk(k);
        setKeluar(l);
        setCatatanKeluar(m);
        setTanggalAbsen(n);
        return getKodeAbsen()+getKodeGuru()+getKodePelajaran()+getTanggalJadwal()+getHariAbsen()+getRuangAbsen()+getKelasAbsen()+getJadwalMulai()+getJadwalSelesai()+getMasuk()+getCatatanMasuk()+getKeluar()+getCatatanKeluar()+getTanggalAbsen();
    }
}

