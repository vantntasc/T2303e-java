package utils;

public class NumberUtils {
    public static int getMinValue(int a , int b){
//        if(a < b ) {
//            return a;
//        }else {
//            return b;
//        }
        return a < b ? a : b;
    }
    public static int findUCLN(int a , int b){ // a >= b
        int temp;
        while (b != 0){
            temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}
