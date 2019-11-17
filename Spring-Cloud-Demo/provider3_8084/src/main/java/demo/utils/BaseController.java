package demo.utils;

public class BaseController {
    public class RequestJson {
        private Integer code;
        private String msg;
        private Object pageMenu;
        private Long milliseconds;
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

        public Object getPageMenu() {
            return pageMenu;
        }

        public void setPageMenu(Object pageMenu) {
            this.pageMenu = pageMenu;
        }

        public Long getMilliseconds() {
            return milliseconds;
        }

        public void setMilliseconds(Long milliseconds) {
            this.milliseconds = milliseconds;
        }

        public Integer getInfoCount() {
            return infoCount;
        }

        public void setInfoCount(Integer infoCount) {
            this.infoCount = infoCount;
        }

        public RequestJson() {
        }

        public RequestJson(Integer _code, String _msg, Object _pageMenu, Long _milliseconds, Integer _infoCount) {
            this.code = _code;
            this.msg = _msg;
            this.pageMenu = _pageMenu;
            this.milliseconds = _milliseconds;
            this.infoCount = _infoCount;
        }
    }
}
