public class Calculator {

    public int add(int x, int y) {
        return (x + y);
    }

    public int substract(int x, int y) {
        return (x - y);
    }

    public int mult(int x, int y) {
        return (x * y);
    }

    public double div(int x, int y) throws ArithmeticException {
        if (y == 0) {
            throw new ArithmeticException("Учи математику, не дели на ноль");
        } else {
            return ((double)x / y);
        }
    }
}










//        double result;
//        try {
//            result = (x/y);
//        } catch (ArithmeticException e) {
//            throw new ArithmeticException("Учи математику, не дели на ноль");
//        }
//        return result;
//    }
//}




//


////    public String div(int x, int y) throws ArithmeticException{
////        String result;
////        try{
////            result = "Ответ: " + ((float)x/(float)y);
////        }
////        catch (ArithmeticException e){
////            throw new ArithmeticException("Учи математику, не дели на ноль");
////        }
////        return result;

//public String div(int x, int y) throws ArithmeticException{
//        if (y == 0){
//        throw new ArithmeticException("Учи математику, не дели на ноль");
//        } else {
//        return "Ответ: " + ((float)x/y);
//        }

//    public void div(int x, int y) {
////        try {
////            System.out.println("Ответ: " + (x/y));
////        } catch (Exception e) {
////            System.out.println("Учи математику, не дели на ноль");
////        }
////    }