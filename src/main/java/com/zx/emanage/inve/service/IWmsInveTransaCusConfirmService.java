package com.zx.emanage.inve.service;

import java.util.Map;
import java.util.List;

import com.zx.emanage.util.gen.entity.WmsInveTransaCusConfirm;
import com.zx.emanage.inve.vo.WmsInveTransaCusConfirmSearchBeanVO;
import com.zx.sframe.util.vo.UserBean;

/*
 * @version 2.0
 */

public interface IWmsInveTransaCusConfirmService {
	/**
	 * Description :get record list records by vo queryInfo withnot paging
	 * @param queryInfo
	 * @return record list
	 * @author auto_generator
	 */
	public Map<String, Object> getListWithoutPaging(WmsInveTransaCusConfirmSearchBeanVO queryInfo);
	
	/**
	 * Description :get record list records by vo queryInfo with paging
	 * @param queryInfo
	 * @return record list
	 * @author auto_generator
	 */
	public Map<String, Object> getListWithPaging(WmsInveTransaCusConfirmSearchBeanVO queryInfo);
	
	/**
	 * Description :get single-table information by primary key 
	 * @param primary key 
	 * @return WmsInveTransaCusConfirmVO
	 * @author auto_generator
	 */	
	public WmsInveTransaCusConfirm getInfoByPK(Integer wms_inve_transa_cus_confirm_id);	
	
	/**
	 * Description :add method
	 * @param bean
	 * @return "success" or "error" or user defined
	 * @author auto_generator
	 */
	public String save(WmsInveTransaCusConfirm bean, UserBean user);
	
	/**
	 * Description :update method
	 * @param bean contains pk at least
	 * @return "success" or "error" or user defined
	 * @author auto_generator
	 */
	public String update(WmsInveTransaCusConfirm bean, UserBean user);
}