package semester2;

import java.util.Scanner;

public class Pertemuan26 { //fungsi MAT

    public static void main(String[] args) {
        double a = Math.pow(5, 6); //pangkat
        System.out.println("5 pangkat 6 adalah" + a);
        
        double b = Math.random(); //merandom angka.
        System.out.println("Bilangan random antara 0 sampai 1 adalah "+b);
        //jika ingin selang antara 25 dampai 75
         double b1= 25+ Math.random()*50;
        System.out.println("Bilangan random antara 25 sampai 75 adalah "+b1);
        
        double c = Math.E;
        System.out.println("Nilai dari e adalah "+ c);
        
        double d = Math.PI;
        System.out.println("Nilai dari phi adalah "+d);
        
        double e =Math.exp(1.5);
        System.out.println("Nilai dari e pangkat 1,5 adalah "+e);
        
        int f = (int)Math.round(d);
        System.out.println("Nilai dari phi jika dibulatkan adalah "+ f);
        
        int g = Math.min(3, 10);
        System.out.println("Maksimum dari 3 dan 10 adalah "+g);
        
        int h = Math.min(3, 10);
        System.out.println("Minimum dari 3 dan 10 adalah "+g);
        
        double i = Math.abs(-10.5);
        System.out.println("Nilai mutlak dari  -10,5 adalah " + i);
        
        double j = Math.sin(Math.toRadians(30));
        System.out.println("Nilai dari sin 30 adalah "+ j);
                                                                    //TRIGONOMETRI  
        double k = Math.cos(Math.toRadians(45));
        System.out.println("Nilai dari cos phi/4 atau 45 adalah "+ k);
        
        double l = Math.sqrt(2);
        System.out.println("Nilai dari akar 2 adalah "+l);    //akar
        
        
        //STRINGGGGGGGGGGGGGGGGGGG Method
        String o = "Jalu Herlambang";
        System.out.println("Panjang dari string tersebut adalah "+ o.length());
       
        System.out.println("Karakter pada posisi ke 3 adalah " + o.charAt(2));
        
        String p = "  ya gitu anaknya  ";
        System.out.println("Gabungan stringnya adalah "+ o.concat(p));
        
        System.out.println("Hasil dari toUpperCase adalah " + o.toUpperCase());
        
        System.out.println("Hasil dari toLowerCase adalah " + o.toLowerCase());
        
        System.out.println("String membuang spasi depan dan belakang "+ p.trim()+o);
        
        System.out.println(" . ");
        
        System.out.println("Masukkan kata kamu ");
        Scanner input = new Scanner(System.in);
        String n = input.next();
        String v = input.next();
        System.out.println(n+ " "+ v);
        
        String r="Semangat terus";
        String s = "Semangat terus";
        
         if (r.equals(s) ) {
            System.out.println("r dan s sama");
         }
         
         if(r.contains("at te")){
             System.out.println("at te ada didalam "+ r);
         }
         
         System.out.println(" r.substring(3) adalah " + r.substring(3));
         
         System.out.println(" r.substring(3,11) adalah " + r.substring(3,11));
         
         String t ="1200";
         int u = Integer.parseInt(t);
         System.out.println(u);
         
         String V="1200.4567";
         double w =Double.parseDouble(V);
         System.out.println(w);
         
         double PHI =Math.PI;
        System.out.printf("Nilai dari phi adalah %.3f\n", PHI);  //UNTUK MENENTUKAN JUMLAH ANGKA DIBELAKANG KOMA
    } 
    
}
