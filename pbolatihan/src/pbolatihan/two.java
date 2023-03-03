/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbolatihan;

/**
 *
 * @author aplikasi
 */
public class two extends induk {
    String nik;
    static void bunyi() {
        System.out.println("menampilkan bunyi");
    }
    
    @Override
    public void bunyi2() {
        System.out.println("ternyata bunyi pertama");
}

    @Override
    public void tampilan() {
        throw new UnsupportedOperationException("ini method dari abstrak"); 
    }
}