package day1;

import jdk.jshell.execution.JdiDefaultExecutionControl;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public record CalibrationInput(String input) {

    // extract digits into list and the extract the calibration value based on how many digits there are
    public int calculateCalibrationValue() {
        List<String> digits = extractDigits(input);

        System.out.println(digits);
        if (digits.size() == 0) {
            return 0;
        }

        String firstDigit = digits.get(0);
        String lastDigit = digits.get(digits.size() - 1);
        System.out.println(firstDigit + lastDigit);
        return Integer.parseInt(firstDigit + lastDigit);

    }

    private List<String> extractDigits(String inputString) {
        List<String> digits = Arrays.stream(inputString.replaceAll("[^0-9]", "")
                .split(""))
                .filter(s -> !s.isEmpty())
                .collect(Collectors.toList());
        return digits;
    }


}
