/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semester2;


public class bab6no5 {

    public static void main(String[] args) {
    double a = 1000;
    double b = 500;
    double c = 120;
    
    displaySortedNumbers (a, b, c);
    }
    public static void displaySortedNumbers(double a, double b, double c) {
        if (b < a) {
            double temp = a; 
            a = b;
            b = temp; // menukar tempat
        }
        
        if (c < b) {
            double temp = c;
            c = b;
            b = temp;
            
        }
        
        if (c < a) {
            double temp = a ;
            a = c;
            c = temp;
        
        }
    
        System.out.println(a +"  " +  b + " " +  c);
    }
    
}
