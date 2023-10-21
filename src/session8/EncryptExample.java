package session8;

import java.util.Base64;
import java.util.UUID;

public class EncryptExample {
    public static void main(String[] args) {
        basicBase64();
    }
    private static void basicBase64(){
//        String myLove = "John Doe";
        StringBuilder myLoveBuilder = new StringBuilder();
        for(int i = 0 ; i <= 15 ; i++){
            myLoveBuilder.append(UUID.randomUUID().toString());
        }
        String myLove = myLoveBuilder.toString();
        System.err.println("raw string : "+ myLove);
        String myLoveEncoded = Base64.getMimeEncoder().encodeToString(myLove.getBytes());
        System.err.println("encode String : " + myLoveEncoded);
        byte[] decodeStrs = Base64.getMimeDecoder().decode(myLoveEncoded);
        String decodeStr = new String(decodeStrs);
        System.err.println("raw String : " + decodeStr);
        String myLoveEncodeNoPadd = Base64.getEncoder().withoutPadding().encodeToString(myLove.getBytes());
        System.err.println("encode no padding String : " + myLoveEncodeNoPadd);
    }
    private static void urlBase64(){
        String url  = "https://vnexpress.net/thu-tuong-netanyahu-israel-dang-trong-thoi-khac-den-toi-nhat-4666852.html";
        String encodeUrl = Base64.getUrlEncoder().encodeToString(url.getBytes());
        System.err.println("encodeUrl : "+ encodeUrl);
        byte[] decodeBytes = Base64.getUrlDecoder().decode(encodeUrl);
        String rawUrl = new String(decodeBytes);
        System.err.println("rawUrl : "+ rawUrl);
    }

}
