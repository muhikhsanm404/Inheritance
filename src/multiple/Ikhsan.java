/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multiple;

/**
 *
 * @author Muh Ikhsan M
 */

public class Ikhsan extends Kakek implements AyahInterface, IbuInterface{
   
    @Override
    public void cetak(){
        AyahInterface.super.cetak();
        IbuInterface.super.cetak();
        super.cetak();
    }
      public static void main(String[]args){ 
        Ikhsan ikhsan = new Ikhsan();
        ikhsan.cetak();
    }
}

 /*public class Ikhsan extends Ayah, Ibu {
    
   @Override
    public void cetak(){
        System.out.println(Ayah.cetak());
        System.out.println(Ibu.cetak());
        super.cetak();
    }
    public static void main(String[]args){ 
        Ikhsan ikhsan = new Ikhsan();
        ikhsan.cetak();
    }
} */
    

