public class Main {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(2, 2));
        System.out.println(calc.substract(1,2));
        System.out.println(calc.mult(1,2));
        System.out.println(calc.div(3, 0));
    }
}
