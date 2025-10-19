package calculator.controller;

import calculator.view.View;

public class CalculatorController {
    private View view = new View();

    public void run() {
        String input = view.inputValue();
    }
}
