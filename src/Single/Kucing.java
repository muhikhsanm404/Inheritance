/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Single;

/**
 *
 * @author Muh Ikhsan M
 */
public class Kucing extends Mamalia {
    //mewarisi constructor dari main class
    public Kucing(String nama){
        super(nama);
    }
    @Override
    public void speak(){
        System.out.println("Kucing suaranya meowng");
    }
}
