package ru.netology.sqr;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(value = {"'positive test',200,300,3", "'negative test',300,400,2"})
    void square(String testName, int minBorder, int maxBorder, int expected) {
        SQRService service = new SQRService();

        int actual = service.square(minBorder, maxBorder);

        assertEquals(expected, actual);
    }
}