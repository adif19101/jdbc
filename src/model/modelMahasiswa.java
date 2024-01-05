/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import database.koneksi;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Muhammad Adif Fikri || 1910631170101
 */
public class modelMahasiswa {
    private String npm;
    private String nama;
    private String jurusan;
    private String alamat;
    
    koneksi koneksi = new koneksi();
    
    public modelMahasiswa(){
        
    }

    public String getNpmModel() {
        return npm;
    }

    public String getNamaModel() {
        return nama;
    }

    public String getJurusanModel() {
        return jurusan;
    }

    public String getAlamatModel() {
        return alamat;
    }

    public koneksi getKoneksiModel() {
        return koneksi;
    }

    public void setNpmModel(String npm) {
        this.npm = npm;
    }

    public void setNamaModel(String nama) {
        this.nama = nama;
    }

    public void setJurusanModel(String jurusan) {
        this.jurusan = jurusan;
    }

    public void setAlamatModel(String alamat) {
        this.alamat = alamat;
    }

    public void setKoneksiModel(koneksi koneksi) {
        this.koneksi = koneksi;
    }
    
    public void SimpanDataMahasiswa(){
        String sql = ("INSERT INTO mahasiswa (nim, nama, jurusan, alamat)"
                + "VALUES('"+getNpmModel()+"','"+getNamaModel()+"','"+getJurusanModel()+"','"+getAlamatModel()+"')");
        try {
            PreparedStatement eksekusi = koneksi.configDB().prepareStatement(sql);
            eksekusi.execute();
            
            JOptionPane.showMessageDialog(null, "data berhasil disimpan");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "data gagal disimpan \n" + e);
        }
    }
    
    public void EditDataMahasiswa(){
        if (getNpmModel().equals("") || getNamaModel().equals("") || getAlamatModel().equals("")) {
            JOptionPane.showMessageDialog(null, "Data Belum Lengkap");
        } else {
            String sql = "UPDATE mahasiswa SET nama = '"+getNamaModel()+"', alamat = '"+getAlamatModel()
                    +"', jurusan = '"+getJurusanModel()+"' WHERE nim = '"+getNpmModel()+"'";
            try {
                PreparedStatement eksekusi = koneksi.configDB().prepareStatement(sql);
                eksekusi.execute();
                JOptionPane.showConfirmDialog(null, "Edit Berhasil");
                
            } catch (Exception e) {
                JOptionPane.showConfirmDialog(null, "Edit Gagal");
                JOptionPane.showConfirmDialog(null, e);
            }
        }
    }
    
    public void HapusDataMahasiswa(){
        String sql = "DELETE FROM mahasiswa WHERE nim = '"+getNpmModel()+"'";
        try {
            PreparedStatement eksekusi = koneksi.configDB().prepareStatement(sql);
            eksekusi.execute();
            JOptionPane.showConfirmDialog(null, "Data Berhasil Dihapus");
            
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "Data Gagal Dihapus");
            JOptionPane.showConfirmDialog(null, e);
        }
    }
}
