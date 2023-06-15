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
public class dataSekolah {
    
        private ArrayList<String> kodeSekolah;
        private ArrayList<String> nama;
        private ArrayList<String> alamat;
        private ArrayList<Integer> telepon;
        private ArrayList<Integer> fax;
        private ArrayList<String> email;
        private ArrayList<String> website;

        public dataSekolah(){

            kodeSekolah = new ArrayList<String>();
            nama = new ArrayList<String>();
            alamat = new ArrayList<String>();
            telepon = new ArrayList<Integer>();
            fax = new ArrayList<Integer>();
            email = new ArrayList<String>();
            website = new ArrayList<String>();

        }

        public void insertKodeSekolah(String isi){
            this.kodeSekolah.add(isi);
        }

        public ArrayList<String> getRecordKodeSekolah(){
            return this.kodeSekolah;
        }

        public void insertNama (String isi){
            this.nama.add(isi);
        }

        public ArrayList<String> getRecordNama(){
            return this.nama;
        }

        public void insertAlamat(String isi){
            this.alamat.add(isi);
        }

        public ArrayList<String> getRecordAlamat(){
            return this.alamat;
        }

        public void insertTelepon (Integer isi){
            this.telepon.add(isi);
        }

        public ArrayList<Integer> getRecordTelepon(){
            return this.telepon;
        }

        public void insertFax (Integer isi){
            this.fax.add(isi);
        }

        public ArrayList<Integer> getRecordFax(){
            return this.fax;
        }

        public void insertEmail (String isi){
            this.email.add(isi);
        }

        public ArrayList<String> getRecordEmail(){
            return this.email;
        }

        public void insertWebsite(String isi){
            this.website.add(isi);
        }

        public ArrayList<String> getRecordWebsite(){
            return this.website;
        }

}
