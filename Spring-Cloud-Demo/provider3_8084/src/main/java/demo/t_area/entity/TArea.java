package demo.t_area.entity;

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
public class TArea implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 地区Id
     */
    @TableId("AreaId")
    private String AreaId;

    /**
     * 地区名称
     */
    @TableField("AreaName")
    private String AreaName;

    /**
     * 地区父级
     */
    @TableField("AreaParent")
    private String AreaParent;

    /**
     * 排序
     */
    @TableField("OrderCode")
    private Integer OrderCode;

    public String getAreaId() {
        return AreaId;
    }

    public void setAreaId(String AreaId) {
        this.AreaId = AreaId;
    }

    public String getAreaName() {
        return AreaName;
    }

    public void setAreaName(String AreaName) {
        this.AreaName = AreaName;
    }

    public String getAreaParent() {
        return AreaParent;
    }

    public void setAreaParent(String AreaParent) {
        this.AreaParent = AreaParent;
    }

    public Integer getOrderCode() {
        return OrderCode;
    }

    public void setOrderCode(Integer OrderCode) {
        this.OrderCode = OrderCode;
    }

    @Override
    public String toString() {
        return "TArea{" +
                "AreaId=" + AreaId +
                ", AreaName=" + AreaName +
                ", AreaParent=" + AreaParent +
                ", OrderCode=" + OrderCode +
                "}";
    }
}
