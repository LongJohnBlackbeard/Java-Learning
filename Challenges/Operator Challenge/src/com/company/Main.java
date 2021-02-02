package com.company;

public class Main {

    public static void main(String[] args) {


        double firstVariable = 20.00d;
        double secondVariable = 80.00d;
        double sumVariable = (firstVariable + secondVariable) * 100.00d;
        System.out.println("sumVariable = " + sumVariable);
        double remainderVariable = sumVariable % 40.00d;
        System.out.println("remainderVariable = " + remainderVariable);
        boolean boolVariable = (remainderVariable == 0) ? true : false;
        System.out.println("Output of boolean variable is " + boolVariable);

        if (!boolVariable) {
            System.out.println("Got some remainder");
        }



    }
}
