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
            number = number.trim();
            
            if(number.isBlank()) {
                throw new IllegalArgumentException("빈 값이 포함되어 있습니다.");
            }

            int value;
            try{
                value = Integer.parseInt(number);
            }catch(NumberFormatException e) {
                throw new IllegalArgumentException("숫자가 아닌 값이 포함되어 있습니다. (" + number +")");
            }

            if(value < 0) {
                throw new IllegalArgumentException("음수가 포함되어 있습니다.");
            }

            total += value;
        }

        return total;
    }
}
