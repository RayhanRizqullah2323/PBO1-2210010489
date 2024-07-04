package Pertemuan10;

import java.util.Scanner;

public class SalamKenal {
    public static void main(String[] args){
       Scanner input = new Scanner(Sytem.in);
        
       System.out.print("ketikan nama anda: ");
       String nama = input.nextLine();
       
       System.out.print("Ketikan Umur Anda: ");
       int usia = input.nextInt();
       
       System.out.print("Halo, salam kenal:  "+nama);
       System.out.printin(", usia anda "+usia+" tahun");
    }
    
}
