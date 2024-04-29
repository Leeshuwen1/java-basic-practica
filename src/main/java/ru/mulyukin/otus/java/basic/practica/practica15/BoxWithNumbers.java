package ru.mulyukin.otus.java.basic.practica.practica15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BoxWithNumbers<N extends Number> {
    private List<N> numbers;

    public BoxWithNumbers(N... numbers) {
        this.numbers = new ArrayList<>(Arrays.asList(numbers));
    }

    public double average() {
        double result = 0.0;
        for (int i = 0; i < numbers.size(); i++) {
            result += numbers.get(i).doubleValue();
        }
        return result / numbers.size();
    }

    public boolean sameAverage(BoxWithNumbers<?> another) {
        return Math.abs(this.average() - another.average()) < 0.0001;
    }
}
