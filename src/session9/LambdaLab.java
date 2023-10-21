package session9;

import session5.Student;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class LambdaLab {
    public static void main(String[] args) {
        labStream1();
    }
    static void lab1(){
        // print list String
        List<String> languages = Arrays.asList("Java", "C#" , "Python", "C++");
        System.out.println("List languages : ");
        for (String lang: languages) {
            System.out.println(lang);
        }
        // print with lambda
        languages.forEach( lang -> System.out.println(lang));
        languages.forEach(System.err::println);
    }
    static void lab2(){
        List<String> languages = Arrays.asList("Java", "C#" , "Python", "C++", "1312");
        // sort
        // code sort list String by comparator in java
        // https://www.geeksforgeeks.org/comparator-interface-java/
//        Collections.sort(languages, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.compareTo(o2);
//            }
//        });
//        for (String lang: languages) {
//            System.out.println(lang);
//        }
        Collections.sort(languages , (String o1 , String o2) -> o1.compareTo(o2));
        Collections.sort(languages , String::compareTo);
        languages.forEach(System.err::println);

        List<Student> students = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            students.add(new Student());
        }
//        Collections.sort(languages , (Student s1 , Student s2) -> s1.compareTo(s2));
    }

    // Stream api java8

    static void labStream1(){
//        // lọc số chẵn của dãy số .
        List<Integer> nums  = Arrays.asList(34,53453,6,63,232,6,34,5);
////        List<Integer> results = new ArrayList<>();
////        for(Integer  num : nums){
////            if(num  % 2 == 0) results.add(num);
////        }
//        // đếm số các số chẵn của dãy số
//        int count  = 0;
//        for(Integer  num : nums){
//            if(num  % 2 == 0) count++;
//        }
//        long result = nums.stream().filter(num -> num % 2 == 0).count();
        ///
        IntStream.range(1,4).forEach(System.err::println); // 1 ,2 ,3
        IntStream.of(1,3,4).forEach(System.err::println);
        DoubleStream.of(1,3,4).forEach(System.err::println);
        LongStream.range(1,4).forEach(System.err::println);
        LongStream.of(1,3,4).forEach(System.err::println);
        // filter
        int num1 = nums.stream().filter(num -> num % 2 == 0).findAny().orElse(0);
        int num2 = nums.stream().filter(num -> num % 2 == 0).findFirst().orElse(0);
        System.err.println("num1 : " + num1);
        System.err.println("num2 : " + num2);

        Optional<Integer>  num3 = nums.stream().filter(num -> num % 2 == 0).findAny();
        if(num3.isPresent()){  // result of filter have value , not null
            System.err.println("num 3 : "+ num3.get() );
        }

//        34,53453,6,63,232,6,34,5  : get list from that list : begin index 2 , 2 .
        List<Integer> nums1 = nums.stream().skip(2).limit(2).collect(Collectors.toList());

        List<Integer> nums2 = new ArrayList<>();
        int offset = 2;
        int limit = 2;
        for (int i = 0; i < nums.size(); i++) {
            if(i >= offset && i <= offset + limit ){
                nums2.add(nums.get(i));
            }
        }
        nums1.forEach(System.err::println);

        List<Student> students = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            students.add(new Student());
        }
        List<String> studentNames = null;
        for (Student s : students){
            studentNames.add(s.getName());
        }
        studentNames = students.stream().map(Student::getName).collect(Collectors.toList());

    }
}
