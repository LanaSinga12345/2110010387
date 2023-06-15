/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataTable;

import java.util.ArrayList;

/**
 *
 * @author ACER
 */
public class dataAbsen {
    private ArrayList<String> KodeAbsen;
    private ArrayList<String> KodeGuru;
    private ArrayList<Integer> KodePelajaran;
    private ArrayList<String> TanggalJadwal;
    private ArrayList<String> HariAbsen;
    private ArrayList<String> RuangAbsen;
    private ArrayList<String> KelasAbsen;
    private ArrayList<String> JadwalMulai;
    private ArrayList<String> JadwalSelesai;
    private ArrayList<String> Masuk;
    private ArrayList<String> CatatanMasuk;
    private ArrayList<String> Keluar;
    private ArrayList<String> CatatanKeluar;
    private ArrayList<String> TanggalAbsen;

        public dataAbsen(){

            KodeAbsen = new ArrayList<String>();
            KodeGuru = new ArrayList<String>();
            KodePelajaran = new ArrayList<Integer>();
            TanggalJadwal = new ArrayList<String>();
            HariAbsen = new ArrayList<String>();
            RuangAbsen = new ArrayList<String>();
            KelasAbsen = new ArrayList<String>();
            JadwalMulai = new ArrayList<String>();
            JadwalSelesai = new ArrayList<String>();
            Masuk = new ArrayList<String>();
            CatatanMasuk = new ArrayList<String>();
            Keluar = new ArrayList<String>();
            CatatanKeluar = new ArrayList<String>();
            TanggalAbsen = new ArrayList<String>();

        }

        public void insertKodeAbsen(String isi){
            this.KodeAbsen.add(isi);
        }

        public ArrayList<String> getRecordKodeAbsen(){
            return this.KodeAbsen;
        }

        public void insertKodeGuru (String isi){
            this.KodeGuru.add(isi);
        }

        public ArrayList<String> getRecordKodeGuru(){
            return this.KodeGuru;
        }

        public void insertKodePelajaran(Integer isi){
            this.KodePelajaran.add(isi);
        }

        public ArrayList<Integer> getRecordKodePelajaran(){
            return this.KodePelajaran;
        }

        public void insertTanggalJadwal (String isi){
            this.TanggalJadwal.add(isi);
        }

        public ArrayList<String> getRecordTanggalJadwal(){
            return this.TanggalJadwal;
        }

        public void insertHariAbsen (String isi){
            this.HariAbsen.add(isi);
        }

        public ArrayList<String> getRecordHariAbsen(){
            return this.HariAbsen;
        }

        public void insertRuangAbsen (String isi){
            this.RuangAbsen.add(isi);
        }

        public ArrayList<String> getRecordRuangAbsen(){
            return this.RuangAbsen;
        }

        public void insertKelasAbsen(String isi){
            this.KelasAbsen.add(isi);
        }

        public ArrayList<String> getRecordKelasAbsen(){
            return this.KelasAbsen;
        }
        
        public void insertJadwalMulai(String isi){
            this.JadwalMulai.add(isi);
        }

        public ArrayList<String> getRecordJadwalMulai(){
            return this.JadwalMulai;
        }
        
        public void insertJadwalSelesai(String isi){
            this.JadwalSelesai.add(isi);
        }

        public ArrayList<String> getRecordJadwalSelesai(){
            return this.JadwalSelesai;
        }
        
        public void insertMasuk(String isi){
            this.Masuk.add(isi);
        }

        public ArrayList<String> getRecordMasuk(){
            return this.Masuk;
        }
        
        public void insertCatatanMasuk(String isi){
            this.CatatanMasuk.add(isi);
        }

        public ArrayList<String> getRecordCatatanMasuk(){
            return this.CatatanMasuk;
        }
        
        public void insertKeluar(String isi){
            this.Keluar.add(isi);
        }

        public ArrayList<String> getRecordKeluar(){
            return this.Keluar;
        }
        
        public void insertCatatanKeluar(String isi){
            this.CatatanKeluar.add(isi);
        }

        public ArrayList<String> getRecordCatatanKeluar(){
            return this.CatatanKeluar;
        }
        
        public void insertTanggalAbsen(String isi){
            this.TanggalAbsen.add(isi);
        }

        public ArrayList<String> getRecordTanggalAbsen(){
            return this.TanggalAbsen;
        }
    
}
