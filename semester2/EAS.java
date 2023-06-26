
package semester2;

import java.util.Scanner;

public class EAS {

    public static void main(String[] args) {
        
    System.out.println(func(3));
        
    }
    public static int func(int n){
        if(n == 0){
            return 1;
        }else{
        return func(n -1) + 3;
        }
    }
}
        
   
