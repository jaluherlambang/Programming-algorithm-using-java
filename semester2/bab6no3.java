
package semester2;


public class bab6no3 {

    public static void main(String[] args) {
        int n =234;
        boolean palindrom =  isPalindrome(n);
        
        if (palindrom ) {
            System.out.println(n + "adalah bilangan palindrom");
        }
        else {
            System.out.println();
        }
     
    }
    public static int reverse (int n) {
         int sisa_bagi = n%10;
        int hasil_bagi = n/10;
        int n_baru = sisa_bagi;
        
        while(hasil_bagi > 0) {
            sisa_bagi = n%10;
            hasil_bagi = n/10;
            n_baru = 10 *n_baru + sisa_bagi;
        }
        return n_baru;
    }
    
    public static boolean isPalindrome (int n) {
        int n_baru = reverse(n);
        boolean hasil = false;
        
        if (n == n_baru) { // belom seleseeee
    }
}
