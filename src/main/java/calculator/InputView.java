package calculator;

import camp.nextstep.edu.missionutils.Console;

public class InputView {
    public String inputStringForSum(){
        System.out.println("덧셈할 문자열을 입력해 주세요.");

        String strForSum = Console.readLine();

        Console.close();

        return strForSum;
    }
}
