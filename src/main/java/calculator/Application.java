package calculator;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        InputView inputView = new InputView();
        Parser parser = new Parser();
        Calculator calculator = new Calculator();
        OutputView outputView = new OutputView();

        CalculatorController controller = new CalculatorController(
                inputView,
                calculator,
                parser,
                outputView
        );

        controller.run();
    }
}
