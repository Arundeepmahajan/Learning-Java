/*Simply Copied from W3Schools, Don't blame me for this*/
public class MethodOverloading {
    static int plusMethodInt(int x, int y) {
        return x + y;
    }

    static double plusMethodDouble(double x, double y) {
        return x + y;
    }

    public static void main(String[] args) {
        int num1 = plusMethodInt(8, 5);
        double num2 = plusMethodDouble(37.7789098, 45.679234);
        System.out.println("The sum of the integers is :" + num1);
        System.out.println("The sum of the double is :" + num2);
/* Similiarly you can do many things with the method overloading will try to cover it in the coming files*/
    }

}
