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
public class dataPelajaran {
    
    private ArrayList<Integer> kodePelajaran;
    private ArrayList<String> namaPelajaran;
    
    public dataPelajaran(){
        
        kodePelajaran = new ArrayList<Integer>();
        namaPelajaran = new ArrayList<String>();
        
    }
    
    public void insertKodePelajaran(Integer isi){
        this.kodePelajaran.add(isi);
    }
    
    public ArrayList<Integer> getRecordKodePelajaran(){
        return this.kodePelajaran;
    }
    
    public void insertNamaPelajaran (String isi){
        this.namaPelajaran.add(isi);
    }
    
    public ArrayList<String> getRecordNamaPelajaran(){
        return this.namaPelajaran;
    }
    
    
}
