// a program to display message 'Hello World'
/*

 */
public class Human {
    private long id;

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
