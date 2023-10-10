package session4;

import utils.ConsoleUtils;
import utils.NumberUtils;

public class Lab1 {
    public static void main(String[] args){
        System.out.println("Please enter a : ");  // unit test
        int a = ConsoleUtils.getInt(0 , null);
        System.out.println("Please enter b : ");
        int b = ConsoleUtils.getInt();
        // sollution1
        int UCLN = 0;
        for (int i = 1; i <= NumberUtils.getMinValue(a, b); i++) {
            if (a % i == 0 && b % i == 0) {
                // i  : UC
                UCLN = i;
            }
        }
        System.out.println(String.format("UCLN of %d and %d is  %d", a, b, UCLN));

    }
}
