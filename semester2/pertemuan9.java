/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semester2;

/**
 *
 * @author ASUS
 */
public class pertemuan9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 66;
        int b = 666;
        int c = a + b;
        int d = a - b;
        int e = a * b;
        int f = a/b;
        int g = ++a;
        int h = --b;
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println("nilai e adalah " + e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        System.out.println(a+b+c+d+e+f+g+h);
        
        e = a*b;
        
        System.out.println("nilai e baru " + e);
        
        a++;
        b--;
        
        e = a*b;
        
        System.out.println("nilai e baru lagi = " + e);
        
        int i = a++; // kalo a++ i nya masih nilai sebelumnya, kalo ++a nilai i sudah menyimpan hasilnya terlebih dahulu
        
        System.out.println(a);
        System.out.println(i);
        
        
        
        
        
        System.out.printf("apakah tuhan itu ada? ");
        boolean membuktikantuhan = true;
        
        System.out.println(" " + membuktikantuhan);
        
        double x = 17;
        double y = 20;
        double z = 25;
        
        boolean answer;
        answer =x == y;
        
        System.out.println("nilai answer adalah " + answer);
        
        System.out.println(x == z); // equal to
        System.out.println(x !=z); //not equal to
        System.out.println(x > z);//greater than
        System.out.println(x < y);//less than
        System.out.println(y >= z);
        
        //logical operators
        // && = and
        // || = or
        // ! = not / negasi
        
        boolean t = true;
        boolean s = false; 
        
        boolean j = t&&s;
        boolean l = t || s;
        boolean u = !s;
        
        System.out.println(j);
        System.out.println(l);
        System.out.println(u);
    }
    
}
