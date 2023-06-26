
package semester2;

import java.util.Scanner;

public class Pertemuan25 { //RECURSION

    public static void main(String[] args) {
        int result=sum(5, 10);
        System.out.println(result);
        
        int hasil=sum(6);
        System.out.println(hasil);
        
        result = factorial(4);
        System.out.println(result);
        
        result = fibonacci(11);
        System.out.println(result);
       
        int balik = gcd(120, 50);
        System.out.println(balik);
        
        double hasill = m(3);
        System.out.println(hasill);
        
        reverseDisplay("jalu herlambang");
       
    }
    public static int sum(int k) {
        if (k>0) {
            return k+sum(k-1);
        }
        else {
            return 0;
        }
    } // 10+9+8+7+6+5+4+3+2+1+0
    
    public static int sum(int start, int end){
        if (end>start){
            return end+sum(start, end -1);
        }
        else{
            return end;
        }
    }// return 10+(9+(8+(7+(6+sum(5,5) ) ) ) )
        //10+9+8+7+6+5
    
    public static int factorial(int n) {
        if (n>0){
            return n * factorial(n-1);
        }
        else{
            return 1;
        }
    }
    
    public static int fibonacci(int index) {
        if (index>=2){
           return fibonacci(index-1)+fibonacci(index-2);
        }
        else if(index==1){
            return 1;
        }
        else {
            return 0;
        }
    }
    
    public static int gcd(int a,int b){ 
        if (a%b > 0) {
            return gcd (b, a%b);
        }
        else {
            return b;
        }
    
    }
    
    public static double m(int i) {
        if (i==1) {
            double a=1;
            double b =3;
            return a/b;
        }
        else{
            double a=i;
            double b=2*i+1;
            return m(i-1)+(a/b);
        }
    }
    
    public static void reverseDisplay(String x) {
        int g=x.length();
        if(g>1){
            System.out.print(x.charAt(g-1));
            reverseDisplay(x.subSequence(0, g-1).toString());
        }
        else{
            System.out.println(x);
        }
    }
}
