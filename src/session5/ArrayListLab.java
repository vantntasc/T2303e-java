package session5;

import utils.Human;
import utils.NumberUtils;
import utils.StringUtils;

import java.util.*;
import java.util.stream.Collectors;

public class ArrayListLab {




    public static void main(String[] args) {
//            testAddArrayListPerform(10000000);
            testAddLinkedListPerform(10000000);
    }
    public static void testAddLinkedListPerform(int size){
        Random random = new Random();
        // list integer
        long startTime  = System.currentTimeMillis();
        LinkedList<Integer> numInts = new LinkedList<>();
        for (int i = 0; i < size ; i++) {
            numInts.add(random.nextInt());
        }
        System.err.println("Time add "+size+" element to list integer : " + (System.currentTimeMillis() - startTime) + "ms");
        startTime  = System.currentTimeMillis();
        LinkedList<Long>  numLongs = new LinkedList<>();
        for (int i = 0; i < size ; i++) {
            numLongs.add(random.nextLong());
        }
        System.err.println("Time add "+size+" element to list long : " + (System.currentTimeMillis() - startTime) + "ms");

        startTime  = System.currentTimeMillis();
        LinkedList<String>  numStrings = new LinkedList<>();
        for (int i = 0; i < size ; i++) {
            numStrings.add(StringUtils.randomAlphaNumeric(10));
        }
        System.err.println("Time add "+size+" element to list String : " + (System.currentTimeMillis() - startTime) + "ms");
        startTime  = System.currentTimeMillis();
        LinkedList<Student>  studens = new LinkedList<>();
        for (int i = 0; i < size ; i++) {
            studens.add(Student.randomStudent());
        }
        System.err.println("Time add "+size+" element to student String : " + (System.currentTimeMillis() - startTime) + "ms");
        /*
        * Todo  : Note  compare arrayList : linkedList
        *       dynamic array >< double linkedlist
        *       indexing (each element : data + index) >< each element  : node (data ,2 pointer before/ next element)
        *       add/remove : slow  ><  add / remove  : quick
        *       seach (by index , search random) : quick / slow
        *       linkedlist need memory
        *        usecase :  list >< linkedlist (arraylist , stack , queue).
        *  */




    }
    public static void testAddArrayListPerform(int size){
        Random random = new Random();
        // list integer
        long startTime  = System.currentTimeMillis();
        List<Integer>  numInts = new ArrayList<>();
        for (int i = 0; i < size ; i++) {
            numInts.add(random.nextInt());
        }
        System.err.println("Time add "+size+" element to list integer : " + (System.currentTimeMillis() - startTime) + "ms");
        startTime  = System.currentTimeMillis();
        List<Long>  numLongs = new ArrayList<>();
        for (int i = 0; i < size ; i++) {
            numLongs.add(random.nextLong());
        }
        System.err.println("Time add "+size+" element to list long : " + (System.currentTimeMillis() - startTime) + "ms");

        startTime  = System.currentTimeMillis();
        List<String>  numStrings = new ArrayList<>();
        for (int i = 0; i < size ; i++) {
            numStrings.add(StringUtils.randomAlphaNumeric(10));
        }
        System.err.println("Time add "+size+" element to list String : " + (System.currentTimeMillis() - startTime) + "ms");
        startTime  = System.currentTimeMillis();
        List<Student>  studens = new ArrayList<>();
        for (int i = 0; i < size ; i++) {
            studens.add(Student.randomStudent());
        }
        System.err.println("Time add "+size+" element to student String : " + (System.currentTimeMillis() - startTime) + "ms");

    }


}


// constructor ArrayList :
// init empty arraylist , capacity = 10
//        List<String>  strs = new ArrayList<>();
//        List<Human> humans = new ArrayList<>();
// init from collection
//        String[] str1 = {"1","2","3"};
//        List<String> str2 = new ArrayList<>(Arrays.asList(str1));
//        // init with capacity
//        List<Human> humans = new ArrayList<>(100);
//        // capacity  = 10 , size  = 10
//        // -> add new element , capacity increase 50%
//
//        /******************8 Arraylist method ***********************/
//        // add
//        humans.add(new Human());
//        humans.add(3, new Human());
//        humans.addAll(Arrays.asList(new Human() , new Human()));
//        //
//        humans.get(3);
//        Human h = new Human();
//        System.err.println(humans.indexOf(h));
//        // return -1 if not exits
//        humans.remove(2);
//        humans.clear();
//        Human h1 = new Human("John Doe" , 2);
//
//        Human h2 = new Human("Nguyen Van A" , 10);
//        List<Human> humans =  Arrays.asList(h1,h2);
//        // normal
//        for(Human h  : humans){
//            System.err.println(h);
//        }
//        for(int i = 0 ; i < humans.size() ; i++){
//            System.err.println(humans.get(i));
//        }
//        // from java 8 - lambda
//        humans.forEach(System.err::println);
//        // return list student from human
//
//        List<Student> students = new ArrayList<>();
//        for (Human h: humans) {
//            Student s = h.grow();
//            if(h != null){
//                students.add(s);
//            }
//        }
//        // syntax for lambda in java 8
//        List<Student> students1 = humans.stream().map(Human::grow)
//                .collect(Collectors.toList());