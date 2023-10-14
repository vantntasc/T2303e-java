package session6;

public class StaticLab {
    // static belong class  , not instance
    // user static   for variable , method, block , class
    // variable
    public static int num = 2 ;
    public static int getNum(){
        return num;
    }

    // block static
    // use  for  : create , or change static valiable value
    static {
        num = 1;
    }
    static {
        num = 3;
    }

    public static void main(String[] args) {
        System.err.println(num);
        Employee.UserInfo userInfo = new Employee.UserInfo();
    }

}
