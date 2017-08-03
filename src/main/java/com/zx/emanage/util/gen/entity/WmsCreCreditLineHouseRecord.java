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

public class WmsCreCreditLineHouseRecord implements BaseEntity
{
    private static final long serialVersionUID = 1L;

    private Integer wms_cre_credit_line_house_record_id;

    private Integer wms_cre_credit_head_id;

    private String apply_name;

    private String id_card;

    private String owner_name;

    private String co_owner_name;

    private String house_card_id;

    private String house_address;

    private String obligee_name;

    private java.math.BigDecimal mortgage_amount;

    private String agree_limit_time;

    private String other_remark;

    private Integer create_user_id;

    private String create_user_name;

    private java.sql.Timestamp create_timestamp;

    private String create_timestamp_str;

    private Integer last_update_user_id;

    private java.sql.Timestamp last_update_timestamp;

    private String last_update_timestamp_str;

    private String enable_flag;

    /**
     * default val cols name array
     */
    private static String[] defaultValColArr = {};

    /**
     * pk cols name array
     */
    private static String[] pkColArr = { "wms_cre_credit_line_house_record_id" };

    private static String[] columnNameArr = { "wms_cre_credit_line_house_record_id", "wms_cre_credit_head_id",
                                             "apply_name", "id_card", "owner_name", "co_owner_name", "house_card_id",
                                             "house_address", "obligee_name", "mortgage_amount", "agree_limit_time",
                                             "other_remark", "create_user_id", "create_user_name", "create_timestamp",
                                             "create_timestamp_str", "last_update_user_id", "last_update_timestamp",
                                             "last_update_timestamp_str", "enable_flag" };

    public Integer getWms_cre_credit_line_house_record_id()
    {
        return wms_cre_credit_line_house_record_id;
    }

    public void setWms_cre_credit_line_house_record_id(Integer obj)
    {
        wms_cre_credit_line_house_record_id = obj;
    }

    public Integer getWms_cre_credit_head_id()
    {
        return wms_cre_credit_head_id;
    }

    public void setWms_cre_credit_head_id(Integer obj)
    {
        wms_cre_credit_head_id = obj;
    }

    public String getApply_name()
    {
        return apply_name;
    }

    public void setApply_name(String obj)
    {
        apply_name = obj;
    }

    public String getId_card()
    {
        return id_card;
    }

    public void setId_card(String obj)
    {
        id_card = obj;
    }

    public String getOwner_name()
    {
        return owner_name;
    }

    public void setOwner_name(String obj)
    {
        owner_name = obj;
    }

    public String getCo_owner_name()
    {
        return co_owner_name;
    }

    public void setCo_owner_name(String obj)
    {
        co_owner_name = obj;
    }

    public String getHouse_card_id()
    {
        return house_card_id;
    }

    public void setHouse_card_id(String obj)
    {
        house_card_id = obj;
    }

    public String getHouse_address()
    {
        return house_address;
    }

    public void setHouse_address(String obj)
    {
        house_address = obj;
    }

    public String getObligee_name()
    {
        return obligee_name;
    }

    public void setObligee_name(String obj)
    {
        obligee_name = obj;
    }

    public java.math.BigDecimal getMortgage_amount()
    {
        return mortgage_amount;
    }

    public void setMortgage_amount(java.math.BigDecimal obj)
    {
        mortgage_amount = obj;
    }

    public String getAgree_limit_time()
    {
        return agree_limit_time;
    }

    public void setAgree_limit_time(String obj)
    {
        agree_limit_time = obj;
    }

    public String getOther_remark()
    {
        return other_remark;
    }

    public void setOther_remark(String obj)
    {
        other_remark = obj;
    }

    public Integer getCreate_user_id()
    {
        return create_user_id;
    }

    public void setCreate_user_id(Integer obj)
    {
        create_user_id = obj;
    }

    public String getCreate_user_name()
    {
        return create_user_name;
    }

    public void setCreate_user_name(String obj)
    {
        create_user_name = obj;
    }

    public java.sql.Timestamp getCreate_timestamp()
    {
        return create_timestamp;
    }

    public void setCreate_timestamp(java.sql.Timestamp obj)
    {
        create_timestamp = obj;
    }

    public String getCreate_timestampStr()
    {
        return create_timestamp_str;
    }

    public void setCreate_timestampStr(String obj)
    {
        create_timestamp_str = obj;
    }

    public Integer getLast_update_user_id()
    {
        return last_update_user_id;
    }

    public void setLast_update_user_id(Integer obj)
    {
        last_update_user_id = obj;
    }

    public java.sql.Timestamp getLast_update_timestamp()
    {
        return last_update_timestamp;
    }

    public void setLast_update_timestamp(java.sql.Timestamp obj)
    {
        last_update_timestamp = obj;
    }

    public String getLast_update_timestampStr()
    {
        return last_update_timestamp_str;
    }

    public void setLast_update_timestampStr(String obj)
    {
        last_update_timestamp_str = obj;
    }

    public String getEnable_flag()
    {
        return enable_flag;
    }

    public void setEnable_flag(String obj)
    {
        enable_flag = obj;
    }

    /**
     * put all columns into a map
     */
    public void putInMap(Map<String, Object> paramMap)
    {
        paramMap.put("wms_cre_credit_line_house_record_id", this.wms_cre_credit_line_house_record_id);
        paramMap.put("wms_cre_credit_head_id", this.wms_cre_credit_head_id);
        paramMap.put("apply_name", this.apply_name);
        paramMap.put("id_card", this.id_card);
        paramMap.put("owner_name", this.owner_name);
        paramMap.put("co_owner_name", this.co_owner_name);
        paramMap.put("house_card_id", this.house_card_id);
        paramMap.put("house_address", this.house_address);
        paramMap.put("obligee_name", this.obligee_name);
        paramMap.put("mortgage_amount", this.mortgage_amount);
        paramMap.put("agree_limit_time", this.agree_limit_time);
        paramMap.put("other_remark", this.other_remark);
        paramMap.put("create_user_id", this.create_user_id);
        paramMap.put("create_user_name", this.create_user_name);
        paramMap.put("create_timestamp", this.create_timestamp);
        paramMap.put("create_timestamp_str", this.create_timestamp_str);
        paramMap.put("last_update_user_id", this.last_update_user_id);
        paramMap.put("last_update_timestamp", this.last_update_timestamp);
        paramMap.put("last_update_timestamp_str", this.last_update_timestamp_str);
        paramMap.put("enable_flag", this.enable_flag);
    }

    /**
     * return the columns map
     */
    public Map<String, Object> getInfoMap()
    {
        Map<String, Object> paramMap = new HashMap<String, Object>();
        this.putInMap(paramMap);
        return paramMap;
    }

    /**
     * remove default value and pk if it is null
     */
    private Map<String, Object> dealWithMap(Map<String, Object> paramMap)
    {
        Set<String> set = new HashSet<String>();
        for (String colName : defaultValColArr)
        {
            set.add(colName);
        }
        for (String colName : pkColArr)
        {
            set.add(colName);
        }
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext())
        {
            String colName = iterator.next();
            if (paramMap.get(colName) == null)
            {
                paramMap.remove(colName);
            }
        }
        return paramMap;
    }
}