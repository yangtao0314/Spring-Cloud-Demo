package com.pinpinduo.utils;

import org.apache.tomcat.util.codec.binary.Base64;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/*********************************
 *
 * 加密工具包
 *
 * @作者 67582
 * @项目名 Spring-Cloud-Demo
 * @时间 2019/3/21 17:14
 * @Version 1.0
 *********************************/
public class EncryptUtils {

    private static final String[] hexDigits = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f"};

    private static final String HMAC_SHA1_ALGORITHM = "HmacSHA256";

    private static String bytesToHexString(byte[] b) {
        StringBuffer resultSb = new StringBuffer();
        for (int i = 0; i < b.length; i++) {
            int n = b[i];
            if (n < 0) {
                n += 256;
            }
            int d1 = n / 16;
            int d2 = n % 16;
            resultSb.append(hexDigits[d1] + hexDigits[d2]);
        }
        return resultSb.toString();
    }

    /**
     * MD5加密
     *
     * @param origin
     * @param charsetname
     * @return
     */
    public static String MD5Encode(String origin, String charsetname) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            if ((charsetname == null) || ("".equals(charsetname))) {
                return bytesToHexString(md.digest(origin.getBytes()));
            } else {
                return bytesToHexString(md.digest(origin.getBytes(charsetname)));
            }
        } catch (Exception localException) {
        }
        return null;
    }

    /**
     * HmacSHA1加密
     *
     * @param data
     * @param key
     * @return
     */
    public static String SHA1Encode(String data, String key) {
        byte[] result = null;
        try {
            //根据给定的字节数组构造一个密钥,第二参数指定一个密钥算法的名称
            SecretKeySpec signinKey = new SecretKeySpec(key.getBytes(), HMAC_SHA1_ALGORITHM);
            //生成一个指定 Mac 算法 的 Mac 对象
            Mac mac = Mac.getInstance(HMAC_SHA1_ALGORITHM);
            //用给定密钥初始化 Mac 对象
            mac.init(signinKey);
            //完成 Mac 操作
            if (data == null) {
                data = "";
            }
            byte[] rawHmac = mac.doFinal(data.getBytes());
            result = Base64.encodeBase64(rawHmac);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (InvalidKeyException e) {
            e.printStackTrace();
        }
        if (null != result) {
            return new String(result);
        } else {
            return null;
        }
    }
}