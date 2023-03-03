/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

/**
 *
 * @author aplikasi
 */
public class one {
    private String nama;
    public String alamat;
    
    public one() {
        
    }
    public one(String nama) {
        this.nama = nama;
    }
    
    public one(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
    }
    
    public String getNama() {
        return nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    static void suara() {
        System.out.println("menampilkan bunyiiii");
    }
    public void suara2() {
        System.out.println("menampilkan bunyiiii lagi");
}
}
