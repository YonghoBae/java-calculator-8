package calculator;

public class CalculatorController {
    private final InputView inputView;
    private final Calculator calculator;
    private final Parser parser;
    private final OutputView outputView;

    public CalculatorController(InputView inputView, Calculator calculator, Parser parser, OutputView outputView) {
        this.inputView = inputView;
        this.calculator = calculator;
        this.parser = parser;
        this.outputView = outputView;
    }

    public void run() {
        try{
            String input = inputView.inputStringForSum();

            int[] numbers = parser.parseBySeparator(input);

            int sum = calculator.add(numbers);

            outputView.print(sum);
        }catch(IllegalArgumentException e){
            outputView.printError(e.getMessage());
            throw e;
        }
    }
}
