package designpattern.singleton.lab2;

import session5.Student;
import utils.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Test {
    private static final int NUM_ELEMENTS = 50000000;
    public static void main(String[] args) {
      processInSinPattern();
      processInNotSinPattern();
    }
     static void processInSinPattern(){
        long startTime  = System.currentTimeMillis();
        for (int i = 0 ; i < NUM_ELEMENTS ; i++){
            String newStudentName = StringUtils.randomAlphaNumeric(20);
            StudentLs.addStudent(Arrays.asList(newStudentName));
        }
        for(int i = 0 ; i < 100 ; i++){
            int limit  = 100;
            List<String> studentNameBatch = StudentLs.getBatchStudent(i*limit , limit);
            studentNameBatch.forEach(System.err::println);
        }
        System.err.println("Time process  in  singleton= "+(System.currentTimeMillis() - startTime) / 1000  + "s");
    }
    static void processInNotSinPattern(){
        long startTime  = System.currentTimeMillis();
        List<String> studentNames = new ArrayList<>();
        for (int i = 0 ; i < NUM_ELEMENTS ; i++){
            String newStudentName = StringUtils.randomAlphaNumeric(20);
            studentNames.add(newStudentName);
        }
        for(int i = 0 ; i < 100 ; i++){
            int limit  = 100;
            List<String> studentNameBatch = StringUtils.getBatchStudent(studentNames,i*limit , limit);
            studentNameBatch.forEach(System.err::println);
        }
        System.err.println("Time process in not singleton = "+(System.currentTimeMillis() - startTime) / 1000  + "s");
    }
}
