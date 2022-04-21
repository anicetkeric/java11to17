package com.example.java11feature;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

enum Day { SUNDAY, MONDAY, TUESDAY,
    WEDNESDAY, THURSDAY, FRIDAY, SATURDAY; }

class SwitchExpressionTest {


    @Test
    void oldSwitchExpressionTest() {
        int day = oldSwitchExpression(Day.FRIDAY);
        assertThat(day).isEqualTo(6);
    }



    private int oldSwitchExpression(Day day) {
        int numLetters;
        switch (day) {
            case MONDAY:
            case FRIDAY:
            case SUNDAY:
                numLetters = 6;
                break;
            case TUESDAY:
                numLetters = 7;
                break;
            case THURSDAY:
            case SATURDAY:
                numLetters = 8;
                break;
            case WEDNESDAY:
                numLetters = 9;
                break;
            default:
                throw new IllegalStateException("Invalid day: " + day);
        }
        return numLetters;
    }


}
