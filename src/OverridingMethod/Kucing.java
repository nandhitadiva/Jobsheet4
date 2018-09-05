/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OverridingMethod;

/**
 *
 * @author WINDOWS 10
 */
public class Kucing extends Hewan{
    @Override
    void setNama(){
        String Kucing = "Carberus";
        System.out.println("Nama Kucing : "+Kucing);
    }
    @Override
    void setSuara(){
        String Suara = "Miaw Meow Meong";
        System.out.println("Suara Kucing : "+Suara);
    }
    @Override
    void setBerat(){
        double Berat = 2.0;
        System.out.println("Berat Kucing : "+Berat+"Kg");
    }
}
