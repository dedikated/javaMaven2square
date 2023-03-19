package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class SQRServiceTest {
    @Test
    public void calcSquare1() {
        SQRService service = new SQRService();
        int min = 200;
        int max = 300;
        int expected = 3;
        int actual = service.calcSquares(min,max);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calcSquare2() {
        SQRService service = new SQRService();

        int min = 400;
        int max = 700;
        int expected = 7;
        int actual = service.calcSquares(min,max);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calcSquare3(){
        SQRService service = new SQRService();
            int min = 500;
            int max = 600;
            int expected = 2;
            int actual = service.calcSquares(min,max);

            Assertions.assertEquals(expected, actual);}
}
