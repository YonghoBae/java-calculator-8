package calculator;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        Parser parser = new Parser();
        Calculator calculator = new Calculator();

        int[] numbers = parser.parseByDefaultSeparator("1,2:3");
        int sum = calculator.add(numbers);

        System.out.println(sum);
    }
}
