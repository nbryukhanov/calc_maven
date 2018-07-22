import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SymbolCalc implements IStringCalculator {
    @Override
    public float Calculate(String expression) {
        Pattern pattern = Pattern.compile("([0-9]+)\\s*(.)\\s*([0-9]+)");
        Matcher matcher = pattern.matcher(expression);
        if (matcher.find()) {
            switch (matcher.group(2)) {
                case "+":
                    System.out.println("Ответ:" + (Integer.parseInt(matcher.group(1)) + Integer.parseInt(matcher.group(3))));
                    break;
                case "-":
                    System.out.println("Ответ:" + (Integer.parseInt(matcher.group(1)) - Integer.parseInt(matcher.group(3))));
                    break;
                case "*":
                    System.out.println("Ответ:" + (Integer.parseInt(matcher.group(1)) * Integer.parseInt(matcher.group(3))));
                    break;
                case "/":
                    System.out.println("Ответ:" + (Double.parseDouble(matcher.group(1)) / Integer.parseInt(matcher.group(3))));
                    break;
                default:
                    System.out.println("Введен неправильный оператор. Допустимы следующие значения: +,-,*,/");
                    break;
            }
        }
        else {
            System.out.println("Что-то пошло не так");
        }
        return 0;
    }
}