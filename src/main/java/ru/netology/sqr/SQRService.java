package ru.netology.sqr;

public class SQRService {
    public int calcSquares(int min, int max) {
        int x = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= min & i * i <= max){
                x++;
            }
        }
        return x;
    }
}
