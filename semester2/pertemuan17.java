package semester2;

public class pertemuan17 {

    public static void main(String[] args) {
        
        for(int x = 0; x<=10; x++) {
            System.out.println(f(x) );
        }   
        mymetode();
        mymetode();
        
        int hasil = g(3, 5);
        System.out.println(hasil);
        
        for(int i = 1; i<=5; i++) {
            for (int j= 1; j<=5; j++) {
                System.out.println("i : " + i);
                System.out.println("j : " +j);
                System.out.println("g(i,j) : " + g(i,j) );
            }
        }
        
        int var1 = 10;
        int var2 =20;
        hasil = g(var1,var2);
        System.out.println(hasil);
        
        namadanusia("Andi", 15);
        
        CheckAge(20);
    }
    
    public static void CheckAge(int age) {
        if(age<18) {
            System.out.println("Acces denied - You are not old enough");
        }
        else {
            System.out.println("Acces granted - You are old enough");
        }
    }
    
    public static int f(int x) {
        return x*x*x + x*x +x + 1 ;
    }
    
    public static int g(int x, int y) {
        return x*y;
    }
    
    public static double h(double a, int b) {
        return a*b;
    } 
    
    public static void mymetode() {
        System.out.println("i just excited");
    }
    
    public static void namadanusia(String nama, int usia) {
        System.out.println("nama : " +nama + "\t" + "usia : " +usia);
    }
}
//nama method boleh sama tapi parameter harus berbedaaaaa