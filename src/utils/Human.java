package utils;

import session5.Student;

// a program to display message 'Hello World'
/*

 */
public class Human {
    public long id;

    static String schoolName  = "FPT-APTECH";
    // attributes
    private  String name;
    int age;
    String address;
    String email;
    String tel;
    double  weight;

    public Human() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public static String getSchoolName() {
        return schoolName;
    }

    public static void setSchoolName(String schoolName) {
        Human.schoolName = schoolName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // convert human  -> student
    public Student grow(){
        Student s = null;
        if(this.age >= 3){
            s = new Student();
            s.setName(this.name);
            s.setAge(this.age);
        }
        return s;
    }

    public Human(String name){
        this.name = name;
    }

    public Human(String name, int age, String address, String email, String tel, double weight) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.email = email;
        this.tel = tel;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayHi(){
        String level = "" ;
        if(0 <= age && age < 3){
            level = "trẻ sơ sinh";
        } else if( 3 <= age && age < 5 ){
            level = "mẫu giáo";
        } else if( 6 <= age && age < 10 ){
            level = "cấp 1 ";
        } else if( 11 <= age && age < 14  ){
            level = "cấp 2";
        }else if( 15 <= age && age < 17  ){
            level = "cấp 3";
        }else if( 17 < age ){
            level = "đã tốt nghiệp thpt";
        }
        System.out.println(String.format("Hi , my name's %s " +
                        ", %s , and live in %s ",
                this.name,
                level,
                this.address
        ));
    }
    public  static void main(String[] args){



    }
}
