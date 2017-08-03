package com.zx.emanage.cremanage.web;

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

import com.zx.emanage.cremanage.service.IWmsCreHousingCreditConfirmService;
import com.zx.emanage.util.gen.entity.WmsCreHousingCreditConfirm;
import com.zx.emanage.cremanage.vo.WmsCreHousingCreditConfirmSearchBeanVO;
import com.zx.sframe.util.GlobalVal;
import com.zx.sframe.util.vo.UserBean;

/*
 * @version 2.0
 * @author
 */

@Controller
public class WmsCreHousingCreditConfirmController {
	private static Logger log = LoggerFactory.getLogger(WmsCreHousingCreditConfirmController.class);
	
	@Autowired
	private IWmsCreHousingCreditConfirmService wmscrehousingcreditconfirmService;

	/**
	 * Description :get record list records by vo queryInfo withnot paging
	 * @param queryInfo
	 * @return record list
	 * @author auto_generator
	 */
	@RequestMapping(value = "/cremanage/wmscrehousingcreditconfirmwithoutpaginglist.do", method = {RequestMethod.GET, RequestMethod.POST})
	@ResponseBody
	public Map<String, Object> getListWithoutPaging(WmsCreHousingCreditConfirmSearchBeanVO queryInfo) {
		return wmscrehousingcreditconfirmService.getListWithoutPaging(queryInfo);
	}

	/**
	 * Description :get record list records by vo queryInfo with paging
	 * @param queryInfo
	 * @return record list
	 * @author auto_generator
	 */
	@RequestMapping(value = "/cremanage/wmscrehousingcreditconfirmwithpaginglist.do", method = {RequestMethod.GET, RequestMethod.POST})
	@ResponseBody
	public Map<String, Object> getListWithPaging(WmsCreHousingCreditConfirmSearchBeanVO queryInfo) {
		return wmscrehousingcreditconfirmService.getListWithPaging(queryInfo);
	}
	
	/**
	 * Description :get single-table information by primary key 
	 * @param primary key 
	 * @return WmsCreHousingCreditConfirmVO
	 * @author auto_generator
	 */	
	@RequestMapping(value = "/cremanage/wmscrehousingcreditconfirminfobypk.do", method = {RequestMethod.GET})
	@ResponseBody
	public WmsCreHousingCreditConfirm getInfoByPK(Integer wms_cre_housing_credit_confirm_id) {
		return wmscrehousingcreditconfirmService.getInfoByPK(wms_cre_housing_credit_confirm_id);
	}	

	/**
	 * Description :add method
	 * @param bean
	 * @return "success" or "error" or user defined
	 * @author auto_generator
	 */	
	@RequestMapping(value = "/cremanage/wmscrehousingcreditconfirmsave.do", method = {RequestMethod.POST})
	@ResponseBody
	public String doSave(HttpServletRequest request, WmsCreHousingCreditConfirm bean) {
		String result = "";
		HttpSession session = request.getSession();
		UserBean user = (UserBean)session.getAttribute(GlobalVal.USER_SESSION);
		try {
			result = wmscrehousingcreditconfirmService.save(bean, user);
		} catch (Exception e) {
			log.error(e.getMessage());
			result = "error";
		}
		/*
		// record log	
		if("success".equals(result)){
			String msg = "log content";
			SysTools.saveLog(request, msg); // record log method
		}
		*/
		return result;
	}

	/**
	 * Description :update method
	 * @param bean
	 * @return "success" or "error" or user defined
	 * @author auto_generator
	 */	
	@RequestMapping(value = "/cremanage/wmscrehousingcreditconfirmupdate.do", method = {RequestMethod.POST})
	@ResponseBody
	public String doUpdate(HttpServletRequest request, WmsCreHousingCreditConfirm bean) {
		String result = "";
		HttpSession session = request.getSession();
		UserBean user = (UserBean)session.getAttribute(GlobalVal.USER_SESSION);
		try {
			result = wmscrehousingcreditconfirmService.update(bean, user);
		} catch (Exception e) {
			log.error(e.getMessage());
			result = "error";
		}
		/*			
		// record log	
		if("success".equals(result)){
			String msg = "log content";
			SysTools.saveLog(request, msg); // record log method
		}
		*/
		return result;
	}	
}