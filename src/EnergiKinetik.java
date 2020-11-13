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
 * Deskripsi Program : berisi class Energi Kinetik
 */
public class EnergiKinetik {
    private double massa, kecepatan;
    public EnergiKinetik(double massa, double kecepatan){
        this.massa = massa / (1000);
        this.kecepatan = kecepatan; 
    }
    
    public double getMassa(){
        return massa;
    }
    
    public void setMassa(double massa){
        this.massa = massa;
    }
    
    public double getKecepatan(){
        return kecepatan;
    }
    
    public void setKecepatan(double kecepatan){
        this.kecepatan = kecepatan;
    }
    
    public double hitungEnergiKinetik(){
        return 0.5 * massa * Math.pow(kecepatan,2);
    }
    
    public double hitungUsaha(double kecepatanAwal){
        return 0.5 * massa * (Math.pow(kecepatan,2) - Math.pow(kecepatanAwal,2));
    }
}
