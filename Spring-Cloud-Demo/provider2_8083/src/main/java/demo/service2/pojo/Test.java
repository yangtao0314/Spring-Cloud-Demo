package demo.service2.pojo;

public class Test {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column test.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column test.demo_id
     *
     * @mbggenerated
     */
    private Integer demoId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column test.demo_context
     *
     * @mbggenerated
     */
    private String demoContext;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column test.id
     *
     * @return the value of test.id
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column test.id
     *
     * @param id the value for test.id
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column test.demo_id
     *
     * @return the value of test.demo_id
     * @mbggenerated
     */
    public Integer getDemoId() {
        return demoId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column test.demo_id
     *
     * @param demoId the value for test.demo_id
     * @mbggenerated
     */
    public void setDemoId(Integer demoId) {
        this.demoId = demoId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column test.demo_context
     *
     * @return the value of test.demo_context
     * @mbggenerated
     */
    public String getDemoContext() {
        return demoContext;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column test.demo_context
     *
     * @param demoContext the value for test.demo_context
     * @mbggenerated
     */
    public void setDemoContext(String demoContext) {
        this.demoContext = demoContext == null ? null : demoContext.trim();
    }
}