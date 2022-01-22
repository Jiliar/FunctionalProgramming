package f_exercises.functional_interfaces;

import java.util.List;

@FunctionalInterface
public interface IAverage {
    double calculate(List<Integer> values);
}
