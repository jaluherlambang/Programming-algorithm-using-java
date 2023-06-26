
package semester2;


public class pertemuan18 {

    public static void main(String[] args) {
        //bab 6.2
        for (int i=0; i<=100; i++) {
            int a = getPentagonalNumber(i);
            System.out.print(a+ " " );
            
            if (i%10==0) { // ??????????
                System.out.println();
            }
        }
        
    }
    
    public static int getPentagonalNumber(int n) {
        int hasil = n*(3*n-1)/2;
        return hasil;
    }
}
