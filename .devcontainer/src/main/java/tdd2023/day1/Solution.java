package day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Solution {

    public static void main(String[] args) {
        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        InputStreamReader streamReader = new InputStreamReader(Objects.requireNonNull(classloader.getResourceAsStream("day1-input.txt")),
                StandardCharsets.UTF_8);
        BufferedReader reader = new BufferedReader(streamReader);

        List<CalibrationInput> inputs = new ArrayList<>();
        try {
            for (String line; (line = reader.readLine()) != null; ) {
                inputs.add(new CalibrationInput(line));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        CalibrationSolution calibrationSolution = new CalibrationSolution(inputs);
        System.out.println(calibrationSolution.getCalibrationSum());

    }
}
