package semester2;

public class huhu {

    public static void main(String[] args) {
         int x = 5 , y =7;
        System.out.println("x = " + x + ", y = " + y);
        haha (x,y);
        System.out.println("x = " + x + ", y = " + y);
    }
    public static void haha(int x, int y) {
        int hihi = x;
        x = y;
        y = hihi;
        System.out.println("x = " + x + ", y = "+ y);
    }
}
