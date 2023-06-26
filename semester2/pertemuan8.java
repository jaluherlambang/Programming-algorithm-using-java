
package semester2;

import java.util.Scanner;

public class pertemuan8 {

    public static void main(String[] args) {
    // Latihan soal bab1 nomor 4    
    
    int a;
    int b;
    int c;
    
    a=1;
    b=a*a;
    c=a*a*a;
    
    System.out.println("jawaban nomor 4 : ");
   System.out.println(a+"\t"+b+"\t"+c);
        
     a=2;
    b=a*a;
    c=a*a*a;
    
   System.out.println(a+"\t"+b+"\t"+c);
        
    a=3;
    b=a*a;
    c=a*a*a;
    
   System.out.println(a+"\t"+b+"\t"+c);
        
    a=4;
    b=a*a;
    c=a*a*a;
    
  System.out.println(a+"\t"+b+"\t"+c);
        
   //latihan bab 1 nomor 5
        
   double A = 9.5*4.5-2.5*3;
   double B = 45.5 - 3.5;
   double C = A/B;
       
  System.out.println("jawaban nomor 5 : ");
  System.out.println(C);
   
  // latsol bab1 nomor 7
  
  double d = (1.0 - (1.0/3) + (1.0/5) - (1.0/7) +(1.0/9) - (1.0/11));
  double e = (1.0 - 1.0/3 + 1.0/5 - 1.0/7 +1.0/9 - 1.0/11 + 1.0/13);
  double f = 4*d;
  double g = 4*e;
        System.out.println("jawaban nomor 7 : ");
        System.out.println(f);
        System.out.println(g);
        
 // latsol Bab 1 nomor 8
 
 double r = 5.5;
 double phi = 3.14;
 double luas = phi * r * r;
 double keliling = 2*Math.PI*r;
 
        System.out.println("jawaban nomor 8 adalah : ");
        System.out.println("Luas = "+ luas);
        System.out.println("Keliling = " + keliling);
 
//latsol bab 1 nomor 10

double jarakkm = 14;
double minute = 45;
double second = 30;

double jarakmil = jarakkm/1.6;
double totalsecond = minute*60 + second;
double hour = totalsecond/3600;

        System.out.println("jawaban nomor 10 adalah : ");
        System.out.println(jarakmil/hour);

//latsol bab 1 nomor 13
double h = 3.4;
double i = 50.2;
double j = 2.1;
double k = 0.55;
double l = 44.5;
double m = 5.9;

double x = (l*k-i*m) / (h*k-i*j);
double y = (h*m-l*j) / (h*k-i*j);

        System.out.println("jawaban nomor 13 : ");
        System.out.println(x);
        System.out.println(y);
        
 //latihan soal bab 2 nomor 6

 Scanner bacainput = new Scanner(System.in);
 
        System.out.print("Masukkan bilangan bulat antara 0 sampai 1000 : ");
        
        int ab = bacainput.nextInt();
        int bc = ab % 10;
        int cd = ab /10;
        int jumlah = bc;
        
        ab = cd;
        bc = ab % 10;
        cd = ab /10;
        jumlah += bc;
        
        ab = cd;
        bc = ab % 10;
        cd = ab /10;
        jumlah += bc;
        
        System.out.println("jawaban bab 2 nomor 6 : ");
        System.out.println(jumlah);
       
// latsol bab 2 nomor 15
/*
Scanner geometri = new Scanner(System.in);

        System.out.print("Masukkan x1 dan y1 :");
        
        double x1 = geometri.nextDouble();
        double y1 = geometri.nextDouble();
        
System.out.print("Masukkan x2 dan y2 :");

        double x2 = geometri.nextDouble();
        double y2 = geometri.nextDouble();

        double kuadrat = Math.pow(x2-x1,2) + Math.pow(y2-y1, 2);
        double jaraktitik = Math.sqrt(kuadrat);
        
        System.out.println("jawaban bab 2 nomor 15 : ");
        System.out.println(jaraktitik);

*/
// latsol bab 2 nomor 19

Scanner segitiga = new Scanner(System.in);

        System.out.print("Masukkan tiga titik segitiga : ");
        
        double x1 = segitiga.nextDouble();
        double y1 = segitiga.nextDouble();
        double x2 = segitiga.nextDouble();
        double y2 = segitiga.nextDouble();
        double x3 = segitiga.nextDouble();
        double y3 = segitiga.nextDouble();
        
        double sisi1 = Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2);
        sisi1 = Math.sqrt(sisi1);
        
        double sisi2 = Math.pow(x3-x1, 2) + Math.pow(y3-y1, 2);
        sisi2 = Math.sqrt(sisi2);
        
        double sisi3 = Math.pow(x3-x2, 2) + Math.pow(y3-y2, 2);
        sisi3 = Math.sqrt(sisi3);
        
       double sisi = (sisi1 + sisi2 +sisi3) /2;
       
       double Luas = Math.sqrt(sisi *(sisi-sisi1) * (sisi-sisi2) * (sisi-sisi3));
       
        System.out.println(Luas);

Scanner saldobunga = new Scanner(System.in);

        System.out.println("Masukkan saldo dan suku bunga : ");
        
        double saldo = saldobunga.nextDouble();
                double sukubunga = saldobunga.nextDouble();
                
                double bunga = saldo * (sukubunga/1200);
                
                System.out.println("Bunga bulan pertama adalah : " + bunga);

    }
    
}
