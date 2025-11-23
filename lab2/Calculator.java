public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public static String operationType = "Arithmetic Operations";

    public static void displayStaticInfo() {
        System.out.println("This is a static method.");
        System.out.println("Operation Type: " + operationType);
    }

    public static void main(String[] args) {
       
        System.out.println("--- Static Member Access ---");
        Calculator.displayStaticInfo();
        System.out.println("Static Field Accessed: " + Calculator.operationType);
        System.out.println();

        Calculator calc = new Calculator();
        System.out.println("--- Method Overloading in Action ---");
        System.out.println("Sum of 10 and 20 (int): " + calc.add(10, 20));

        System.out.println("Sum of 10.5 and 20.5 (double): " + calc.add(10.5, 20.5));

        System.out.println("Sum of 10, 20, and 30 (int): " + calc.add(10, 20, 30));
    }
}




