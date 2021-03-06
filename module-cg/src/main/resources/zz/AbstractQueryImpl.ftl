package ${table.basePackage}.domain;


import com.zz.bms.core.db.mybatis.query.QueryImpl;
import com.zz.bsmcc.base.domain.${table.shortTableName?cap_first}Entity;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * ${table.tableComments} 查询抽象类
 * 用于链式查询
 * @author ${table.author}
 * @date ${.now}
 */
public abstract class ${table.shortTableName?cap_first}AbstractQueryImpl<PK extends Serializable> extends QueryImpl<${table.shortTableName?cap_first}Entity,PK> {

<#list table.columnList as being>




	<#if being.columnType=="char" || being.columnType=="varchar2" || being.columnType=="varchar" || being.columnType=="longtext">

		<#if being.shortColumnName == "id" ||  being.columnPrecision == "32" || being.columnPrecision == "36" || being.columnPrecision == "64">
            protected PK ${being.shortColumnName};
            protected PK ${being.shortColumnName}_NE;
		<#elseif being.columnPrecision == "1" || being.columnPrecision == "2" >
            protected String ${being.shortColumnName};
            protected String ${being.shortColumnName}_NE;

		<#else>
            protected String ${being.shortColumnName};
            protected String ${being.shortColumnName}_NE;
            protected String ${being.shortColumnName}_LIKE;
            protected String ${being.shortColumnName}_NOTLIKE;
		</#if>



	<#elseif being.columnType=="int" || being.columnType=="double" || being.columnType=="decimal" || being.columnType=="long"  || being.columnType=="number" >


        protected ${being.javaType} ${being.shortColumnName};
        protected ${being.javaType} ${being.shortColumnName}_NE;
        protected ${being.javaType} ${being.shortColumnName}_GT;
        protected ${being.javaType} ${being.shortColumnName}_GE;
        protected ${being.javaType} ${being.shortColumnName}_LT;
        protected ${being.javaType} ${being.shortColumnName}_LE;

	<#elseif being.columnType=="date" || being.columnType=="timestamp" >

        protected ${being.javaType} ${being.shortColumnName};
        protected ${being.javaType} ${being.shortColumnName}_NE;
        protected ${being.javaType} ${being.shortColumnName}_GT;
        protected ${being.javaType} ${being.shortColumnName}_GE;
        protected ${being.javaType} ${being.shortColumnName}_LT;
        protected ${being.javaType} ${being.shortColumnName}_LE;

	<#else>
        ;
	</#if>




</#list>

	
}