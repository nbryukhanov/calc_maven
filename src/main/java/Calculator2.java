import java.util.Scanner;

public class Calculator2 extends Calculator {
    public void main(String[] args) {
        boolean run = false;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите первое число");
            int fn = scanner.nextInt();
            System.out.println("Введите знак");
            String operator = scanner.next();
            System.out.println("Введите второе число");
            int sn = scanner.nextInt();
            switch (operator){
                case "+":
                    System.out.println("Ответ:" + (fn + sn));
                    break;
                case "-":
                    System.out.println("Ответ:" + (fn - sn));
                    break;
                case "*":
                    System.out.println("Ответ:" + (fn * sn));
                    break;
                case "/":
                    System.out.println("Ответ:" + (fn / sn));
                    break;
            }
            System.out.println("Продолжить? Да/Нет");
            String again = scanner.next();
            if (again.equalsIgnoreCase("Да") || again.equalsIgnoreCase("Lf")){
                run = true;
            } else {
                run = false;
            }
        } while (run);
    }
}
