package session7.entity;

public class Student {
    private long studentId;
    private String fullname;
    private String address;
    private String tel;

    public Student(long studentId, String fullname, String address, String tel) {
        this.studentId = studentId;
        this.fullname = fullname;
        this.address = address;
        this.tel = tel;
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
