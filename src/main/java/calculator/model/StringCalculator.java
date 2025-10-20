package calculator.model;

public class StringCalculator {

    public int calculate(String inputValue) {
        if(inputValue == null || inputValue.isBlank() ) {
            return 0;
        }
      
        String[] numbers = splitNumbers(inputValue);
        return sum(numbers);
    }

    private String[] splitNumbers(String inputValue) {
        inputValue = inputValue.replace("\\n", "\n");
        
        if(inputValue.startsWith("//")) {
            return splitWithCustomDelimiter(inputValue);
        }

        return splitWithDefaultDelimiter(inputValue);
    }
    
    private String[] splitWithDefaultDelimiter(String inputValue) {
        String defaultDelimiter = ",|:";
        // System.out.println(Arrays.toString(inputValue.split(defaultDelimiter)));
        return inputValue.split(defaultDelimiter);
    }
    
    private String[] splitWithCustomDelimiter(String inputValue) {
        int delimiterEndIdx = inputValue.indexOf("\n");
        String customDelimiter = inputValue.substring(2, delimiterEndIdx);
        String numbersPart = inputValue.substring(delimiterEndIdx + 1);

        return numbersPart.split(customDelimiter);
    }
    
    private int sum(String[] numbers) {
        int total = 0;
        for(String number : numbers) {
            total += Integer.parseInt(number);
            System.out.println(total);
        }
        return total;
    }
}
