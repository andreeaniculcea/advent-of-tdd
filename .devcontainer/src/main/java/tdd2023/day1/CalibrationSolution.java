package day1;

import java.util.List;

public record CalibrationSolution(List<CalibrationInput> inputs) {

    public int getCalibrationSum() {
        return inputs.stream()
                .map(CalibrationInput::calculateCalibrationValue)
                .reduce(0, Integer::sum);
    }
}
