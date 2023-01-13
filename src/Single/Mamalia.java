/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Single;

/**
 *
 * @author Muh Ikhsan M
 */
public class Mamalia {
    //private
    //protected 
    private String nama;
    
    //getter
    public String getNama(){
        return nama;
    }
    //setter
    public void setNama(String nama){
        this.nama = nama;
    }
    //constructor
    public Mamalia(String nama){
        this.nama = nama;
    }
    public void makan(String input){
        System.out.println(nama+" makan: "+input);
    }
    
    //overidden speak()
    public void speak(){
        System.out.println(nama+" suaranya ?");
    }
}
