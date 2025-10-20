package calculator.model;

import java.util.Arrays;

public class StringCalculator {

    public int calculate(String inputValue) {
        if(inputValue == null || inputValue.isBlank() ) {
            return 0;
        }
      
        String[] numbers = splitWithDefaultDelimiter(inputValue);
        return sum(numbers);
    }

    private int sum(String[] numbers) {
        int total = 0;
        return total;
    }

    public String[] splitWithDefaultDelimiter(String inputValue) {
        String defaultDelimiter = ",|:";
        // System.out.println(Arrays.toString(inputValue.split(defaultDelimiter)));
        return inputValue.split(defaultDelimiter);
    }

}
