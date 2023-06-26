
package semester2;

import java.util.Scanner;

public class pertemuan11 {

    public static void main(String[] args) {
        
        int x = 10;
        int y = 18;
        
        System.out.println("x is equal to "+ x);
        System.out.println("y is equal to " + y);
        
        if(x>y) {
            System.out.println("x is greater than y");
            System.out.println("thats true");
        }
        else if(x<y){
            System.out.println("x is smaller than y");
        }
        else {
            System.out.println("x is equal to y");
            System.out.println("really?");
        }
        System.out.println("END");
        
        int time = 20;
        String result = (time < 18) ? "Have a nice day." : "Good Evening.";
        System.out.println(result);
        
        if (time <18) {
            result = "Have a nice day.";            
        }
        else {
            result = "Good Evening.";
        }
        System.out.println(result);
        
        String a = "cerah";
        String b = "Jogging";
        
        if (a=="cerah") {
            System.out.println("hari ini cerah");
       }
        if (b=="Jogging") {
            System.out.println("Hari ini jogging");
        }
        else {
            System.out.println("Hari ini nyantuuuuy");
        }
        
        Scanner akar = new Scanner(System.in);
        System.out.println("Masukkan a, b, c : ");
        double A = akar.nextDouble();
        double B = akar.nextDouble();
        double C = akar.nextDouble();
        double D = B*B - 4*A*C;
        
        
   }
}
    

