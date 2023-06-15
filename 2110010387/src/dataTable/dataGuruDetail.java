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
public class dataGuruDetail {
    
        private ArrayList<String> KodeGuru;
        private ArrayList<Integer> KodePelajaran;
        private ArrayList<String> Hari;
        private ArrayList<String> Ruang;
        private ArrayList<String> Kelas;
        private ArrayList<String> JamMulai;
        private ArrayList<String> JamSelesai;
        private ArrayList<String> TanggalMulai;
        private ArrayList<String> JumlahPertemuan;
        

        public dataGuruDetail(){

            KodeGuru = new ArrayList<String>();
            KodePelajaran = new ArrayList<Integer>();
            Hari = new ArrayList<String>();
            Ruang = new ArrayList<String>();
            Kelas = new ArrayList<String>();
            JamMulai = new ArrayList<String>();
            JamSelesai = new ArrayList<String>();
            TanggalMulai = new ArrayList<String>();
            JumlahPertemuan = new ArrayList<String>();

        }

        public void insertKodeGuru(String isi){
            this.KodeGuru.add(isi);
        }

        public ArrayList<String> getRecordKodeGuru(){
            return this.KodeGuru;
        }

        public void insertKodePelajaran (Integer isi){
            this.KodePelajaran.add(isi);
        }

        public ArrayList<Integer> getRecordKodePelajaran(){
            return this.KodePelajaran;
        }

        public void insertHari(String isi){
            this.Hari.add(isi);
        }

        public ArrayList<String> getRecordHari(){
            return this.Hari;
        }

        public void insertRuang (String isi){
            this.Ruang.add(isi);
        }

        public ArrayList<String> getRecordRuang(){
            return this.Ruang;
        }
        
        public void insertKelas (String isi){
            this.Kelas.add(isi);
        }

        public ArrayList<String> getRecordKelas(){
            return this.Kelas;
        }

        public void insertJamMulai (String isi){
            this.JamMulai.add(isi);
        }

        public ArrayList<String> getRecordJamMulai(){
            return this.JamMulai;
        }

        public void insertJamSelesai (String isi){
            this.JamSelesai.add(isi);
        }

        public ArrayList<String> getRecordJamSelesai(){
            return this.JamSelesai;
        }

        public void insertTanggalMulai(String isi){
            this.TanggalMulai.add(isi);
        }

        public ArrayList<String> getRecordTanggalMulai(){
            return this.TanggalMulai;
        }
        
        public void insertJumlahPertemuan(String isi){
            this.JumlahPertemuan.add(isi);
        }

        public ArrayList<String> getRecordJumlahPertemuan(){
            return this.JumlahPertemuan;
        }

}

    

