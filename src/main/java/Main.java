import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Calculator calc = new Calculator();
//        System.out.println(("Ответ:") + calc.add(3, 5));
//        System.out.println(("Ответ:") + calc.substract(1, 2));
//        System.out.println(("Ответ:") + calc.mult(1, 2));
//        System.out.println(("Ответ:") + calc.div(4, 0));
////        calc.main(null);
//
///
//        SymbolCalc calc2 = new SymbolCalc();
//        Scanner scanner = new Scanner(System.in);
//        String expression = scanner.nextLine();
//        calc2.Calculate(expression);
//        TextCalc calc3 = new TextCalc();
//        expression = scanner.nextLine();
//        calc3.Calculate(expression);

        Scanner scanner = new Scanner(System.in);
        FlexibleCalculator calc = new FlexibleCalculator();

        System.out.println("Нажмите:\n 1 - Для ввода оператора символом. \n 2 - Для ввода оператора текстом.");
        String operator = scanner.nextLine();
        if (operator.equals("1")) {
            System.out.println("Введите выражение");
            String expression = scanner.nextLine();
            calc.CalculateSymbol(expression);
        }
        else if (operator.equals("2")){
            System.out.println("Введите выражение");
            String expression = scanner.nextLine();
            calc.CalculateText(expression);
        }
        else {
            System.out.println("Ошибка. Допустимы для ввода только следующие значения: '1, 2'");
        }




    }
}
