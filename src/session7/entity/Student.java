package session7.entity;

import session8.annotation.Table;
import utils.DateTimeUtils;

import java.util.Date;
@Table(table_name = "student_table", indexing = true , pattrioning = true)
public class Student {
    private long studentId;
    private String fullname;
    private String address;
    private String tel;
    private Date dateOfBirth;
    private Date enterDate;
    private Integer age;
    private Integer ageLevel;

    public Student(long studentId, String fullname, String address, String tel
            ,Date dateOfBirth,Date enterDate) {
        this.studentId = studentId;
        this.fullname = fullname;
        this.address = address;
        this.tel = tel;
        this.dateOfBirth = dateOfBirth;
        this.enterDate = enterDate;
//        if(this.dateOfBirth != null ){
//            int age  = DateTimeUtils.getAge(this.dateOfBirth);
//            this.age = age < 0 ? null : age;
//        }
//        if(this.enterDate != null ){
//            int age  = DateTimeUtils.getAge(this.enterDate);
//            this.ageLevel = age < 0 ? null : age;
//        }
    }

    public Integer getAge() {
        if (this.dateOfBirth != null) {
            int age = DateTimeUtils.getAge(this.dateOfBirth);
            return age < 0 ? null : age;
        }
        return null;
    }

    public Integer getAgeLevel() {
        if (this.enterDate != null) {
            int age = DateTimeUtils.getAge(this.enterDate);
            return age < 0 ? null : age;
        }
        return null;
    }

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
}
