package com.zx.emanage.loancheck.web;

import java.util.List;
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

import com.zx.emanage.cremanage.service.IWmsCreditWorkFlowService;
import com.zx.emanage.cremanage.vo.WmsCreditWorkFlowVO;
import com.zx.emanage.loancheck.service.IWmsCreCreditLineApplicantService;
import com.zx.emanage.loancheck.vo.WmsCreCreditLineApplicantSearchBeanVO;
import com.zx.emanage.util.gen.SysTools;
import com.zx.emanage.util.gen.entity.WmsCreCreditLineApplicant;
import com.zx.sframe.util.GlobalVal;
import com.zx.sframe.util.vo.UserBean;

/*
 * @version 2.0
 * @author
 */

@Controller
public class WmsCreCreditLineApplicantController
{
    private static Logger log = LoggerFactory.getLogger(WmsCreCreditLineApplicantController.class);

    @Autowired
    private IWmsCreCreditLineApplicantService wmscrecreditlineapplicantService;

    /**
     * Description :get record list records by vo queryInfo withnot paging
     * 
     * @param queryInfo
     * @return record list
     * @author auto_generator
     */
    @RequestMapping(value = "/loancheck/wmscrecreditlineapplicantwithoutpaginglist.do", method = { RequestMethod.GET,
                                                                                                  RequestMethod.POST })
    @ResponseBody
    public Map<String, Object> getListWithoutPaging(WmsCreCreditLineApplicantSearchBeanVO queryInfo)
    {
        return wmscrecreditlineapplicantService.getListWithoutPaging(queryInfo);
    }

    /**
     * Description :get record list records by vo queryInfo with paging
     * 
     * @param queryInfo
     * @return record list
     * @author auto_generator
     */
    @RequestMapping(value = "/loancheck/wmscrecreditlineapplicantwithpaginglist.do", method = { RequestMethod.GET,
                                                                                               RequestMethod.POST })
    @ResponseBody
    public Map<String, Object> getListWithPaging(WmsCreCreditLineApplicantSearchBeanVO queryInfo)
    {
        return wmscrecreditlineapplicantService.getListWithPaging(queryInfo);
    }

    /**
     * Description :get single-table information by primary key
     * 
     * @param primary key
     * @return WmsCreCreditLineApplicantVO
     * @author auto_generator
     */
    @RequestMapping(value = "/loancheck/wmscrecreditlineapplicantinfobypk.do", method = { RequestMethod.GET })
    @ResponseBody
    public WmsCreCreditLineApplicant getInfoByPK(Integer wms_cre_credit_line_applicant_id)
    {
        return wmscrecreditlineapplicantService.getInfoByPK(wms_cre_credit_line_applicant_id);
    }

    /**
     * Description :add method
     * 
     * @param bean
     * @return "success" or "error" or user defined
     * @author wangyishun
     */
    @RequestMapping(value = "/loancheck/wmscrecreditlineapplicantsave.do", method = { RequestMethod.POST })
    @ResponseBody
    public String doSave(HttpServletRequest request, WmsCreCreditLineApplicant bean, String houseStr, String carStr,
                         WmsCreditWorkFlowVO approveWorkFlowVO)
    {
        String result = "";
        HttpSession session = request.getSession();
        UserBean user = (UserBean) session.getAttribute(GlobalVal.USER_SESSION);
        try
        {
            result = wmscrecreditlineapplicantService.save(bean, houseStr, carStr, approveWorkFlowVO, user);
        }
        catch (Exception e)
        {
            log.error(e.getMessage());
            result = "error";
        }
        if ("success".equals(result))
        {
            String msg = "贷前管理-证信审核组-审批";
            SysTools.saveLog(request, msg); // record log method
        }

        return result;
    }

    /**
     * Description :add method
     * 
     * @param bean
     * @return "success" or "error" or user defined
     * @author wangyishun
     */
    @RequestMapping(value = "/loancheck/wmscrecreditlineapplicantsaveforadd.do", method = { RequestMethod.POST })
    @ResponseBody
    public String doSaveForAdd(HttpServletRequest request, String fileArr, WmsCreditWorkFlowVO approveWorkFlowVO)
    {
        String result = "";
        HttpSession session = request.getSession();
        UserBean user = (UserBean) session.getAttribute(GlobalVal.USER_SESSION);
        try
        {
            result = wmscrecreditlineapplicantService.saveForAdd(fileArr, approveWorkFlowVO, user);
        }
        catch (Exception e)
        {
            log.error(e.getMessage());
            result = "error";
        }
        if ("success".equals(result))
        {
            String msg = "贷前管理-征信审核组-审批";
            SysTools.saveLog(request, msg); // record log method
        }

        return result;
    }

    /**
     * Description :update method
     * 
     * @param bean
     * @return "success" or "error" or user defined
     * @author auto_generator
     */
    @RequestMapping(value = "/loancheck/wmscrecreditlineapplicantupdate.do", method = { RequestMethod.POST })
    @ResponseBody
    public String doUpdate(HttpServletRequest request, WmsCreCreditLineApplicant bean)
    {
        String result = "";
        HttpSession session = request.getSession();
        UserBean user = (UserBean) session.getAttribute(GlobalVal.USER_SESSION);
        try
        {
            result = wmscrecreditlineapplicantService.update(bean, user);
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
     * Description :get single-table information by primary key
     * 
     * @param primary key
     * @return WmsCreCreditLineApplicantVO
     * @author wangyishun
     */
    @RequestMapping(value = "/loancheck/wmscrecreditlineapplicantinfobyfk.do", method = { RequestMethod.GET })
    @ResponseBody
    public WmsCreCreditLineApplicant getInfoByFK(Integer wms_cre_credit_head_id)
    {
        return wmscrecreditlineapplicantService.getInfoByFK(wms_cre_credit_head_id);
    }

    /**
     * 实现上传文件读取显示功能
     * 
     * @param queryInfo
     * @return record list
     * @author wangyishun
     */
    @RequestMapping(value = "/loancheck/getfilelist.do", method = { RequestMethod.GET, RequestMethod.POST })
    @ResponseBody
    public List<Map<String, Object>> getFileList(Integer wms_cre_credit_head_id, String data_type)
    {
        return wmscrecreditlineapplicantService.getFileList(wms_cre_credit_head_id, data_type);
    }

}