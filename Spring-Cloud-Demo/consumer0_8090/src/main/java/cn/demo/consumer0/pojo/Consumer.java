package cn.demo.consumer0.pojo;

/*********************************
 *
 * @作者 67582
 * @项目名 Spring-Cloud-Demo
 * @时间 2018/10/31 15:08
 *
 *********************************/
public class Consumer {
    private Long id;
    private String context;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    @Override
    public String toString() {
        return "Consumer{" +
                "id=" + id +
                ", context='" + context + '\'' +
                '}';
    }
}
