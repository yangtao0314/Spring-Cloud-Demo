package demo.cardriver.entity;

import java.time.LocalDate;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;

import java.io.Serializable;

/**
 * <p>
 *
 * </p>
 *
 * @author yangtao
 * @since 2018-11-23
 */
public class CarDriver implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 自增Id
     */
    @TableId("Id")
    private String Id;

    /**
     * 驾驶员姓名
     */
    @TableField("DriverName")
    private String DriverName;

    /**
     * 所属部门Id
     */
    @TableField("DepId")
    private String DepId;

    /**
     * 性别(0:女1:男)
     */
    @TableField("DriverSex")
    private Integer DriverSex;

    /**
     * 出生日期
     */
    @TableField("DriverBirth")
    private LocalDate DriverBirth;

    /**
     * 入职日期
     */
    @TableField("DriverWorkDate")
    private LocalDate DriverWorkDate;

    /**
     * 初次领证日期
     */
    @TableField("DriverInitDate")
    private LocalDate DriverInitDate;

    /**
     * 政治面貌(0:群众1:党员2:团员3:民主党派)
     */
    @TableField("DriverPolity")
    private Integer DriverPolity;

    /**
     * 健康状况(0:良好1:不良)
     */
    @TableField("DriverHealth")
    private Integer DriverHealth;

    /**
     * 手机号码
     */
    @TableField("DriverMobile")
    private String DriverMobile;

    /**
     * 办公电话
     */
    @TableField("DriverPhone")
    private String DriverPhone;

    /**
     * 民族
     */
    @TableField("DriverPeople")
    private String DriverPeople;

    /**
     * 是否在编(0:编外1:在编)
     */
    @TableField("DriverInseries")
    private Integer DriverInseries;

    /**
     * 驾驶员状态(0:正常1:病休2:事假3:值班4:其他5:出车6:被选中)
     */
    @TableField("DriverState")
    private Integer DriverState;

    /**
     * 驾驶证号码
     */
    @TableField("DriverCard")
    private String DriverCard;

    /**
     * 准驾类型
     */
    @TableField("DriverAllow")
    private Integer DriverAllow;

    /**
     * 驾驶证到期日期
     */
    @TableField("DriverExpire")
    private LocalDate DriverExpire;

    /**
     * 驾驶员照片
     */
    @TableField("DriverPhoto")
    private String DriverPhoto;

    /**
     * 驾驶照片
     */
    @TableField("DriverCardImg")
    private String DriverCardImg;

    /**
     * 身份证正面
     */
    @TableField("PeopleCardImgF")
    private String PeopleCardImgF;

    /**
     * 身份证背面
     */
    @TableField("PeopleCardImgB")
    private String PeopleCardImgB;

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getDriverName() {
        return DriverName;
    }

    public void setDriverName(String DriverName) {
        this.DriverName = DriverName;
    }

    public String getDepId() {
        return DepId;
    }

    public void setDepId(String DepId) {
        this.DepId = DepId;
    }

    public Integer getDriverSex() {
        return DriverSex;
    }

    public void setDriverSex(Integer DriverSex) {
        this.DriverSex = DriverSex;
    }

    public LocalDate getDriverBirth() {
        return DriverBirth;
    }

    public void setDriverBirth(LocalDate DriverBirth) {
        this.DriverBirth = DriverBirth;
    }

    public LocalDate getDriverWorkDate() {
        return DriverWorkDate;
    }

    public void setDriverWorkDate(LocalDate DriverWorkDate) {
        this.DriverWorkDate = DriverWorkDate;
    }

    public LocalDate getDriverInitDate() {
        return DriverInitDate;
    }

    public void setDriverInitDate(LocalDate DriverInitDate) {
        this.DriverInitDate = DriverInitDate;
    }

    public Integer getDriverPolity() {
        return DriverPolity;
    }

    public void setDriverPolity(Integer DriverPolity) {
        this.DriverPolity = DriverPolity;
    }

    public Integer getDriverHealth() {
        return DriverHealth;
    }

    public void setDriverHealth(Integer DriverHealth) {
        this.DriverHealth = DriverHealth;
    }

    public String getDriverMobile() {
        return DriverMobile;
    }

    public void setDriverMobile(String DriverMobile) {
        this.DriverMobile = DriverMobile;
    }

    public String getDriverPhone() {
        return DriverPhone;
    }

    public void setDriverPhone(String DriverPhone) {
        this.DriverPhone = DriverPhone;
    }

    public String getDriverPeople() {
        return DriverPeople;
    }

    public void setDriverPeople(String DriverPeople) {
        this.DriverPeople = DriverPeople;
    }

    public Integer getDriverInseries() {
        return DriverInseries;
    }

    public void setDriverInseries(Integer DriverInseries) {
        this.DriverInseries = DriverInseries;
    }

    public Integer getDriverState() {
        return DriverState;
    }

    public void setDriverState(Integer DriverState) {
        this.DriverState = DriverState;
    }

    public String getDriverCard() {
        return DriverCard;
    }

    public void setDriverCard(String DriverCard) {
        this.DriverCard = DriverCard;
    }

    public Integer getDriverAllow() {
        return DriverAllow;
    }

    public void setDriverAllow(Integer DriverAllow) {
        this.DriverAllow = DriverAllow;
    }

    public LocalDate getDriverExpire() {
        return DriverExpire;
    }

    public void setDriverExpire(LocalDate DriverExpire) {
        this.DriverExpire = DriverExpire;
    }

    public String getDriverPhoto() {
        return DriverPhoto;
    }

    public void setDriverPhoto(String DriverPhoto) {
        this.DriverPhoto = DriverPhoto;
    }

    public String getDriverCardImg() {
        return DriverCardImg;
    }

    public void setDriverCardImg(String DriverCardImg) {
        this.DriverCardImg = DriverCardImg;
    }

    public String getPeopleCardImgF() {
        return PeopleCardImgF;
    }

    public void setPeopleCardImgF(String PeopleCardImgF) {
        this.PeopleCardImgF = PeopleCardImgF;
    }

    public String getPeopleCardImgB() {
        return PeopleCardImgB;
    }

    public void setPeopleCardImgB(String PeopleCardImgB) {
        this.PeopleCardImgB = PeopleCardImgB;
    }

    @Override
    public String toString() {
        return "CarDriver{" +
                "Id=" + Id +
                ", DriverName=" + DriverName +
                ", DepId=" + DepId +
                ", DriverSex=" + DriverSex +
                ", DriverBirth=" + DriverBirth +
                ", DriverWorkDate=" + DriverWorkDate +
                ", DriverInitDate=" + DriverInitDate +
                ", DriverPolity=" + DriverPolity +
                ", DriverHealth=" + DriverHealth +
                ", DriverMobile=" + DriverMobile +
                ", DriverPhone=" + DriverPhone +
                ", DriverPeople=" + DriverPeople +
                ", DriverInseries=" + DriverInseries +
                ", DriverState=" + DriverState +
                ", DriverCard=" + DriverCard +
                ", DriverAllow=" + DriverAllow +
                ", DriverExpire=" + DriverExpire +
                ", DriverPhoto=" + DriverPhoto +
                ", DriverCardImg=" + DriverCardImg +
                ", PeopleCardImgF=" + PeopleCardImgF +
                ", PeopleCardImgB=" + PeopleCardImgB +
                "}";
    }
}
