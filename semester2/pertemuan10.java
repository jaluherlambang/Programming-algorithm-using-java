
package semester2;

import java.util.Scanner;


public class pertemuan10 {

  
    public static void main(String[] args) {
        /*
        Scanner ScannerCanggih = new Scanner(System.in);
        System.out.print("Masukkan nama : " );
        String nama = ScannerCanggih.nextLine();  //untuk input string
        
        System.out.println("Nama user adalah " + nama );
        
        //menghitung luas persegi panjang
        System.out.print("Masukkkan Panjang : ");
        int p = ScannerCanggih.nextInt();  //untuk input integer
        
        System.out.print("Masukkan Lebar ; ");
        double l = ScannerCanggih.nextDouble();  //untuk input double
        
        double L = p*l;
        System.out.println("Luas persegi panjang adalah : " + L);
        */
        Scanner ScannerAneh = new Scanner(System.in);
        System.out.print("Press enter for lanjoot = " );
        String lanjut = ScannerAneh.nextLine();
       
        double a = 5;
        double b = Math.pow(a, 5);     // Math.pow untuk mempangkatkan numb
        System.out.println("nilai b adalah " + b);
        
        int c = (2 + 5) * 4 - 3 / 3;      //yang didalam kurung akan didahulukan
        System.out.println("nilai c adalah = " + c);
        
        String text = "DSFEGTGT5RBTHTYHTRDFSEHYHGTRBHTYBSGRGHYE563";
        System.out.println("Banyaknya char dalam string tsb = " + text.length());
        
        String ucapan = "Jalu berkata \"swiper jangan mencuri\". \n \tjadi swiper tidak jadi mencuri"; // \" untuk menulis petik 2 dalam string. begitu juga dengan menulis ' \
        //    \n berarti new line.  \t tab. \b backspace
        System.out.println(ucapan);
        
        
        System.out.println(Math.sqrt(2875));
        System.out.println(Math.random());
        
        //random pick angka
        int randomnum =(int)(Math.random()*10);
        System.out.println(randomnum);
    }
    
}
