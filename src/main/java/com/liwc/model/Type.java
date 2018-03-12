package com.liwc.model;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

@TableName("ACCOUNT_TYPE")
public class Type implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3853711593995407361L;

	@TableId("ACCOUNT_TYPE_ID")
	int typeId;

	@TableField("ACCOUNT_TYPE_CODE")
	String typeCode;
	
	@TableField(value= "ACCOUNT_TYPE_NAME")
	String typeName;

	
	
	public int getTypeId() {
		return typeId;
	}
	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	public String getTypeCode() {
		return typeCode;
	}
	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode;
	}
	
	@Override
	public String toString(){
		return "typeId="+typeId +",typeName="+typeName+",typeCode="+typeCode;
	}
	
	
}
