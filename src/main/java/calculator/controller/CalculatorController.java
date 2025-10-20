package calculator.controller;

import calculator.model.StringCalculator;
import calculator.view.View;

public class CalculatorController {
    private View view = new View();
    private StringCalculator stringCalculator = new StringCalculator();

    public void run() {
        try{
            String input = view.inputValue();
            int result = stringCalculator.calculate(input);
            view.outValue(result);
        }catch(IllegalArgumentException e) {
            view.printError(e.getMessage());
            return;
        }
    }
}