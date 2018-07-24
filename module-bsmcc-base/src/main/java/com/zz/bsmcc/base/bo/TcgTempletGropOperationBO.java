package com.zz.bsmcc.base.bo;

import com.zz.bsmcc.base.domain.TcgTempletGropOperationEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.zz.bms.annotaions.EntityAnnotation;

import java.io.Serializable;



/**
* 模板组操作定义 BO , 扩展 模板组操作定义Entity对象
* @author Administrator
*/
@EntityAnnotation(value="模板组操作定义" , resource = "")
@TableName(value="tcg_templet_grop_operation" , resultMap = "TcgTempletGropOperationResultMap")
public class TcgTempletGropOperationBO extends TcgTempletGropOperationEntity implements Serializable {

}
