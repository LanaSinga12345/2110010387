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
public class dataGuru {
        private ArrayList<String> KodeGuru;
        private ArrayList<String> NamaGuru;
        private ArrayList<String> AlamatGuru;
        private ArrayList<Integer> TeleponGuru;
        private ArrayList<String> EmailGuru;
        private ArrayList<String> StatusGuru;
        private ArrayList<String> UserName;
        private ArrayList<String> Password;
        private ArrayList<String> KodeSekolah;
        private ArrayList<String> KodeUser;

        public dataGuru(){

            KodeGuru = new ArrayList<String>();
            NamaGuru = new ArrayList<String>();
            AlamatGuru = new ArrayList<String>();
            TeleponGuru = new ArrayList<Integer>();
            EmailGuru = new ArrayList<String>();
            StatusGuru = new ArrayList<String>();
            UserName = new ArrayList<String>();
            Password = new ArrayList<String>();
            KodeSekolah = new ArrayList<String>();
            KodeUser = new ArrayList<String>();

        }

        public void insertKodeGuru(String isi){
            this.KodeGuru.add(isi);
        }

        public ArrayList<String> getRecordKodeGuru(){
            return this.KodeGuru;
        }

        public void insertNamaGuru (String isi){
            this.NamaGuru.add(isi);
        }

        public ArrayList<String> getRecordNamaGuru(){
            return this.NamaGuru;
        }

        public void insertAlamatGuru(String isi){
            this.AlamatGuru.add(isi);
        }

        public ArrayList<String> getRecordAlamatGuru(){
            return this.AlamatGuru;
        }

        public void insertTeleponGuru (Integer isi){
            this.TeleponGuru.add(isi);
        }

        public ArrayList<Integer> getRecordTeleponGuru(){
            return this.TeleponGuru;
        }

        public void insertEmailGuru (String isi){
            this.EmailGuru.add(isi);
        }

        public ArrayList<String> getRecordEmailGuru(){
            return this.EmailGuru;
        }

        public void insertStatusGuru (String isi){
            this.StatusGuru.add(isi);
        }

        public ArrayList<String> getRecordStatusGuru(){
            return this.StatusGuru;
        }

        public void insertUserName(String isi){
            this.UserName.add(isi);
        }

        public ArrayList<String> getRecordUserName(){
            return this.UserName;
        }
        
        public void insertPassword(String isi){
            this.Password.add(isi);
        }

        public ArrayList<String> getRecordPassword(){
            return this.Password;
        }
        
        public void insertKodeSekolah(String isi){
            this.KodeSekolah.add(isi);
        }

        public ArrayList<String> getRecordKodeSekolah(){
            return this.KodeSekolah;
        }
        
        public void insertKodeUser(String isi){
            this.KodeUser.add(isi);
        }

        public ArrayList<String> getRecordKodeUser(){
            return this.KodeUser;
        }
    
}
