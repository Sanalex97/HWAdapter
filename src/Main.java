public class Main {
    public static void main(String[] args) {
        Ints calc = new InstCalculator(new Calculator());
        int a = 2;
        int b = 3;
        System.out.println(a + " * " + b + " = " + calc.mult(a, b));
        System.out.println(a + " + " + b + " = " + calc.sum(a, b));
        System.out.println(a + " ^ " + b + " = " + calc.pow(a, b));
    }
}
