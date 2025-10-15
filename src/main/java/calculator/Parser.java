package calculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser {
    public int[] parseByDefaultSeparator(String input) {
        String[] textNumbers = input.split("[,:]");

        int[] numbers = new int[textNumbers.length];

        for(int i = 0; i < textNumbers.length; i++) {
            numbers[i] = Integer.parseInt(textNumbers[i]);
        }

        return numbers;
    }

    public int[] parseByCustomSeparator(String input) {
        Pattern pattern = Pattern.compile("^//(.)\n(.*)");
        Matcher matcher = pattern.matcher(input);

        if (matcher.find()) {
            String customSeparator = matcher.group(1);
            String numberSegment = matcher.group(2);


            String[] textNumbers = numberSegment.split(Pattern.quote(customSeparator));


            int[] numbers = new int[textNumbers.length];

            for(int i = 0; i < textNumbers.length; i++) {
                numbers[i] = Integer.parseInt(textNumbers[i]);
            }

            return numbers;
        }

        return parseByDefaultSeparator(input);
    }
}
