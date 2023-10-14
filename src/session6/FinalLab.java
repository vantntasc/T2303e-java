package session6;

public class FinalLab {
    // final  use for variable  , function , class .
    // final variable  : cannot asign value after first-time
    // final function : connot override by sub-class
    public static final String  CONST = "CONST_VALUE";
    public final void func1(){
//        FinalLab lab = new FinalLab();
//        lab.str = "demo";
        final String str;
        System.err.println(DayInWeek.MONSDAY);
        str = "";
    }
}
