package session4;

public class AccessModifierDemo {
    public static  String publicVariable;
    static  String defaultVariable;
    protected static  String protectedVariable;
    private static  String privateVariable;

    private void privateFunction(){
        System.err.println(privateVariable);
    }
}
