package designpattern.singleton.lab2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StudentLs {
    private static List<String> students ; // very large

    public static  List<String> getBatchStudent(int offset , int limit){
        if(students == null){
            students = new ArrayList<>();
        }
        return  students.stream().skip(offset).limit(limit).collect(Collectors.toList());
    }

    public static List<String> getBatchStudentNameStartByChar(int offset , int limit , String startChar){
        if(students == null){
            students = new ArrayList<>();
        }
        return  students.stream().filter(item -> item.startsWith(startChar)).skip(offset)
                .limit(limit).collect(Collectors.toList());
    }
    public static  void  addStudent(List<String> moreStudents){
        if(students == null){
            students = new ArrayList<>();
        }
        students.addAll(moreStudents);
    }




}
