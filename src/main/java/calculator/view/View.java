package calculator.view;

import camp.nextstep.edu.missionutils.Console;

public class View {

    public String inputValue() {
        System.out.println("문자열을 입력해주세요.");
        return Console.readLine();
    }

    public void outValue(int result) {
        System.out.println("결과 : " + result);
    }

    public void printError(String message) {
        System.out.println("입력 오류 :" + message);
    }
}
