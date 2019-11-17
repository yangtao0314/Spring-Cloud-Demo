/*********************************
 * @作者 67582
 * @项目名 Spring-Cloud-Demo
 * @时间 2019/9/17 12:22
 * @Version 1.0
 *********************************/
public class Demo {
    public static void main(String[] args) {
//        Integer a = new Integer(5);
//        Integer b = new Integer(5);
//
//        Integer c = 5;
//        Integer d = 5;
//
//        Integer e = 128;
//        Integer f = 128;
//
//        int g = 128;
//
//        System.out.println(a == b);
//        System.out.println(b == c);
//        System.out.println(c == d);
//        System.out.println(e == f);
//        System.out.println(f == g);
        String str = "https:\\/\\/bili.meijuzuida.com\\/20191005\\/21589_a7877f17\\/index.m3u8zuidam3u8";
        int con = str.indexOf(".m3u8");
        String str1 = str.substring(0, con + 5);
        System.out.println(str1);
    }
}
