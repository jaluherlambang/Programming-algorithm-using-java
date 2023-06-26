/the template in the editor.
 */
package semester2;

import java.util.Scanner;

public class bab6no17 {

    public static void main(String[] args) {
        Scanner triangle = new Scanner(System.in);
        
        int n = 3;
        int m = 20;
        
        printMatrix(n, m);
        
    }
    public static void printMatrix(int n,  int m) {
        for(int i =0; i<n; i++) { // baris
            for(int j = 0; j<m; j++) { // kolom
                
                double randomnum =Math.random();
                int a = 0;
                if (randomnum>0.5) {
                    a = 1;
                }
                System.out.print(a +" " );
            }
            System.out.println();
        }
        
    }
    
}
