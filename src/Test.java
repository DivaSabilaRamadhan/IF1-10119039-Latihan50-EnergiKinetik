/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 
 * Nama  : Diva Sabila Ramadhan 
 * Kelas : IF1
 * NIM   : 10119039
 * Deskripsi Program : berisi program untuk energi kinetik dengan pendekatan objek 
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EnergiKinetik objek = new EnergiKinetik(145, 25);
        System.out.println("====Menghitung Energi Kinetik====");
        System.out.printf("Massa : %.3f Kg\n", objek.getMassa());
        System.out.printf("Kecepatan : %.0f m/s\n", objek.getKecepatan() );
        System.out.printf("Energi Kinetik : %.4f J\n", objek.hitungEnergiKinetik());
        System.out.printf("Usaha : %.4f J\n", objek.hitungUsaha(0));
    }
    
}
