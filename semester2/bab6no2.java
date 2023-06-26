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
public class bab6no2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          int a = 234;
        int jumlah_digit = sumDigits(a);
        System.out.println(jumlah_digit);
    }
        
    public static int sumDigits(int n)  {
        int sisa_bagi = n%10;
        int hasil_bagi = n/10;
        int jumlah_digit = sisa_bagi;
        
        while(hasil_bagi > 0) {
            sisa_bagi = n%10;
            hasil_bagi = n/10;
            jumlah_digit += sisa_bagi;
        }
        return jumlah_digit;
    }
    
}
