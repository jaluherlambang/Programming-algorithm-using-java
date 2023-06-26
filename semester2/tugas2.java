package semester2;

import java.util.Scanner;

public class tugas2 {

    public static void main(String[] args) {
        
        Scanner ScannerTemperature = new Scanner(System.in);
        System.out.print("Masukkan besarnya derajat celsius :  ");
        double Celsius = ScannerTemperature.nextDouble();
        
        double Fahrenheit = (9.0/5) * Celsius + 32;
        
        System.out.println(Celsius + " Celsius adalah " + Fahrenheit + " Fahrenheit.");
        
        
        Scanner ScannerMinute = new Scanner(System.in);
        System.out.print("Masukkan menit : ");
        int Minute = ScannerMinute.nextInt();
        
        int MinuteDay = 24*60;
        int MinuteYear = MinuteDay*365;
        int Years = Minute/MinuteYear;
        int Days = (Minute-MinuteYear * Years) / MinuteDay;
        
        System.out.println(Minute + " menit adalah sekitar " + Years + " tahun " + Days + " hari.");

        Scanner ScannerAverage_a = new Scanner(System.in);
        System.out.print("Maukkan v0, v1, dan t : ");
        double v0 = ScannerAverage_a.nextDouble();
        double v1 = ScannerAverage_a.nextDouble();
        double t = ScannerAverage_a.nextDouble();
        
        double Change_v = v1 - v0;
        double Average_a = Change_v / t;
        
        System.out.println("Besarnya percepatan rata-rata adalah " + Average_a);
        
        
        Scanner ScannerBMI = new Scanner(System.in);
        System.out.print("Masukkan berat dalam pounds : ");
        double Weight_P = ScannerBMI.nextDouble();
        
        System.out.print("Masukkan tinggi dalam inchi : ");
        double Height_I = ScannerBMI.nextDouble();
        
        double Weight_K = Weight_P * 0.45359237;
        double Height_M = Math.pow(Height_I * 0.0254, 2);
        double BMI = Weight_K / Height_M;
        
        System.out.println("nilai Body Mass Index(BMI) adalah " + BMI);
        
        
        Scanner ScannerHexagon = new Scanner(System.in);
        System.out.print("Masukkan sisi segienam : ");
        double Side = ScannerHexagon.nextDouble();
        
        double Side2 = Math.pow(Side, 2);
        double HexagonArea = 3 * Math.sqrt(3) / 2 * Side2;
        
        System.out.println("Luas segienam adalah " + HexagonArea);
    }
    
}
