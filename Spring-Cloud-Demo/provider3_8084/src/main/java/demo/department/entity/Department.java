package demo.department.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * <p>
 * <p>
 * </p>
 *
 * @author yangtao
 * @since 2018-11-22
 */
public class Department implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 生成uuid
     */
    @TableId("Id")
    private String Id;

    /**
     * 单位名称
     */
    @TableField("DepName")
    private String DepName;

    /**
     * 单位地址
     */
    @TableField("DepAddress")
    private String DepAddress;

    /**
     * 单位性质(1:行政2:参公3:社团4:国企5:事业6:私企999:其它)
     */
    @TableField("DepType")
    private Integer DepType;

    /**
     * 单位级别(0:省级1:厅级2:副厅级3:处级4:副处级5:科级6:副科级7:副省级)
     */
    @TableField("DepLevel")
    private Integer DepLevel;

    /**
     * 人员编制数
     */
    @TableField("NumberAll")
    private Integer NumberAll;

    /**
     * 人员实有数
     */
    @TableField("NumberTrue")
    private Integer NumberTrue;

    /**
     * 领导值数
     */
    @TableField("NumberLeader")
    private Integer NumberLeader;

    /**
     * 处级领导干部值数
     */
    @TableField("NumberLeaderChu")
    private Integer NumberLeaderChu;

    /**
     * 车辆编制数
     */
    @TableField("CarNumberAll")
    private Integer CarNumberAll;

    /**
     * 车辆实有数
     */
    @TableField("CarNumberTrue")
    private Integer CarNumberTrue;

    /**
     * 组织机构代码证
     */
    @TableField("ImgOrg")
    private String ImgOrg;

    /**
     * 车辆编制审批表
     */
    @TableField("ImgCheck")
    private String ImgCheck;

    /**
     * 三定方案
     */
    @TableField("ImgThree")
    private String ImgThree;

    /**
     * 组织Id
     */
    @TableField("OrgId")
    private String OrgId;

    /**
     * 组织父级Id
     */
    @TableField("OrgParent")
    private String OrgParent;

    /**
     * 组织类型(P:平台)
     */
    @TableField("OrgType")
    private String OrgType;

    /**
     * 索引
     */
    @TableField("OrderCode")
    private Integer OrderCode;

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getDepName() {
        return DepName;
    }

    public void setDepName(String DepName) {
        this.DepName = DepName;
    }

    public String getDepAddress() {
        return DepAddress;
    }

    public void setDepAddress(String DepAddress) {
        this.DepAddress = DepAddress;
    }

    public Integer getDepType() {
        return DepType;
    }

    public void setDepType(Integer DepType) {
        this.DepType = DepType;
    }

    public Integer getDepLevel() {
        return DepLevel;
    }

    public void setDepLevel(Integer DepLevel) {
        this.DepLevel = DepLevel;
    }

    public Integer getNumberAll() {
        return NumberAll;
    }

    public void setNumberAll(Integer NumberAll) {
        this.NumberAll = NumberAll;
    }

    public Integer getNumberTrue() {
        return NumberTrue;
    }

    public void setNumberTrue(Integer NumberTrue) {
        this.NumberTrue = NumberTrue;
    }

    public Integer getNumberLeader() {
        return NumberLeader;
    }

    public void setNumberLeader(Integer NumberLeader) {
        this.NumberLeader = NumberLeader;
    }

    public Integer getNumberLeaderChu() {
        return NumberLeaderChu;
    }

    public void setNumberLeaderChu(Integer NumberLeaderChu) {
        this.NumberLeaderChu = NumberLeaderChu;
    }

    public Integer getCarNumberAll() {
        return CarNumberAll;
    }

    public void setCarNumberAll(Integer CarNumberAll) {
        this.CarNumberAll = CarNumberAll;
    }

    public Integer getCarNumberTrue() {
        return CarNumberTrue;
    }

    public void setCarNumberTrue(Integer CarNumberTrue) {
        this.CarNumberTrue = CarNumberTrue;
    }

    public String getImgOrg() {
        return ImgOrg;
    }

    public void setImgOrg(String ImgOrg) {
        this.ImgOrg = ImgOrg;
    }

    public String getImgCheck() {
        return ImgCheck;
    }

    public void setImgCheck(String ImgCheck) {
        this.ImgCheck = ImgCheck;
    }

    public String getImgThree() {
        return ImgThree;
    }

    public void setImgThree(String ImgThree) {
        this.ImgThree = ImgThree;
    }

    public String getOrgId() {
        return OrgId;
    }

    public void setOrgId(String OrgId) {
        this.OrgId = OrgId;
    }

    public String getOrgParent() {
        return OrgParent;
    }

    public void setOrgParent(String OrgParent) {
        this.OrgParent = OrgParent;
    }

    public String getOrgType() {
        return OrgType;
    }

    public void setOrgType(String OrgType) {
        this.OrgType = OrgType;
    }

    public Integer getOrderCode() {
        return OrderCode;
    }

    public void setOrderCode(Integer OrderCode) {
        this.OrderCode = OrderCode;
    }

    @Override
    public String toString() {
        return "Department{" +
                "Id=" + Id +
                ", DepName=" + DepName +
                ", DepAddress=" + DepAddress +
                ", DepType=" + DepType +
                ", DepLevel=" + DepLevel +
                ", NumberAll=" + NumberAll +
                ", NumberTrue=" + NumberTrue +
                ", NumberLeader=" + NumberLeader +
                ", NumberLeaderChu=" + NumberLeaderChu +
                ", CarNumberAll=" + CarNumberAll +
                ", CarNumberTrue=" + CarNumberTrue +
                ", ImgOrg=" + ImgOrg +
                ", ImgCheck=" + ImgCheck +
                ", ImgThree=" + ImgThree +
                ", OrgId=" + OrgId +
                ", OrgParent=" + OrgParent +
                ", OrgType=" + OrgType +
                ", OrderCode=" + OrderCode +
                "}";
    }
}
