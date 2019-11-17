package demo.car_base.entity;

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
 * @since 2018-11-26
 */
public class CarBase implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("Id")
    private String Id;

    @TableField("CarPlateNum")
    private String CarPlateNum;

    @TableField("CarPlateColor")
    private String CarPlateColor;

    @TableField("CompanyId")
    private String CompanyId;

    @TableField("CarBrand")
    private Integer CarBrand;

    @TableField("CarType")
    private Integer CarType;

    @TableField("CarColor")
    private Integer CarColor;

    @TableField("PersonCount")
    private Integer PersonCount;

    @TableField("DisPlaceMent")
    private Integer DisPlaceMent;

    @TableField("FactoryTime")
    private LocalDate FactoryTime;

    @TableField("Organization")
    private Integer Organization;

    @TableField("Fuel")
    private Integer Fuel;

    @TableField("Power")
    private Integer Power;

    @TableField("CarStatus")
    private Integer CarStatus;

    @TableField("CarCurState")
    private Integer CarCurState;

    @TableField("IsDelete")
    private Boolean IsDelete;

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getCarPlateNum() {
        return CarPlateNum;
    }

    public void setCarPlateNum(String CarPlateNum) {
        this.CarPlateNum = CarPlateNum;
    }

    public String getCarPlateColor() {
        return CarPlateColor;
    }

    public void setCarPlateColor(String CarPlateColor) {
        this.CarPlateColor = CarPlateColor;
    }

    public String getCompanyId() {
        return CompanyId;
    }

    public void setCompanyId(String CompanyId) {
        this.CompanyId = CompanyId;
    }

    public Integer getCarBrand() {
        return CarBrand;
    }

    public void setCarBrand(Integer CarBrand) {
        this.CarBrand = CarBrand;
    }

    public Integer getCarType() {
        return CarType;
    }

    public void setCarType(Integer CarType) {
        this.CarType = CarType;
    }

    public Integer getCarColor() {
        return CarColor;
    }

    public void setCarColor(Integer CarColor) {
        this.CarColor = CarColor;
    }

    public Integer getPersonCount() {
        return PersonCount;
    }

    public void setPersonCount(Integer PersonCount) {
        this.PersonCount = PersonCount;
    }

    public Integer getDisPlaceMent() {
        return DisPlaceMent;
    }

    public void setDisPlaceMent(Integer DisPlaceMent) {
        this.DisPlaceMent = DisPlaceMent;
    }

    public LocalDate getFactoryTime() {
        return FactoryTime;
    }

    public void setFactoryTime(LocalDate FactoryTime) {
        this.FactoryTime = FactoryTime;
    }

    public Integer getOrganization() {
        return Organization;
    }

    public void setOrganization(Integer Organization) {
        this.Organization = Organization;
    }

    public Integer getFuel() {
        return Fuel;
    }

    public void setFuel(Integer Fuel) {
        this.Fuel = Fuel;
    }

    public Integer getPower() {
        return Power;
    }

    public void setPower(Integer Power) {
        this.Power = Power;
    }

    public Integer getCarStatus() {
        return CarStatus;
    }

    public void setCarStatus(Integer CarStatus) {
        this.CarStatus = CarStatus;
    }

    public Integer getCarCurState() {
        return CarCurState;
    }

    public void setCarCurState(Integer CarCurState) {
        this.CarCurState = CarCurState;
    }

    public Boolean getIsDelete() {
        return IsDelete;
    }

    public void setIsDelete(Boolean IsDelete) {
        this.IsDelete = IsDelete;
    }

    @Override
    public String toString() {
        return "CarBase{" +
                "Id=" + Id +
                ", CarPlateNum=" + CarPlateNum +
                ", CarPlateColor=" + CarPlateColor +
                ", CompanyId=" + CompanyId +
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
                ", IsDelete=" + IsDelete +
                "}";
    }
}
