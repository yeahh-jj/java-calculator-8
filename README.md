# java-calculator-precourse
## 구현할 기능 목록
1. 사용자 입력 기능(View)
    - 입력값은 `camp.nextstep.edu.missionutils.Console`의 `readLine()`을 활용

2. 빈 문자열 처리(Model)
    - 입력값이 빈 문자열("")인 경우 결과값 `0`을 반환

3. 기본 구분자 처리(Model)
    - 쉼표(,), 콜론(:) 기준으로 숫자 분리

4. 커스텀 구분자 처리(Model)
    - 문자열 앞부분의 "//"와 "\n" 사이에 위치하는 문자를 커스텀 구분자로 사용

5. 숫자 합산 기능(Model)
    - 분리된 문자열을 숫자로 변환하여 모두 더한 값 반환

6. 예외 처리(Model)
    - 잘못된 입력값일 경우 `IllegalArgumentException` 발생시킨 후 종료

7. 결과 출력(View)
    - 계산 결과를 `결과 : [합계]` 형식으로 출력

---

## 프로젝트 구조 (MVC)

- **Application.java**  
  - 프로그램 시작점(Main), Controller 실행
- **controller/CalculatorController.java**  
  - 사용자 입력 처리 → 계산 → 결과 출력 흐름 제어
- **model/StringCalculator.java**  
  - 문자열 분석, 숫자 합산 로직 구현
  - 기본 구분자, 커스텀 구분자 처리, 예외 처리 담당
- **view/View.java**  
  - 사용자 입력/출력 담당
  - `inputValue()`로 입력 받고, `outValue()`로 결과 출력