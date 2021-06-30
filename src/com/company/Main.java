package com.company;

public class Main {

    public static void main(String[] args) {
        int number = 0;

        for (int i = 1; i<=50; i++) {
            number=i;
            if (i % 3 != 0 && i % 7 != 0) {
                System.out.println(number);
            }else if (i % 3 == 0 && i % 7 == 0) {
                System.out.println("FizzBuzz");
            }else if (i % 3 ==0) {
                System.out.println("Fizz");
            }else if (i % 7 == 0) {
                System.out.println("Buzz");
            }
        }
    }
}
