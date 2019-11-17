package demo.carbase.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 *
 * </p>
 *
 * @author yangtao
 * @since 2018-11-22
 */
public class CarBase implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 自增Id
     */
    @TableId("Id")
    private String Id;

    /**
     * 车牌类型
     */
    @TableField("CarPlateType")
    private String CarPlateType;

    /**
     * 车牌号
     */
    @TableField("CarPlateNum")
    private String CarPlateNum;

    /**
     * 所属单位
     */
    @TableField("DepId")
    private String DepId;

    /**
     * 汽车品牌
     */
    @TableField("CarBrand")
    private Integer CarBrand;

    /**
     * 车辆类型
     */
    @TableField("CarType")
    private Integer CarType;

    /**
     * 车辆颜色
     */
    @TableField("CarColor")
    private Integer CarColor;

    /**
     * 核定人数
     */
    @TableField("PersonCount")
    private Integer PersonCount;

    /**
     * 排量(ml)
     */
    @TableField("DisPlaceMent")
    private Integer DisPlaceMent;

    /**
     * 出厂时间
     */
    @TableField("FactoryTime")
    private LocalDateTime FactoryTime;

    /**
     * 编制属性
     */
    @TableField("Organization")
    private Integer Organization;

    /**
     * 燃料种类
     */
    @TableField("Fuel")
    private Integer Fuel;

    /**
     * 功率
     */
    @TableField("Power")
    private Integer Power;

    /**
     * 车辆状态(0:待提交1待审核2已审核3已驳回)
     */
    @TableField("CarStatus")
    private Integer CarStatus;

    /**
     * 车辆现状(0:在库1:派出2:保养维修3:封存,4:被选中)
     */
    @TableField("CarCurState")
    private Integer CarCurState;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getCarPlateType() {
        return CarPlateType;
    }

    public void setCarPlateType(String carPlateType) {
        CarPlateType = carPlateType;
    }

    public String getCarPlateNum() {
        return CarPlateNum;
    }

    public void setCarPlateNum(String carPlateNum) {
        CarPlateNum = carPlateNum;
    }

    public String getDepId() {
        return DepId;
    }

    public void setDepId(String depId) {
        DepId = depId;
    }

    public Integer getCarBrand() {
        return CarBrand;
    }

    public void setCarBrand(Integer carBrand) {
        CarBrand = carBrand;
    }

    public Integer getCarType() {
        return CarType;
    }

    public void setCarType(Integer carType) {
        CarType = carType;
    }

    public Integer getCarColor() {
        return CarColor;
    }

    public void setCarColor(Integer carColor) {
        CarColor = carColor;
    }

    public Integer getPersonCount() {
        return PersonCount;
    }

    public void setPersonCount(Integer personCount) {
        PersonCount = personCount;
    }

    public Integer getDisPlaceMent() {
        return DisPlaceMent;
    }

    public void setDisPlaceMent(Integer disPlaceMent) {
        DisPlaceMent = disPlaceMent;
    }

    public LocalDateTime getFactoryTime() {
        return FactoryTime;
    }

    public void setFactoryTime(LocalDateTime factoryTime) {
        FactoryTime = factoryTime;
    }

    public Integer getOrganization() {
        return Organization;
    }

    public void setOrganization(Integer organization) {
        Organization = organization;
    }

    public Integer getFuel() {
        return Fuel;
    }

    public void setFuel(Integer fuel) {
        Fuel = fuel;
    }

    public Integer getPower() {
        return Power;
    }

    public void setPower(Integer power) {
        Power = power;
    }

    public Integer getCarStatus() {
        return CarStatus;
    }

    public void setCarStatus(Integer carStatus) {
        CarStatus = carStatus;
    }

    public Integer getCarCurState() {
        return CarCurState;
    }

    public void setCarCurState(Integer carCurState) {
        CarCurState = carCurState;
    }

    @Override
    public String toString() {
        return "CarBase{" +
                "Id='" + Id + '\'' +
                ", CarPlateType='" + CarPlateType + '\'' +
                ", CarPlateNum='" + CarPlateNum + '\'' +
                ", DepId='" + DepId + '\'' +
                ", CarBrand=" + CarBrand +
                ", CarType=" + CarType +
                ", CarColor=" + CarColor +
                ", PersonCount=" + PersonCount +
                ", DisPlaceMent=" + DisPlaceMent +
                ", FactoryTime=" + FactoryTime +
                ", Organization=" + Organization +
                ", Fuel=" + Fuel +
                ", Power=" + Power +
                ", CarStatus=" + CarStatus +
                ", CarCurState=" + CarCurState +
                '}';
    }
}
