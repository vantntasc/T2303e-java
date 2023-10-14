package session6;
import  static  session6.Employee.*;
import  static  session6.Employee.CLASS_NAME;

public class StaticLab1 {
    public void func1(){
//        MessageService messageService = new EmailService();
//        messageService.sendMessage("" , "");
        ExcelUtils excelUtils = new ExcelUtils() {
            @Override
            String getLine() {
                return "new line in runtime";
            }
        };
        excelUtils.insertLineToFile(excelUtils.getLine());
    }
}
