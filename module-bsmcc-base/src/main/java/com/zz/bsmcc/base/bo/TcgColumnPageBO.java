package com.zz.bsmcc.base.bo;

import com.baomidou.mybatisplus.annotations.TableField;
import com.zz.bsmcc.base.domain.TcgColumnPageEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.zz.bms.annotaions.EntityAnnotation;

import java.io.Serializable;



/**
* 列界面设置 BO , 扩展 列界面设置Entity对象
* @author Administrator
*/
@EntityAnnotation(value="列界面设置" , resource = "")
@TableName(value="tcg_column_page" , resultMap = "TcgColumnPageResultMap")
public class TcgColumnPageBO extends TcgColumnPageEntity implements Serializable {

    @TableField(exist = false)
    private String columnComment ;

    @TableField(exist = false)
    private String realColumnName;

    @TableField(exist = false)
    private String editableName;

    @TableField(exist = false)
    private String hiddenableName;

    @TableField(exist = false)
    private String existPageName;

    @TableField(exist = false)
    private String requiredName;

    @TableField(exist = false)
    private String listShowableName;

    @TableField(exist = false)
    private String elementNmae;

    //用于代码生成

    /**
     * 列的信息
     */
    @TableField(exist = false)
    private TcgColumnConfigBO columnConfig ;
    /**
     * 扩展列的信息
     */
    @TableField(exist = false)
    private TcgExColumnBO exColumn ;


    public String getColumnComment() {
        return columnComment;
    }

    public void setColumnComment(String columnComment) {
        this.columnComment = columnComment;
    }

    public String getRealColumnName() {
        return realColumnName;
    }

    public void setRealColumnName(String realColumnName) {
        this.realColumnName = realColumnName;
    }

    public String getEditableName() {
        return editableName;
    }

    public void setEditableName(String editableName) {
        this.editableName = editableName;
    }

    public String getHiddenableName() {
        return hiddenableName;
    }

    public void setHiddenableName(String hiddenableName) {
        this.hiddenableName = hiddenableName;
    }

    public String getExistPageName() {
        return existPageName;
    }

    public void setExistPageName(String existPageName) {
        this.existPageName = existPageName;
    }

    public String getRequiredName() {
        return requiredName;
    }

    public void setRequiredName(String requiredName) {
        this.requiredName = requiredName;
    }

    public String getListShowableName() {
        return listShowableName;
    }

    public void setListShowableName(String listShowableName) {
        this.listShowableName = listShowableName;
    }

    public String getElementNmae() {
        return elementNmae;
    }

    public void setElementNmae(String elementNmae) {
        this.elementNmae = elementNmae;
    }

    public TcgColumnConfigBO getColumnConfig() {
        return columnConfig;
    }

    public void setColumnConfig(TcgColumnConfigBO columnConfig) {
        this.columnConfig = columnConfig;
    }

    public TcgExColumnBO getExColumn() {
        return exColumn;
    }

    public void setExColumn(TcgExColumnBO exColumn) {
        this.exColumn = exColumn;
    }
}
