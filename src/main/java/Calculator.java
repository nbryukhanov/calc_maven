public class Calculator {

    public String add(int x, int y) {
        return "Ответ: " + (x + y);
    }

    public String substract(int x, int y) {
        return "Ответ: " + (x - y);
    }

    public String mult(int x, int y) {
        return "Ответ: " + (x * y);
    }
    public String div(int x, int y) throws ArithmeticException{
        if (y == 0){
            throw new ArithmeticException("Учи математику, не дели на ноль");
        } else {
            return "Ответ: " + ((float)x/(float)y);
        }
    }
}

//    public String div(int x, int y) {
//        try {
//            return "Ответ: " + ((float)x/(float)y);
//        } catch (Exception e) {
//            System.out.println("Учи математику, не дели на ноль");
//        }
//        return "Ответ: " + ((float) x / (float) y);
//    }


////    public String div(int x, int y) throws ArithmeticException{
////        String result;
////        try{
////            result = "Ответ: " + ((float)x/(float)y);
////        }
////        catch (ArithmeticException e){
////            throw new ArithmeticException("Учи математику, не дели на ноль");
////        }
////        return result;