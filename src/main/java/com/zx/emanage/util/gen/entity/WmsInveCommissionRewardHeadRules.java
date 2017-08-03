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

public class WmsInveCommissionRewardHeadRules implements BaseEntity {
	private static final long serialVersionUID = 1L;
	
	private Integer wms_inve_commission_reward_head_rules_id;
	
	private Integer commission_reward_type;
	
	private Integer reward_method;
	
	private java.sql.Date reward_validity_period;
	
	private String reward_validity_period_str;
	
	private java.sql.Timestamp create_datetime;
	
	private String create_datetime_str;
	
	private Integer create_user_id;
	
	private Integer last_update_user_id;
	
	private java.sql.Timestamp last_update_datetime;
	
	private String last_update_datetime_str;
	
	private String enable_flag;
	
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
	  	"wms_inve_commission_reward_head_rules_id"
	};
	
	private static String[] columnNameArr = {
		"wms_inve_commission_reward_head_rules_id",
		"commission_reward_type",
		"reward_method",
		"reward_validity_period",
		"reward_validity_period_str",
		"create_datetime",
		"create_datetime_str",
		"create_user_id",
		"last_update_user_id",
		"last_update_datetime",
		"last_update_datetime_str",
		"enable_flag",
		"isExcludePKFlag"
	};
  
	public Integer getWms_inve_commission_reward_head_rules_id () {
		return wms_inve_commission_reward_head_rules_id;
	}
	
	public void setWms_inve_commission_reward_head_rules_id (Integer obj) {
		wms_inve_commission_reward_head_rules_id = obj;
	}
	
	public Integer getCommission_reward_type () {
		return commission_reward_type;
	}
	
	public void setCommission_reward_type (Integer obj) {
		commission_reward_type = obj;
	}
	
	public Integer getReward_method () {
		return reward_method;
	}
	
	public void setReward_method (Integer obj) {
		reward_method = obj;
	}
	
	public java.sql.Date getReward_validity_period () {
		return reward_validity_period;
	}
	
	public void setReward_validity_period (java.sql.Date obj) {
		reward_validity_period = obj;
	}
	
	public String getReward_validity_period_str () {
		return reward_validity_period_str;
	}
	
	public void setReward_validity_period_str (String obj) {
		reward_validity_period_str = obj;
	}
	
	public java.sql.Timestamp getCreate_datetime () {
		return create_datetime;
	}
	
	public void setCreate_datetime (java.sql.Timestamp obj) {
		create_datetime = obj;
	}
	
	public String getCreate_datetime_str () {
		return create_datetime_str;
	}
	
	public void setCreate_datetime_str (String obj) {
		create_datetime_str = obj;
	}
	
	public Integer getCreate_user_id () {
		return create_user_id;
	}
	
	public void setCreate_user_id (Integer obj) {
		create_user_id = obj;
	}
	
	public Integer getLast_update_user_id () {
		return last_update_user_id;
	}
	
	public void setLast_update_user_id (Integer obj) {
		last_update_user_id = obj;
	}
	
	public java.sql.Timestamp getLast_update_datetime () {
		return last_update_datetime;
	}
	
	public void setLast_update_datetime (java.sql.Timestamp obj) {
		last_update_datetime = obj;
	}
	
	public String getLast_update_datetime_str () {
		return last_update_datetime_str;
	}
	
	public void setLast_update_datetime_str (String obj) {
		last_update_datetime_str = obj;
	}
	
	public String getEnable_flag () {
		return enable_flag;
	}
	
	public void setEnable_flag (String obj) {
		enable_flag = obj;
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
		paramMap.put("wms_inve_commission_reward_head_rules_id", this.wms_inve_commission_reward_head_rules_id);
		paramMap.put("commission_reward_type", this.commission_reward_type);
		paramMap.put("reward_method", this.reward_method);
		paramMap.put("reward_validity_period", this.reward_validity_period);
		paramMap.put("reward_validity_period_str", this.reward_validity_period_str);
		paramMap.put("create_datetime", this.create_datetime);
		paramMap.put("create_datetime_str", this.create_datetime_str);
		paramMap.put("create_user_id", this.create_user_id);
		paramMap.put("last_update_user_id", this.last_update_user_id);
		paramMap.put("last_update_datetime", this.last_update_datetime);
		paramMap.put("last_update_datetime_str", this.last_update_datetime_str);
		paramMap.put("enable_flag", this.enable_flag);
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