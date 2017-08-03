package com.zx.emanage.loanreview.service.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zx.platform.syscontext.vo.GridDataBean;
import com.zx.emanage.loanreview.persist.WmsCreRevWaterRepayLoanDao;
import com.zx.emanage.loanreview.service.IWmsCreRevWaterRepayLoanService;
import com.zx.emanage.loanreview.vo.WmsCreRevWaterRepayLoanSearchBeanVO;
import com.zx.emanage.util.gen.entity.WmsCreRevWaterRepayLoan;
import com.zx.sframe.util.vo.UserBean;

/*
 * @version 2.0
 */

@Service("wmscrerevwaterrepayloanService")
public class WmsCreRevWaterRepayLoanServiceImpl implements IWmsCreRevWaterRepayLoanService
{
    private static Logger log = LoggerFactory.getLogger(WmsCreRevWaterRepayLoanServiceImpl.class);

    @Autowired
    private WmsCreRevWaterRepayLoanDao wmscrerevwaterrepayloanDao;

    @Override
    public Map<String, Object> getListWithoutPaging(WmsCreRevWaterRepayLoanSearchBeanVO queryInfo)
    {
        Map<String, Object> paramMap = new HashMap<String, Object>();
        paramMap.put("sortname", queryInfo.getSortname());
        paramMap.put("sortorder", queryInfo.getSortorder());
        List<Map<String, Object>> list = wmscrerevwaterrepayloanDao.search(paramMap);
        Map<String, Object> resMap = new HashMap<String, Object>();
        resMap.put("Rows", list);
        return resMap;
    }

    @Override
    public Map<String, Object> getListWithPaging(WmsCreRevWaterRepayLoanSearchBeanVO queryInfo)
    {
        Map<String, Object> paramMap = new HashMap<String, Object>();
        paramMap.put("sortname", queryInfo.getSortname());
        paramMap.put("sortorder", queryInfo.getSortorder());
        paramMap.put("pagesize", queryInfo.getPagesize());
        paramMap.put("offset", queryInfo.getOffset());
        List<Map<String, Object>> list = wmscrerevwaterrepayloanDao.search(paramMap);
        GridDataBean<Map<String, Object>> bean = new GridDataBean<Map<String, Object>>(
                                                                                       queryInfo.getPage(),
                                                                                       wmscrerevwaterrepayloanDao.findCount(paramMap),
                                                                                       list);
        return bean.getGridData();
    }

    @Override
    public WmsCreRevWaterRepayLoan getInfoByPK(Integer wms_cre_rev_water_repay_loan_id)
    {
        return wmscrerevwaterrepayloanDao.get(wms_cre_rev_water_repay_loan_id);
    }

    @Override
    @Transactional
    public String save(WmsCreRevWaterRepayLoan bean, UserBean user)
    {
        String resStr = "success";
        int ret = 0;
        ret = wmscrerevwaterrepayloanDao.save(bean);
        if (ret == 0)
        {
            resStr = "error";
        }
        return resStr;
    }

    @Override
    @Transactional
    public String update(WmsCreRevWaterRepayLoan bean, UserBean user)
    {
        String resStr = "success";
        int ret = 0;
        ret = wmscrerevwaterrepayloanDao.update(bean); // update a record
                                                       // replace columns,
                                                       // nonsupport null val
        if (ret == 0)
        {
            resStr = "error";
        }
        return resStr;
    }

    /**
     * Description :check repeat by "and" method, union checking, need new
     * WmsCreRevWaterRepayLoan() include check-params
     * 
     * @param queryInfo
     * @param isExludePKFlag, true is exclude primary key, false is include
     *            primary key
     * @return "success" or "repeat"
     * @author auto_generator
     */
    private List<WmsCreRevWaterRepayLoan> getListByEntity(WmsCreRevWaterRepayLoan queryInfo, Boolean isExcludePKFlag)
    {
        Map<String, Object> paramMap = new HashMap<String, Object>();
        paramMap.put("isExcludePKFlag", isExcludePKFlag);
        String resStr = "success";
        List<WmsCreRevWaterRepayLoan> beanList = wmscrerevwaterrepayloanDao.getListByEntity(queryInfo);
        return beanList;
    }
}
