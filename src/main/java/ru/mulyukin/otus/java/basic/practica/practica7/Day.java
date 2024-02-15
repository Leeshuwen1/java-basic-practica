package ru.mulyukin.otus.java.basic.practica.practica7;

import java.util.Arrays;
import java.util.Objects;

public class Day {
    public int dayOfTheWeak;

    String[] days = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};

    public Day(int dayOfTheWeak) {
        this.dayOfTheWeak = dayOfTheWeak;
    }

    public int getDayOfTheWeak() {
        return dayOfTheWeak;
    }

    public void setDayOfTheWeak(int dayOfTheWeak) {
        this.dayOfTheWeak = dayOfTheWeak;
    }
    public String getDayStr(){
        return days[dayOfTheWeak];
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Day day = (Day) o;
        return dayOfTheWeak == day.dayOfTheWeak && Arrays.equals(days, day.days);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(dayOfTheWeak);
        result = 31 * result + Arrays.hashCode(days);
        return result;
    }
}
