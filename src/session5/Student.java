package session5;

import session7.exception.InvalidAgeException;
import utils.Human;
import utils.NumberUtils;
import utils.StringUtils;

import java.util.Objects;

public class Student {
    private int age;
    private String name;

//    public  int compareTo(Student s1){
//        return this.name.compareTo(s1.name);
//    }

    public static Student randomStudent() {
        Student s = new Student();
        s.name = StringUtils.randomAlphaNumeric(30);
        s.age = NumberUtils.randomNumber(1 , 150);
        return s;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static  void checkAge( int age) {
        try {
            if (age < 18) {
                throw new InvalidAgeException("Not enough 18 .....");
            } else {
                System.err.println("Wellcome ....");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(age, name);
//    }
}
