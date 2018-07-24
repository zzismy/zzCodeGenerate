package com.zz.bsmcc.base.domain;


import com.baomidou.mybatisplus.annotations.TableName;
import com.zz.bms.annotaions.EntityAnnotation;
import com.zz.bms.annotaions.EntityAttrDBAnnotation;
import com.zz.bms.core.db.entity.BaseBusinessEntity;
import com.zz.bms.core.Constant;
import com.zz.bms.core.db.entity.BaseBusinessExEntity;

/**
 * 列事件实体类
 *
 * @author Administrator
 * @date 2018-7-24 10:20:07
 */
@EntityAnnotation(value="列事件" , resource = "")
@TableName(value="tcg_column_event" , resultMap = "TcgColumnEventResultMap")
public class TcgColumnEventEntity extends BaseBusinessEntity<String> implements java.io.Serializable{
	private static final long serialVersionUID = 1L;





    //@EntityAttrAnnotation(attrName="列",sort=1  , attrLength=32    )
	private String columnId;





    //@EntityAttrAnnotation(attrName="事件名称",sort=2  , attrLength=50    )
	private String eventName;





    //@EntityAttrAnnotation(attrName="函数体内容",sort=3  , attrLength=1000    )
	private String funcBody;







	/** 
	 * 列
	 * @return the columnId
	 */
	public String getColumnId() {
		return columnId;
	}
	
	/** 
	 * 列
	 */
	public void setColumnId(String columnId) {
		this.columnId = columnId;
	}
	/** 
	 * 事件名称
	 * @return the eventName
	 */
	public String getEventName() {
		return eventName;
	}
	
	/** 
	 * 事件名称
	 */
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	/** 
	 * 函数体内容
	 * @return the funcBody
	 */
	public String getFuncBody() {
		return funcBody;
	}
	
	/** 
	 * 函数体内容
	 */
	public void setFuncBody(String funcBody) {
		this.funcBody = funcBody;
	}
	
}