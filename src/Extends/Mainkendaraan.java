/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Extends;
/**
 *
 * @author Muh Ikhsan M
 */
public class Mainkendaraan extends kendaraan{
   
    @Override
    public void jalankan(){
        System.out.println("Matic");
    }
    @Override  // analisa set dan get
    public void setMesin(String mesin) {
        System.out.println("Besar mesin: "+mesin); 
    }
   @Override 
    public String getMesin(){ 
       return super.getMesin();
     } 
    public static void main(String[]args){
        Mainkendaraan mainKendaraan = new Mainkendaraan(); //intansiasi
        //mainKendaraan.jalankan();
        mainKendaraan.setMesin("150 cc"); //analisa
        System.out.println(mainKendaraan.getMesin()); }
    }    

