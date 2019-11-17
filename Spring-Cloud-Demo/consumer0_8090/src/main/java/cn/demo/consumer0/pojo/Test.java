package cn.demo.consumer0.pojo;

/*********************************
 *
 * @作者 67582
 * @项目名 Spring-Cloud-Demo
 * @时间 2018/11/12 14:31
 *
 *********************************/
public class Test {
    private Integer id;
    private Integer demoId;
    private String demoContext;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDemoId() {
        return demoId;
    }

    public void setDemoId(Integer demoId) {
        this.demoId = demoId;
    }

    public String getDemoContext() {
        return demoContext;
    }

    public void setDemoContext(String demoContext) {
        this.demoContext = demoContext;
    }

    @Override
    public String toString() {
        return "Test{" +
                "id=" + id +
                ", demoId=" + demoId +
                ", demoContext='" + demoContext + '\'' +
                '}';
    }
}
