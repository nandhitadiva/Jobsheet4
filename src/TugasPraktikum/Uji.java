/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum;
import java.util.Scanner;
/**
 *
 * @author WINDOWS 10
 */
public class Uji {
    public static void main(String[] args){
        Scanner masukan = new Scanner(System.in);
        Manusia l = new Lakilaki(0);
        Manusia p = new Perempuan(0);
        String Kelamin;
        System.out.println("User 1");
        System.out.print("Masukkan Tinggi badan anda (cm) = ");
        l.TinggiBadan = p.TinggiBadan = masukan.nextDouble();
        System.out.print("Masukan Jenis kelamin = ");
        Kelamin = masukan.next(); //inputan scanner
        switch(Kelamin){
            case "L":System.out.print("Berat badan pria ideal anda adalah = "+l.htgbbi());
            break;
            case "P":System.out.print("Berat badan wanita ideal anda adalah = "+p.htgbbi());
            break;
            case "l":System.out.print("Berat badan pria ideal anda adalah = "+l.htgbbi());
            break;
            case "p":System.out.print("Berat badan wanita ideal anda adalah = "+p.htgbbi());
            break;
        }
        System.out.println("\n");
        System.out.println("User 2");
        System.out.print("Masukkan Tinggi badan anda (cm) = ");
        l.TinggiBadan = p.TinggiBadan = masukan.nextDouble();
        System.out.print("Masukan Jenis kelamin = ");
        Kelamin = masukan.next();
        switch(Kelamin){
            case "L":System.out.println("Berat badan pria ideal anda adalah = "+l.htgbbi());
            break;
            case "P":System.out.println("Berat badan wanita ideal anda adalah = "+p.htgbbi());
            break;
            case "l":System.out.println("Berat badan pria ideal anda adalah = "+l.htgbbi());
            break;
            case "p":System.out.println("Berat badan wanita ideal anda adalah = "+p.htgbbi());
            break;
    }
    }
    }
