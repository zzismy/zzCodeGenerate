package com.zz.bsmcc.base.domain;


import com.baomidou.mybatisplus.annotations.TableName;
import com.zz.bms.annotaions.EntityAnnotation;
import com.zz.bms.annotaions.EntityAttrDBAnnotation;
import com.zz.bms.core.db.entity.BaseBusinessEntity;
import com.zz.bms.core.Constant;
import com.zz.bms.core.db.entity.BaseBusinessExEntity;

/**
* 模板组实体类
*
* @author Administrator
* @date 2018-7-24 10:20:11
*/
@EntityAnnotation(value="模板组" , resource = "")
@TableName(value="tcg_templet_group" , resultMap = "TcgTempletGroupResultMap")
public class TcgTempletGroupEntity extends BaseBusinessExEntity<String> implements java.io.Serializable{
private static final long serialVersionUID = 1L;





        //@EntityAttrAnnotation(attrName="模板组名称",sort=1  , attrLength=50    )
        private String groupName;





        //@EntityAttrAnnotation(attrName="模板说明",sort=2  , attrLength=500    )
        private String groupRemark;










        //@EntityAttrAnnotation(attrName="删除标志",sort=8  , attrLength=1    )
        private String deleteFlag;


        /**
        * 模板组名称
        * @return the groupName
        */
        public String getGroupName() {
        return groupName;
        }

        /**
        * 模板组名称
        */
        public void setGroupName(String groupName) {
        this.groupName = groupName;
        }
        /**
        * 模板说明
        * @return the groupRemark
        */
        public String getGroupRemark() {
        return groupRemark;
        }

        /**
        * 模板说明
        */
        public void setGroupRemark(String groupRemark) {
        this.groupRemark = groupRemark;
        }
        /**
        * 删除标志
        * @return the deleteFlag
        */
        public String getDeleteFlag() {
        return deleteFlag;
        }

        /**
        * 删除标志
        */
        public void setDeleteFlag(String deleteFlag) {
        this.deleteFlag = deleteFlag;
        }

}