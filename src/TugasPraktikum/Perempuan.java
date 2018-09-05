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
public class Perempuan extends Manusia {
    public Perempuan(double TB){
        this.TinggiBadan = TB;
    }
    public final double htgbbi(){
        return((TinggiBadan - 100) -((TinggiBadan - 100) * 15/100));
    }
}
