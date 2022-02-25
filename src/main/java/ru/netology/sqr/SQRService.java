package ru.netology.sqr;

public class SQRService {
    int square(int minBorder, int maxBorder) {
        int counter = 0;
        for (int number = 10; number <= 99; number++) {
            if (number * number >= maxBorder) {
                System.out.println(counter);
                break;
            }
            if (number * number > minBorder) {
                //System.out.println(i*i);
                counter++;
            }
        }

        return counter;
    }
}
