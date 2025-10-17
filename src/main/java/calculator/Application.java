package calculator;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        InputView inputView = new InputView();
        Parser parser = new Parser();
        Calculator calculator = new Calculator();
        OutputView outputView = new OutputView();

        String input = inputView.inputStringForSum();

        int[] numbers = parser.parseByCustomSeparator(input);

        int sum = calculator.add(numbers);

        outputView.print(sum);
    }
}
