package session5;

public class StringLab {
    public static void main(String[] args) {
//        String a = "a"; // immutable object only getter , note setter
//        a = "b"; // recreate object a
        // StringBuilder + StringBuffer : mutable object
        String a = "a";
        String b = "a";
        if(a == b){ // compare reference : tham chiếu
            System.err.println("a == b"); // because StringPool
        }
//        if(a.equals(b)){ // compare value : tham trị
//
//        }

    }
}
