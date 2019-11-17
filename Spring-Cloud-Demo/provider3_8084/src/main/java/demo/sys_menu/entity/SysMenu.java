package demo.sys_menu.entity;

import com.baomidou.mybatisplus.annotation.IdType;
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
public class SysMenu implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 菜单Id
     */
    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    /**
     * 菜单名称
     */
    @TableField("MenuName")
    private String MenuName;

    /**
     * 菜单父级Id
     */
    @TableField("Pid")
    private Integer Pid;

    /**
     * 菜单指向地址
     */
    @TableField("LinkUrl")
    private String LinkUrl;

    /**
     * 样式
     */
    @TableField("ICONCLASS")
    private String iconclass;

    /**
     * 图片名称
     */
    @TableField("IMGNAME")
    private String imgname;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public String getMenuName() {
        return MenuName;
    }

    public void setMenuName(String MenuName) {
        this.MenuName = MenuName;
    }

    public Integer getPid() {
        return Pid;
    }

    public void setPid(Integer Pid) {
        this.Pid = Pid;
    }

    public String getLinkUrl() {
        return LinkUrl;
    }

    public void setLinkUrl(String LinkUrl) {
        this.LinkUrl = LinkUrl;
    }

    public String getIconclass() {
        return iconclass;
    }

    public void setIconclass(String iconclass) {
        this.iconclass = iconclass;
    }

    public String getImgname() {
        return imgname;
    }

    public void setImgname(String imgname) {
        this.imgname = imgname;
    }

    @Override
    public String toString() {
        return "SysMenu{" +
                "Id=" + Id +
                ", MenuName=" + MenuName +
                ", Pid=" + Pid +
                ", LinkUrl=" + LinkUrl +
                ", iconclass=" + iconclass +
                ", imgname=" + imgname +
                "}";
    }
}
