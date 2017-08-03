package com.zx.emanage.inve.web;

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

import com.zx.emanage.inve.service.IWmsInveTransaCusConfirmService;
import com.zx.emanage.util.gen.entity.WmsInveTransaCusConfirm;
import com.zx.emanage.inve.vo.WmsInveTransaCusConfirmSearchBeanVO;
import com.zx.sframe.util.GlobalVal;
import com.zx.sframe.util.vo.UserBean;

/*
 * @version 2.0
 * @author
 */

@Controller
public class WmsInveTransaCusConfirmController {
	private static Logger log = LoggerFactory.getLogger(WmsInveTransaCusConfirmController.class);
	
	@Autowired
	private IWmsInveTransaCusConfirmService wmsinvetransacusconfirmService;

	/**
	 * Description :get record list records by vo queryInfo withnot paging
	 * @param queryInfo
	 * @return record list
	 * @author auto_generator
	 */
	@RequestMapping(value = "/inve/wmsinvetransacusconfirmwithoutpaginglist.do", method = {RequestMethod.GET, RequestMethod.POST})
	@ResponseBody
	public Map<String, Object> getListWithoutPaging(WmsInveTransaCusConfirmSearchBeanVO queryInfo) {
		return wmsinvetransacusconfirmService.getListWithoutPaging(queryInfo);
	}

	/**
	 * Description :get record list records by vo queryInfo with paging
	 * @param queryInfo
	 * @return record list
	 * @author auto_generator
	 */
	@RequestMapping(value = "/inve/wmsinvetransacusconfirmwithpaginglist.do", method = {RequestMethod.GET, RequestMethod.POST})
	@ResponseBody
	public Map<String, Object> getListWithPaging(WmsInveTransaCusConfirmSearchBeanVO queryInfo) {
		return wmsinvetransacusconfirmService.getListWithPaging(queryInfo);
	}
	
	/**
	 * Description :get single-table information by primary key 
	 * @param primary key 
	 * @return WmsInveTransaCusConfirmVO
	 * @author auto_generator
	 */	
	@RequestMapping(value = "/inve/wmsinvetransacusconfirminfobypk.do", method = {RequestMethod.GET})
	@ResponseBody
	public WmsInveTransaCusConfirm getInfoByPK(Integer wms_inve_transa_cus_confirm_id) {
		return wmsinvetransacusconfirmService.getInfoByPK(wms_inve_transa_cus_confirm_id);
	}	

	/**
	 * Description :add method
	 * @param bean
	 * @return "success" or "error" or user defined
	 * @author auto_generator
	 */	
	@RequestMapping(value = "/inve/wmsinvetransacusconfirmsave.do", method = {RequestMethod.POST})
	@ResponseBody
	public String doSave(HttpServletRequest request, WmsInveTransaCusConfirm bean) {
		String result = "";
		HttpSession session = request.getSession();
		UserBean user = (UserBean)session.getAttribute(GlobalVal.USER_SESSION);
		try {
			result = wmsinvetransacusconfirmService.save(bean, user);
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
	@RequestMapping(value = "/inve/wmsinvetransacusconfirmupdate.do", method = {RequestMethod.POST})
	@ResponseBody
	public String doUpdate(HttpServletRequest request, WmsInveTransaCusConfirm bean) {
		String result = "";
		HttpSession session = request.getSession();
		UserBean user = (UserBean)session.getAttribute(GlobalVal.USER_SESSION);
		try {
			result = wmsinvetransacusconfirmService.update(bean, user);
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