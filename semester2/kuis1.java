
package semester2;

import java.util.Scanner;

public class kuis1 {

   
    public static void main(String[] args) {
        /*
        Scanner triangle = new Scanner(System.in);

    System.out.println("Enter three edges for a triangle:");
        System.out.print(" Edge 1 points x, y: ");
         double x1 = triangle.nextDouble();
        double y1 = triangle.nextDouble();
       System.out.print(" Edge 2 points x, y: ");
        double x2 = triangle.nextDouble();
        double y2 = triangle.nextDouble();
        System.out.print(" Edge 3 points x, y: ");
        double x3 = triangle.nextDouble();
        double y3 = triangle.nextDouble();
        
        boolean valid = (x1 + y1 > x3 + y3 && x2 + y2 > x3 + y3) ||
        (x1 + y1 > x2 + y2 && x3 + y3 > x2 + y2) ||
         (x3 + y3 > x1 + y1 && x2 + y2 > x1 + y1);
        
        if (valid) {
        double side1 = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);
            double side2 = Math.pow(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2), 0.5);
            double side3 = Math.pow(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2), 0.5);
                
            System.out.println("keliling dari segitiga adalah = " + (side1 + side2 + side3));
            
             }

        else {
            System.out.println("input is invalid");
      
        }
        
            /*
            Scanner input = new Scanner(System.in);

            System.out.print("Enter a point with two coordinates: ");
	double x = input.nextDouble();
	double y = input.nextDouble();

	boolean withinCircle =
	(Math.pow(Math.pow(x, 2) + Math.pow(y, 2), 0.5) <= 10);

	System.out.println("Point (" + x + ", "+ y + ") is " + 
	((withinCircle) ? "in " : "not in ") + "the circle");

            final int angkatiapbaris = 10;	 
                int count = 0;


            for (int i = 100; i <= 1000; i++) {
	if (i % 5 == 0 && i % 6 == 0) {
	count++;	// increment count
	if (count % angkatiapbaris == 0) 
                    System.out.println(i);
	else
	System.out.print(i + " ");
        */
        Scanner input = new Scanner(System.in);

		// Prompt the user to enter an integer
		System.out.print("Enter an integer: ");
		int number = input.nextInt();
		int index = 2; // Numbers to test as factors 

		// Find and display all the smallest factors in increasing order
		while (number / index != 1) {
			// Test as a factor of number
			if (number % index  == 0) {
				System.out.print(index + ", ");
				number /= index; 
			}
			else
				index++; // Increment index
		}
		System.out.println(number + ".");
        *
        }
            }
    }
    
}
