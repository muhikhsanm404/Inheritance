/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Single;

/**
 *
 * @author Muh Ikhsan M
 */
public class MainMamalia {
    public static void main(String[]args){
        //Kucing cat = new Kucing ("Bristh Shorthair");
        //class yang dijadikan referens untuk objek cat adalah kelas mamalia
        Mamalia cat = new Mamalia ("Bristh Shorthair");
        
        cat.speak();
        //cat.nama="Bristh Shorthair";
        cat.makan("ikan");
    }
}
