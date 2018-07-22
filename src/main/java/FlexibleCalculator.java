public class FlexibleCalculator {

    public void CalculateSymbol(String expression) {
        SymbolCalc flex = new SymbolCalc();
        flex.Calculate(expression);
    }

    public void CalculateText(String expression) {
        TextCalc flex2 = new TextCalc();
        flex2.Calculate(expression);
    }
}

