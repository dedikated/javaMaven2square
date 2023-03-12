package ru.netology.sqr;

public class Main {
    public static void main(String[] args) {
        SQRService service = new SQRService();
        int x = service.calcSquares(0, 0);
        System.out.println(x);
    }
}