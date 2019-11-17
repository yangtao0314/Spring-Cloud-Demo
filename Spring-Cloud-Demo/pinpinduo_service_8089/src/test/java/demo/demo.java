package demo;

import com.pinpinduo.utils.Base64Utils;
import com.pinpinduo.utils.EncryptUtils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;


/*********************************
 * @作者 67582
 * @项目名 Spring-Cloud-Demo
 * @时间 2019/3/21 2:28
 * @Version 1.0
 *********************************/
public class demo {

    public static void main(String[] args) {
//        String xx = "eyJhY3RpdmF0aW9uIjpmYWxzZSwiYWRkVGltZSI6IjIwMTktMDMtMjEgMDE6MDQ6NTQiLCJlZGl0VGltZSI6IjIwMTktMDMtMjEgMDE6MDQ6NTYiLCJlbWFpbCI6IjY3NTgyMTIxNUBxcS5jb20iLCJpZCI6ImFhYWFhYWFhYSIsImxvZ2lubmFtZSI6Inlhbmd0YW8iLCJvbmxpbmVUaW1lIjoiMjAxOS0wMy0yMSAwMTowNDo1OCIsInBhc3N3b3JkIjoiMTIzNDU2IiwicGhvbmUiOjE1NjMyMDEzMjN9";
//        String xx = "eyJjb2RlIjozMDAsImluZm9Db3VudCI6MSwibXNnIjoi6K+35rGC5oiQ5Yqf77yBIiwicmVzcG9u\n" +
//                "c2VfdGltZSI6MTU1MzMzOTcwNTUyM30=";
//        Base64Utils d = new Base64Utils();
//        String aa = new String(d.decode(xx));
//        System.out.println(aa);

//        SimpleDateFormat st = new SimpleDateFormat("yyyyMMddHHmmss");
//        String time = st.format(new Date());
//        System.out.println(time);
//
        EncryptUtils encryptUtils = new EncryptUtils();
//        String md5 = encryptUtils.MD5Encode("yangtao", "");
//        System.out.println("md5----->" + md5);

        String sha1 = encryptUtils.SHA1Encode(null, "654321");
        System.out.println("sha1----->" + sha1);

//        String test = "a363941b1a26a3e442d0ee791667c4c4ffd3447d";
//        System.out.println(test.length());

//        long i = new Date().getTime() / 1000;
//        long b = i + 5;
//        String result = b + "";
//        System.out.println(i);
//        System.out.println(result.getClass().getName());
    }
}
