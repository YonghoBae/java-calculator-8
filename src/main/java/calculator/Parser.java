package calculator;

public class Parser {
    public int[] parseByDefaultSeparator(String input) {
        String[] textNumbers = input.split("[,:]");

        int[] numbers = new int[textNumbers.length];

        for(int i = 0; i < textNumbers.length; i++) {
            numbers[i] = Integer.parseInt(textNumbers[i]);
        }

        return numbers;
    }
}
