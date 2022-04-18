package com.example.java17feature;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

enum Day { SUNDAY, MONDAY, TUESDAY,
    WEDNESDAY, THURSDAY, FRIDAY, SATURDAY; }

class SwitchExpressionTest {


    @Test
    void newSwitchExpressionTest() {
        int day = newSwitchExpression(Day.FRIDAY);
        assertThat(day).isEqualTo(6);
    }
    @Test
    void oldStyleWithYieldTest() {
        int day = oldStyleWithYield(Day.WEDNESDAY);
        assertThat(day).isEqualTo(9);
    }



    private int newSwitchExpression(Day day) {
        return switch (day) {
            case MONDAY, FRIDAY, SUNDAY -> 6;
            case TUESDAY -> 7;
            case THURSDAY, SATURDAY -> 8;
            case WEDNESDAY -> 9;
        };
    }

    private int oldStyleWithYield(Day day) {
        return switch (day) {
            case MONDAY:
            case FRIDAY:
            case SUNDAY:
                yield 6;
            case TUESDAY:
                yield 7;
            case THURSDAY:
            case SATURDAY:
                yield 8;
            case WEDNESDAY:
                yield 9;
        };
    }

    private void newSwitchExpressionWithYield(Day day) {
        int numLetters = switch (day) {
            case MONDAY, FRIDAY, SUNDAY -> {
                System.out.println("MONDAY, FRIDAY and SUNDAY ");
                yield 6;
            }
            case TUESDAY -> {
                System.out.println("TUESDAY");
                yield 7;
            }
            case THURSDAY, SATURDAY -> {
                System.out.println("THURSDAY and SATURDAY");
                yield 8;
            }
            case WEDNESDAY -> {
                System.out.println("WEDNESDAY");
                yield 9;
            }
        };
    }
}
