package com.zx.emanage.loanreview.web;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zx.emanage.loanreview.service.IWmsCreRevWaterModelService;
import com.zx.emanage.loanreview.vo.WmsCreRevWaterModelSearchBeanVO;
import com.zx.emanage.util.gen.entity.WmsCreRevWaterModel;
import com.zx.sframe.util.GlobalVal;
import com.zx.sframe.util.vo.UserBean;

/*
 * @version 2.0
 * @author
 */

@Controller
public class WmsCreRevWaterModelController
{
    private static Logger log = LoggerFactory.getLogger(WmsCreRevWaterModelController.class);

    @Autowired
    private IWmsCreRevWaterModelService wmscrerevwatermodelService;

    /**
     * Description :get record list records by vo queryInfo withnot paging
     * 
     * @param queryInfo
     * @return record list
     * @author auto_generator
     */
    @RequestMapping(value = "/loanreview/wmscrerevwatermodelwithoutpaginglist.do", method = { RequestMethod.GET,
                                                                                             RequestMethod.POST })
    @ResponseBody
    public Map<String, Object> getListWithoutPaging(WmsCreRevWaterModelSearchBeanVO queryInfo)
    {
        return wmscrerevwatermodelService.getListWithoutPaging(queryInfo);
    }

    /**
     * Description :get record list records by vo queryInfo with paging
     * 
     * @param queryInfo
     * @return record list
     * @author auto_generator
     */
    @RequestMapping(value = "/loanreview/wmscrerevwatermodelwithpaginglist.do", method = { RequestMethod.GET,
                                                                                          RequestMethod.POST })
    @ResponseBody
    public Map<String, Object> getListWithPaging(WmsCreRevWaterModelSearchBeanVO queryInfo)
    {
        return wmscrerevwatermodelService.getListWithPaging(queryInfo);
    }

    /**
     * Description :get single-table information by primary key
     * 
     * @param primary key
     * @return WmsCreRevWaterModelVO
     * @author auto_generator
     */
    @RequestMapping(value = "/loanreview/wmscrerevwatermodelinfobyfk.do", method = { RequestMethod.GET })
    @ResponseBody
    public WmsCreRevWaterModel getInfoByFK(Integer wms_cre_credit_head_id)
    {
        return wmscrerevwatermodelService.getInfoByFK(wms_cre_credit_head_id);
    }

    /**
     * Description :add method
     * 
     * @param bean
     * @return "success" or "error" or user defined
     * @author auto_generator
     */
    @RequestMapping(value = "/loanreview/wmscrerevwatermodelsave.do", method = { RequestMethod.POST })
    @ResponseBody
    public String doSave(HttpServletRequest request, WmsCreRevWaterModel bean)
    {
        String result = "";
        HttpSession session = request.getSession();
        UserBean user = (UserBean) session.getAttribute(GlobalVal.USER_SESSION);
        try
        {
            result = wmscrerevwatermodelService.save(bean, user);
        }
        catch (Exception e)
        {
            log.error(e.getMessage());
            result = "error";
        }
        /*
         * // record log if("success".equals(result)){ String msg =
         * "log content"; SysTools.saveLog(request, msg); // record log method }
         */
        return result;
    }

    /**
     * Description :update method
     * 
     * @param bean
     * @return "success" or "error" or user defined
     * @author auto_generator
     */
    @RequestMapping(value = "/loanreview/wmscrerevwatermodelupdate.do", method = { RequestMethod.POST })
    @ResponseBody
    public String doUpdate(HttpServletRequest request, WmsCreRevWaterModel bean)
    {
        String result = "";
        HttpSession session = request.getSession();
        UserBean user = (UserBean) session.getAttribute(GlobalVal.USER_SESSION);
        try
        {
            result = wmscrerevwatermodelService.update(bean, user);
        }
        catch (Exception e)
        {
            log.error(e.getMessage());
            result = "error";
        }
        /*
         * // record log if("success".equals(result)){ String msg =
         * "log content"; SysTools.saveLog(request, msg); // record log method }
         */
        return result;
    }
}