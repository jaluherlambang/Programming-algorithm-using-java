
package semester2;

public class pertemuan7 {

    public static void main(String[] args) {
       String jalu = "jalol";
        System.out.println(jalu.length());
        byte batasbyte = 127;
        byte batasbawah = -128;
        float mynumber = 10.6748f;
        //float harus ditambahi huruf f belakangnya
        
        System.out.println(batasbawah + batasbyte);
        
        batasbawah = 21;
        
        System.out.println(batasbawah);
        System.out.println(mynumber);
        
        long nyobalong = 150000000000000L;
        //long harus ada tambahan huruf L
        
        System.out.println(nyobalong);
        
        String tanya = "jika jalu memiliki 2 buah semangka,akan tetapi jalu membagikannya dengan harapan supaya dia bisa bertambah tinggi, jadi berapa tinggi jalu setelah membagikan semangka?";
        
        System.out.println(tanya.length());
        
        //pakai float presisi bisa hanya 6 atau 7 desimal, sedangkan double bisa sampai 15 digit
        float f1 = 35e-3f;
        double d1=2.45e5;
        
        System.out.println(f1);
        System.out.println(d1);
        //e mempunya arti 10 pangkat .....
    }
    
}
