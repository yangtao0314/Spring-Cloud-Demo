package com.pinpinduo.module_user.controller;

import com.pinpinduo.utils.Base64Utils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

/*********************************
 * @作者 67582
 * @项目名 Spring-Cloud-Demo
 * @时间 2019/3/21 15:53
 * @Version 1.0
 *********************************/
public class BaseController {

    public BaseController() {
        super();
    }

    // 加密前缀
    private String encode_q;
    // 加密后缀
    private String encode_h;
    // 获取当前时间戳
    private Long timestamp;

    public String getEncode_q() {
        return encode_q;
    }

    public void setEncode_q(String encode) {
        encode.substring(0, 21);
        this.encode_q = encode;
    }

    public String getEncode_h() {
        return encode_h;
    }

    public void setEncode_h(String encode) {
        encode.substring(22, 43);
        this.encode_h = encode;
    }

    public Long getTimestamp() {
        timestamp = new Date().getTime();
        return timestamp;
    }

    // 返回页面内容
    public String getResult(String data, String encode) {
        StringBuffer buffer = new StringBuffer();
        setEncode_q(encode);
        setEncode_h(encode);
        buffer.append(getEncode_q());
        buffer.append(Base64Utils.encode(data.getBytes()));
        buffer.append(getEncode_h());
        return buffer.toString();
    }

    /**
     * 返回类型
     */
    public class respJson {
        private Integer code;
        private String msg;
        private Object result;
        private Long response_time;
        private Integer infoCount;

        public Integer getCode() {
            return code;
        }

        public void setCode(Integer code) {
            this.code = code;
        }

        public String getMsg() {
            return msg;
        }

        public void setMsg(String msg) {
            this.msg = msg;
        }

        public Object getResult() {
            return result;
        }

        public void setResult(Object result) {
            this.result = result;
        }

        public Long getResponse_time() {
            return response_time;
        }

        public void setResponse_time(Long response_time) {
            this.response_time = response_time;
        }

        public Integer getInfoCount() {
            return infoCount;
        }

        public void setInfoCount(Integer infoCount) {
            this.infoCount = infoCount;
        }

        @Override
        public String toString() {
            return "respJson{" +
                    "code=" + code +
                    ", msg='" + msg + '\'' +
                    ", result=" + result +
                    ", response_time=" + response_time +
                    ", infoCount=" + infoCount +
                    '}';
        }

        public respJson(Integer code, String msg, Object result, Long response_time, Integer infoCount) {
            this.code = code;
            this.msg = msg;
            this.result = result;
            this.response_time = response_time;
            this.infoCount = infoCount;
        }
    }
}
