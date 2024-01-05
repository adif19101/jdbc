/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.modelMahasiswa;
import view.viewMahasiswa;
/**
 *
 * @author Muhammad Adif Fikri || 1910631170101
 */
public class controllerMahasiswa {
    private modelMahasiswa mM;
    private viewMahasiswa vM;
    private int jurusan;
    
    public controllerMahasiswa(viewMahasiswa vM){
        this.vM = vM;
    }
    
    public void simpan(){
        mM = new modelMahasiswa();
        
        mM.setNpmModel(vM.getNpmView().getText());
        mM.setNamaModel(vM.getNamaView().getText());
        
        jurusan = vM.getJurusanView().getSelectedIndex();
        switch (jurusan){
            case 0:
                mM.setJurusanModel("Teknik Informatika");
                break;
            case 1:
                mM.setJurusanModel("Sistem Informasi");
                break;
            default:
                mM.setJurusanModel("Kosong");
                break;
        }
        mM.setAlamatModel(vM.getAlamatView().getText());
        
        mM.SimpanDataMahasiswa();
    }
    
    public void edit(){
        mM = new modelMahasiswa();
        
        mM.setNpmModel(vM.getNpmView().getText());
        mM.setNamaModel(vM.getNamaView().getText());
        
        jurusan = vM.getJurusanView().getSelectedIndex();
        switch (jurusan){
            case 0:
                mM.setJurusanModel("Teknik Informatika");
                break;
            case 1:
                mM.setJurusanModel("Sistem Informasi");
                break;
            default:
                mM.setJurusanModel("Kosong");
                break;
        }
        mM.setAlamatModel(vM.getAlamatView().getText());
        
        mM.EditDataMahasiswa();
    }
    
    public void hapus(){
        mM = new modelMahasiswa();
        
        mM.setNpmModel(vM.getNpmView().getText());
        mM.HapusDataMahasiswa();
    }
}
