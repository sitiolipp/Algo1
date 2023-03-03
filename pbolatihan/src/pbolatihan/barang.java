/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbolatihan;

/**
 *
 * @author aplikasi
 */
public class barang extends induk implements pendataan{
    //ini bagian dari pendataan
    String nama;
    int harga, jumlah;

    @Override
    public void tambah() {
        throw new UnsupportedOperationException("menambah data"); 
    }

    @Override
    public void tampil() {
        throw new UnsupportedOperationException("menampilkan data"); 
    }

    @Override
    public void ubah() {
        throw new UnsupportedOperationException("mengubah data"); 
    }

    @Override
    public void hapus() {
        throw new UnsupportedOperationException("menghapus data"); 
    }

    @Override
    public void tampilan() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
