package com.zx.emanage.loanappro.vo;

import com.zx.platform.syscontext.vo.GridParamBean;

/*
 * @version 2.0
 */

public class WmsCreCreditVisaApplSearchBeanVO extends GridParamBean {

	private static final long serialVersionUID = 1L;

    // 贷款单据主键
    private Integer wms_cre_credit_head_id;

    public Integer getWms_cre_credit_head_id()
    {
        return wms_cre_credit_head_id;
    }

    public void setWms_cre_credit_head_id(Integer wms_cre_credit_head_id)
    {
        this.wms_cre_credit_head_id = wms_cre_credit_head_id;
    }

}