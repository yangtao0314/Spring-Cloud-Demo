package demo.sysuser.entity;

import java.time.LocalDate;

import com.baomidou.mybatisplus.annotation.TableId;

import java.time.LocalDateTime;

import com.baomidou.mybatisplus.annotation.TableField;

import java.io.Serializable;

/**
 * <p>
 *
 * </p>
 *
 * @author yangtao
 * @since 2018-11-22
 */
public class SysUser implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 自增Id
     */
    @TableId("Id")
    private String Id;

    /**
     * 账号
     */
    @TableField("UserName")
    private String UserName;

    /**
     * 密码
     */
    @TableField("Password")
    private String Password;

    /**
     * 真实姓名
     */
    @TableField("RealName")
    private String RealName;

    /**
     * 单位编号
     */
    @TableField("DepId")
    private String DepId;

    /**
     * 角色ID
     */
    @TableField("RoleId")
    private Integer RoleId;

    /**
     * 性别(1:男0:女)
     */
    @TableField("UserSex")
    private Integer UserSex;

    /**
     * 电子邮箱
     */
    @TableField("Email")
    private String Email;

    /**
     * 手机号码
     */
    @TableField("Mobile")
    private String Mobile;

    /**
     * 办公电话
     */
    @TableField("Phone")
    private String Phone;

    /**
     * 出生日期
     */
    @TableField("BirthDate")
    private LocalDate BirthDate;

    /**
     * 账号创建者
     */
    @TableField("CreateUser")
    private String CreateUser;

    /**
     * 创建时间
     */
    @TableField("CreateTime")
    private LocalDateTime CreateTime;

    /**
     * 最后修改用户者
     */
    @TableField("UpdateUser")
    private String UpdateUser;

    /**
     * 最后修改用户时间
     */
    @TableField("UpdateTime")
    private LocalDateTime UpdateTime;

    /**
     * 用户类型(0:主管厅长1:主管处长2:申请员3:省级管理员4:市县级管理员9:超管)
     */
    @TableField("UserType")
    private Integer UserType;

    /**
     * 微信唯一标识
     */
    @TableField("OpenId")
    private String OpenId;

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getRealName() {
        return RealName;
    }

    public void setRealName(String RealName) {
        this.RealName = RealName;
    }

    public String getDepId() {
        return DepId;
    }

    public void setDepId(String DepId) {
        this.DepId = DepId;
    }

    public Integer getRoleId() {
        return RoleId;
    }

    public void setRoleId(Integer RoleId) {
        this.RoleId = RoleId;
    }

    public Integer getUserSex() {
        return UserSex;
    }

    public void setUserSex(Integer UserSex) {
        this.UserSex = UserSex;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getMobile() {
        return Mobile;
    }

    public void setMobile(String Mobile) {
        this.Mobile = Mobile;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public LocalDate getBirthDate() {
        return BirthDate;
    }

    public void setBirthDate(LocalDate BirthDate) {
        this.BirthDate = BirthDate;
    }

    public String getCreateUser() {
        return CreateUser;
    }

    public void setCreateUser(String CreateUser) {
        this.CreateUser = CreateUser;
    }

    public LocalDateTime getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(LocalDateTime CreateTime) {
        this.CreateTime = CreateTime;
    }

    public String getUpdateUser() {
        return UpdateUser;
    }

    public void setUpdateUser(String UpdateUser) {
        this.UpdateUser = UpdateUser;
    }

    public LocalDateTime getUpdateTime() {
        return UpdateTime;
    }

    public void setUpdateTime(LocalDateTime UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public Integer getUserType() {
        return UserType;
    }

    public void setUserType(Integer UserType) {
        this.UserType = UserType;
    }

    public String getOpenId() {
        return OpenId;
    }

    public void setOpenId(String OpenId) {
        this.OpenId = OpenId;
    }

    @Override
    public String toString() {
        return "SysUser{" +
                "Id=" + Id +
                ", UserName=" + UserName +
                ", Password=" + Password +
                ", RealName=" + RealName +
                ", DepId=" + DepId +
                ", RoleId=" + RoleId +
                ", UserSex=" + UserSex +
                ", Email=" + Email +
                ", Mobile=" + Mobile +
                ", Phone=" + Phone +
                ", BirthDate=" + BirthDate +
                ", CreateUser=" + CreateUser +
                ", CreateTime=" + CreateTime +
                ", UpdateUser=" + UpdateUser +
                ", UpdateTime=" + UpdateTime +
                ", UserType=" + UserType +
                ", OpenId=" + OpenId +
                "}";
    }
}
