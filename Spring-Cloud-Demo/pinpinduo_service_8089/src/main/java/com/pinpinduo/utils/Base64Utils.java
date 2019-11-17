package com.pinpinduo.utils;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import java.io.IOException;
import java.util.Arrays;
import java.util.Date;

/*********************************
 *
 * 处理流工具包
 *
 * @作者 67582
 * @项目名 Spring-Cloud-Demo
 * @时间 2019/3/21 17:16
 * @Version 1.0
 *********************************/
public class Base64Utils {

    /**
     * base64编码
     *
     * @param bstr
     * @return
     */
    public static String encode(byte[] bstr) {
        return new BASE64Encoder().encode(bstr);
    }

    /**
     * base64解码
     *
     * @param str
     * @return
     */
    public static byte[] decode(String str) {
        byte[] bt = null;
        try {
            BASE64Decoder decoder = new BASE64Decoder();
            bt = decoder.decodeBuffer(str);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bt;
    }


    /**
     * 排序
     *
     * @param data
     * @param sort rise、drop
     * @return
     */
    public static StringBuffer strSort(String data, String sort) {
        StringBuffer sb = new StringBuffer();
        if (data == null || data == "") {
            return null;
        } else {
            char[] val = data.toCharArray();
            if (val.length - 1 == 0) {
                sb.append(val);
            } else {
                Arrays.sort(val);
                if (sort.equals("rise")) {
                    sb.append(val);
                } else if (sort.equals("drop")) {
                    for (int i = 1; i <= val.length; i++) {
                        int j = val.length;
                        sb.append(val[j - i]);
                    }
                } else {
                    return null;
                }
            }
            return sb;
        }
    }

    /**
     * 处理时间戳
     *
     * @param except
     * @param delay
     * @return
     */
    public static StringBuffer getTimeSS(int except, int delay) {
        long t = new Date().getTime() / except;
        long add_t = t + delay;
        return new StringBuffer().append(add_t);
    }
}
