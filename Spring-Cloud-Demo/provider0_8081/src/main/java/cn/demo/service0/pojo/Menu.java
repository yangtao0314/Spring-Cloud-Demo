package cn.demo.service0.pojo;

public class Menu {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column menu.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column menu.context
     *
     * @mbggenerated
     */
    private String context;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column menu.id
     *
     * @return the value of menu.id
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column menu.id
     *
     * @param id the value for menu.id
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column menu.context
     *
     * @return the value of menu.context
     * @mbggenerated
     */
    public String getContext() {
        return context;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column menu.context
     *
     * @param context the value for menu.context
     * @mbggenerated
     */
    public void setContext(String context) {
        this.context = context == null ? null : context.trim();
    }
}