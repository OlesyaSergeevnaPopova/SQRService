package ru.netology.sqr;

public class SQRService {
    int square(int minBorder, int maxBorder) {
        int counter = 0;
        for (int number = 10; number <= 99; number++) {
            int sqr_number = number * number;
            if ( sqr_number > maxBorder) {
                System.out.println(counter);
                break;
            }
            if (sqr_number >= minBorder) {
                //System.out.println(i*i);
                counter++;
            }
        }

        return counter;
    }
}
