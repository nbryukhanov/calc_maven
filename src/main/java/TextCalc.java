import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextCalc implements IStringCalculator {
    @Override
    public float Calculate(String expression) {
        Pattern pattern = Pattern.compile("([0-9]+)\\s*([\\w]{4,8})\\s*([0-9]+)");
        Matcher matcher = pattern.matcher(expression);
        if (matcher.find()) {
            switch (matcher.group(2)) {
                case "plus":
                    System.out.println("Ответ:" + (Integer.parseInt(matcher.group(1)) + Integer.parseInt(matcher.group(3))));
                    break;
                case "minus":
                    System.out.println("Ответ:" + (Integer.parseInt(matcher.group(1)) - Integer.parseInt(matcher.group(3))));
                    break;
                case "multiply":
                    System.out.println("Ответ:" + (Integer.parseInt(matcher.group(1)) * Integer.parseInt(matcher.group(3))));
                    break;
                case "divide":
                    System.out.println("Ответ:" + (Double.parseDouble(matcher.group(1)) / Integer.parseInt(matcher.group(3))));
                    break;
                default:
                    System.out.println("Введен неправильный оператор. Допустимы следующие значения: plus,minus,multiply,divide");
                    break;
            }
        }
        else {
            System.out.println("Что-то пошло не так");
        }
        return 0;
    }
}