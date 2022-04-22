package com.example.java17feature;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PatternMatchingTest {

    @Test
    void textPatternMatching() {
        Rectangle rectangle = new Rectangle(2, 2);
        double perimeter = PatternMatching.getPerimeter(rectangle);
        System.out.println(perimeter);
        assertThat(perimeter).isEqualTo(8);
    }
}