package session5;

import utils.ConsoleUtils;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Lab6 {
    public static void main(String[] args) {
        System.out.println("Please enter m : ");
        int m = ConsoleUtils.getInt(Integer.valueOf(0),  null );
        System.out.println("Please enter n : ");
        int n = ConsoleUtils.getInt(Integer.valueOf(0),  null );
        int[] a = new int[n+m];
        int[] b  = new int[n];
        System.err.println("Enter array a");
       for(int i  =  0  ; i < m ; i++){
           System.out.println(String.format("a[%d] = %d", i, a[i]));
           System.out.println("Enter a element number = "+(i+1));
           a[i] = ConsoleUtils.getInt();
       }
        Arrays.sort(a);
        System.err.println("Enter array b");
        for(int i  =  0  ; i < n ; i++){
            System.out.println(String.format("b[%d] = %d", i, b[i]));
            System.out.println("Enter b element number = "+(i+1));
            b[i] = ConsoleUtils.getInt();
        }
        Arrays.sort(b);
        for(int  i = 0; i < n  ; i ++){
            a[0] = b[i];
            Arrays.sort(a);
        }
        System.err.println("Sorted ang merged array : ");
        for (int  i  = 0 ; i < a.length; i ++){
            System.out.println(a[i]);
        }
        System.err.println(Arrays.toString(a)); // convert array to string
        // search value in array (must be sorted)
        int index  = Arrays.binarySearch(a ,20);
        if(index  < 0){
            // not have result
        } else {
          // have result
        }
        Arrays.fill(a,1); // asign all a element  -> 1
//        List<Integer> lsArray  = Arrays.asList(a);
        // array two dimension
        int[][] arr2 = new int[4][4];
    }
}

