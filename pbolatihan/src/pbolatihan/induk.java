/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbolatihan;

//public class induk {
//    String nama, alamat;
//    public void bunyi2() {
//        System.out.println("menampilkan bunyi lagi");
//}
    
    abstract class induk implements pendataan{
        String nama, alamat;
        //method reguler
        public void bunyi2() {
            System.out.println("pokok berbunyi lah yaaa wkwk");
    }
     
        //method abstract,soalnya tanpa body dan tak perlu kurawal
        public abstract void tampilan();
    }
