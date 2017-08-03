package com.zx.emanage.util.gen.entity;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.io.Serializable;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
import java.math.BigDecimal;

import com.zx.sframe.util.mybatis.BaseEntity;

/*
 * @version 2.0
 */

public class WmsInveCommissionPersonnelReward implements BaseEntity {
	private static final long serialVersionUID = 1L;
	
	private Integer wms_inve_commission_personnel_reward_id;
	
	private Integer wms_inve_commission_reward_head_rules_id;
	
	private Integer reward_model;
	
	private java.math.BigDecimal reward_method;
	
	private boolean isExcludePKFlag;
	
	
	/**
	* default val cols name array
	*/	
	private static String[] defaultValColArr = {
	};
	
	/**
	* pk cols name array
	*/	
	private static String[] pkColArr = {
	  	"wms_inve_commission_personnel_reward_id"
	};
	
	private static String[] columnNameArr = {
		"wms_inve_commission_personnel_reward_id",
		"wms_inve_commission_reward_head_rules_id",
		"reward_model",
		"reward_method",
		"isExcludePKFlag"
	};
  
	public Integer getWms_inve_commission_personnel_reward_id () {
		return wms_inve_commission_personnel_reward_id;
	}
	
	public void setWms_inve_commission_personnel_reward_id (Integer obj) {
		wms_inve_commission_personnel_reward_id = obj;
	}
	
	public Integer getWms_inve_commission_reward_head_rules_id () {
		return wms_inve_commission_reward_head_rules_id;
	}
	
	public void setWms_inve_commission_reward_head_rules_id (Integer obj) {
		wms_inve_commission_reward_head_rules_id = obj;
	}
	
	public Integer getReward_model () {
		return reward_model;
	}
	
	public void setReward_model (Integer obj) {
		reward_model = obj;
	}
	
	public java.math.BigDecimal getReward_method () {
		return reward_method;
	}
	
	public void setReward_method (java.math.BigDecimal obj) {
		reward_method = obj;
	}
	
	public boolean getgetIsExcludePKFlag () {
		return isExcludePKFlag;
	}
	
	public void setgetIsExcludePKFlag (boolean obj) {
		isExcludePKFlag = obj;
	}
	
	
	/**
	* put all columns into a map
	*/
	public void putInMap(Map<String, Object> paramMap) {
		paramMap.put("wms_inve_commission_personnel_reward_id", this.wms_inve_commission_personnel_reward_id);
		paramMap.put("wms_inve_commission_reward_head_rules_id", this.wms_inve_commission_reward_head_rules_id);
		paramMap.put("reward_model", this.reward_model);
		paramMap.put("reward_method", this.reward_method);
		paramMap.put("isExcludePKFlag", this.isExcludePKFlag);
	}
	
	/**
	* return the columns map
	*/
	public Map<String, Object> getInfoMap() {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		this.putInMap(paramMap);
		return paramMap;
	}
	
	/**
	* remove default value and pk if it is null
	*/
	private Map<String, Object> dealWithMap(Map<String, Object> paramMap) {
		Set<String> set = new HashSet<String>();
		for (String colName : defaultValColArr) {
			set.add(colName);
		}
		for (String colName : pkColArr) {
			set.add(colName);
		}
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			String colName = iterator.next();
			if(paramMap.get(colName) == null) {
				paramMap.remove(colName);
			}
		}
		return paramMap;
	}
}