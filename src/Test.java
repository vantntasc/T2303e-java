import java.lang.reflect.Array;

public class Test {
   public static void main(String[] args){

//     int x = 0;  // primitive , default  = 0
//     Integer y = null; // object wrapper class , default  = null , nullable
//       System.err.println(x);
//       System.err.println(y);
//     // wrapper class
//       int num1  = 1;
//       Integer num2 = Integer.valueOf(num1); // chủ động ép kiểu
//       Integer num3 = num1;  // autoBoxing
//       int num4 = num3;  // unBoxing .
//       Integer x = 1 ;
//       Integer y = 1 ;
//       System.err.println(x.equals(y) ? "x == y" : "x != y");

// Char
//       char  a = 'a'; // primitive
//       Character b = null; // wrapper
//       System.err.println("tab\tchar\b,\n...");
 // String
        String a  = "a"; // create value "a" in string pool , variable a refer "a" in string pool
        String b  = "a"; // check "a" exits string pool ?
       // if exist , variable b refer "a" , if not create new location in string pool
//       System.err.println(a==b);  // tham chiếu  ? , String pool , not always .
//       System.err.println(a.equals(b));
//       System.err.println(a.equalsIgnoreCase(b));
//       String text = "123242,243434,25423532,3253535";
//       // msisdns : Array (colletion same data type , cấp phát tĩnh != cấp phát động)
//       String[] msisdns = text.split(",");
//       System.out.println("danh bạ sđt : ");
//       for (String msisdn  : msisdns){
//           System.out.println(msisdn);
//       }
         Animal myDog = new Dog("messi", 80.2, 30.5);
         System.err.println(myDog.getInfoMessage());
        myDog.move();
        myDog.makeNoise();






   }

}
