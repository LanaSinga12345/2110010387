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
public class dataUser {
    
    private ArrayList<Integer> kodeUser;
    private ArrayList<String> namaUser;
    private ArrayList<String> passwordUser;
    private ArrayList<String> statusUser;
    
    public dataUser(){
        
        kodeUser = new ArrayList<Integer>();
        namaUser = new ArrayList<String>();
        passwordUser = new ArrayList<String>();
        statusUser = new ArrayList<String>();
        
    }
    
    public void insertKodeUser(Integer isi){
        this.kodeUser.add(isi);
    }
    
    public ArrayList<Integer> getRecordKodeUser(){
        return this.kodeUser;
    }
    
    public void insertNamaUser (String isi){
        this.namaUser.add(isi);
    }
    
    public ArrayList<String> getRecordNamaUser(){
        return this.namaUser;
    }
    
    public void insertPasswordUser(String isi){
        this.passwordUser.add(isi);
    }
    
    public ArrayList<String> getRecordPasswordUser(){
        return this.passwordUser;
    }
    
    public void insertStatusUser (String isi){
        this.statusUser.add(isi);
    }
    
    public ArrayList<String> getRecordStatusUser(){
        return this.statusUser;
    }
    
}
