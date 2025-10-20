package calculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser {
    public int[] parseBySeparator(String input){
        Pattern pattern = Pattern.compile("^//(.)\\\\n(.*)");
        Matcher matcher = pattern.matcher(input);

        String[] textNumbers;
        if (matcher.find()) {
            String customSeparator = matcher.group(1);
            String numberSegment = matcher.group(2);

            textNumbers = numberSegment.split(Pattern.quote(customSeparator));
        }else{
            textNumbers = input.split("[,:]");
        }

        if (!isNumberic(textNumbers)) {
            throw new IllegalArgumentException("입력값에 숫자가 아닌 문자가 포함되어 있습니다.");
        }

        int[] numbers = new int[textNumbers.length];

        for(int i = 0; i < textNumbers.length; i++) {
            numbers[i] = Integer.parseInt(textNumbers[i]);
        }

        if(!isPositive(numbers)) {
            throw new IllegalArgumentException("입력값에 양수가 아닌 숫자가 포함되어 있습니다.");
        }

        return numbers;
    }

    private boolean isNumberic(String[] numbers) {
        for(String number:numbers){
            int numberLength = number.length();
            for(int i=0;i<numberLength;i++){
                if(!Character.isDigit(number.charAt(i))){
                    return false;
                }
            }
        }

        return true;
    }

    private boolean isPositive(int[] numbers) {
        for(int number:numbers){
            if(number<=0){
                return false;
            }
        }

        return true;
    }
}