public class Main {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(("Ответ:") + calc.add(3, 5));
        System.out.println(("Ответ:") + calc.substract(1, 2));
        System.out.println(("Ответ:") + calc.mult(1, 2));
        System.out.println(("Ответ:") + calc.div(4, 0));
//        calc.main(null);
    }
}

