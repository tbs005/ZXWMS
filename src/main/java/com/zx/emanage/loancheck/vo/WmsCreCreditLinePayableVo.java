package com.zx.emanage.loancheck.vo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.io.Serializable;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
import java.math.BigDecimal;

import com.zx.emanage.util.gen.entity.WmsCreCreditLineReceivablePayable;
import com.zx.sframe.util.mybatis.BaseEntity;

/*
 * @version 2.0
 */

public class WmsCreCreditLinePayableVo extends WmsCreCreditLineReceivablePayable implements BaseEntity
{
    private static final long serialVersionUID = 1L;

    private Integer wms_cre_credit_line_receivable_payable_id;

    private String receivable_payable_type = "2";

    private String customer_name;

    private String prod_name;

    private java.math.BigDecimal account;

    private String settlement_way;

    private String account_period;

    private String contract_no;

    private String remark;

    private Integer wms_cre_credit_head_id;

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
    private static String[] pkColArr = { "wms_cre_credit_line_receivable_payable_id" };

    private static String[] columnNameArr = { "wms_cre_credit_line_receivable_payable_id", "receivable_payable_type",
                                             "customer_name", "prod_name", "account", "settlement_way",
                                             "account_period", "contract_no", "remark", "wms_cre_credit_head_id",
                                             "create_user_id", "create_user_name", "create_timestamp",
                                             "create_timestamp_str", "last_update_user_id", "last_update_timestamp",
                                             "last_update_timestamp_str", "enable_flag" };

    public Integer getWms_cre_credit_line_receivable_payable_id()
    {
        return wms_cre_credit_line_receivable_payable_id;
    }

    public void setWms_cre_credit_line_receivable_payable_id(Integer obj)
    {
        wms_cre_credit_line_receivable_payable_id = obj;
    }

    public String getReceivable_payable_type()
    {
        return receivable_payable_type;
    }

    public void setReceivable_payable_type(String obj)
    {
        receivable_payable_type = obj;
    }

    public String getCustomer_name()
    {
        return customer_name;
    }

    public void setCustomer_name(String obj)
    {
        customer_name = obj;
    }

    public String getProd_name()
    {
        return prod_name;
    }

    public void setProd_name(String obj)
    {
        prod_name = obj;
    }

    public java.math.BigDecimal getAccount()
    {
        return account;
    }

    public void setAccount(java.math.BigDecimal obj)
    {
        account = obj;
    }

    public String getSettlement_way()
    {
        return settlement_way;
    }

    public void setSettlement_way(String obj)
    {
        settlement_way = obj;
    }

    public String getAccount_period()
    {
        return account_period;
    }

    public void setAccount_period(String obj)
    {
        account_period = obj;
    }

    public String getContract_no()
    {
        return contract_no;
    }

    public void setContract_no(String obj)
    {
        contract_no = obj;
    }

    public String getRemark()
    {
        return remark;
    }

    public void setRemark(String obj)
    {
        remark = obj;
    }

    public Integer getWms_cre_credit_head_id()
    {
        return wms_cre_credit_head_id;
    }

    public void setWms_cre_credit_head_id(Integer obj)
    {
        wms_cre_credit_head_id = obj;
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
        paramMap.put("wms_cre_credit_line_receivable_payable_id", this.wms_cre_credit_line_receivable_payable_id);
        paramMap.put("receivable_payable_type", this.receivable_payable_type);
        paramMap.put("customer_name", this.customer_name);
        paramMap.put("prod_name", this.prod_name);
        paramMap.put("account", this.account);
        paramMap.put("settlement_way", this.settlement_way);
        paramMap.put("account_period", this.account_period);
        paramMap.put("contract_no", this.contract_no);
        paramMap.put("remark", this.remark);
        paramMap.put("wms_cre_credit_head_id", this.wms_cre_credit_head_id);
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