package session7.exception;

import session5.Student;

public class ExceptionDemo {
    public  static void doSomething(){
        doSomething();
    }
    public static void main(String[] args)   {
        try {
            Student.checkAge(13);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Student.checkAge(18);
//        try {
//            // code có thể ném ra ngoại lệ
//            String a  = "dsdgdsg";
//            int num  = Integer.parseInt(a);
//            System.err.println(num);
//            Student s = null;
//            System.err.println(s.getName());
//        } catch (NumberFormatException e ){
//            // code xử lý ngoại lệ
//            System.err.println("Error " + e.getMessage());
//            System.exit(1);
//        } catch (NullPointerException e){
//            System.err.println("Error " + e.getMessage());
//        } catch (Exception e){
//            System.err.println("Error " + e.getMessage());
//        }finally {
//            // code in here always run
//            System.err.println("demo");
//        }

        // try catch finnaly
    }
}
