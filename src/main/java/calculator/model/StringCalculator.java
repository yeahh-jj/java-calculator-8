package calculator.model;

public class StringCalculator {

    public int calculate(String inputValue) {
        if(inputValue == null || inputValue.isBlank() ) {
            return 0;
        }else {
            return calculateExpression(inputValue);
        }
    }

    private int calculateExpression(String inputValue) {
        int result = 1; // 임시
        return result;
    }
}
