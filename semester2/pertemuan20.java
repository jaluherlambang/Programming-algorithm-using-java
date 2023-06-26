/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semester2;

import java.util.Scanner;

public class pertemuan20 {

    public static void main(String[] args) {
        /*array
        String[] cars = {"BMW", "Mercy", "Toyota", "Mazda", "Honda", "Subaru"};
        
       int[] mynum = {12, 6, 9, 0, 45, 8} ;
        
        //cara mengakses
        System.out.println(cars[2]);
        System.out.println(mynum[0]);
        
        //cara mengubah nilai
        mynum[2]=100;
        System.out.print(mynum[2]);
        
        //cara tau array panjangnya brp.  banyaknya elemen dalam sebuah array
        System.out.println("Panjang array mynum adalah = " + mynum.length);
        System.out.println("panjang array cars adalah = " + cars.length);
        
        //loop on array
        for (int i=0; i<cars.length; i++) {
            System.out.println(cars[i]);
        }
        //cara lain for
        for (String i : cars) {
            System.out.println(i);
            
        }
        
        Scanner bacaInput = new Scanner(System.in);
        
        System.out.println("Masukkan panjang array yang diinginkan : ");
        int n = bacaInput.nextInt();
        int[] a =new int[n];
        
        
        System.out.println("Masukkan array : ");
        for (int i=0; i<n; i++) {
            a[i] = bacaInput.nextInt();
        }
           
    
        
        
        System.out.println("Masukkan bilangan bulat : ");
        int x = bacaInput.nextInt();
        
        String hasil = " ";
        
        while (x>0 ) {
            int sisabagi = x %10;
            int hasilbagi = x/10;
            
            hasil = sisabagi + "   " + hasil;
            
            x = hasilbagi;
        }
        
        System.out.println(hasil);
        */
        //array multidimnesional
        int[][] z ={ {1,2,3,0}, 
                {2,6,0,2},
                {5,1,7,3} } ; 
        System.out.println(z[1] [1]);
        
        System.out.println("Banyak baris : " + z.length);
        System.out.println("Banyak kolom : "+ z[0].length);
        
        for (int i=0; i<z.length;i++) {
            for (int j=0; j<z[0].length; j++) {
                System.out.print(z[i][j] + " " );
            }
            System.out.println();
        }
        System.out.println();
    }
    
}
