package com.zx.emanage.inve.service;

import java.util.Map;
import java.util.List;

import com.zx.emanage.util.gen.entity.WmsInveCommissionPersonnelReward;
import com.zx.emanage.inve.vo.WmsInveCommissionPersonnelRewardSearchBeanVO;
import com.zx.sframe.util.vo.UserBean;

/*
 * @version 2.0
 */

public interface IWmsInveCommissionPersonnelRewardService {
	/**
	 * Description :get record list records by vo queryInfo withnot paging
	 * @param queryInfo
	 * @return record list
	 * @author auto_generator
	 */
	public Map<String, Object> getListWithoutPaging(WmsInveCommissionPersonnelRewardSearchBeanVO queryInfo);
	
	/**
	 * Description :get record list records by vo queryInfo with paging
	 * @param queryInfo
	 * @return record list
	 * @author auto_generator
	 */
	public Map<String, Object> getListWithPaging(WmsInveCommissionPersonnelRewardSearchBeanVO queryInfo);
	
	/**
	 * Description :get single-table information by primary key 
	 * @param primary key 
	 * @return WmsInveCommissionPersonnelRewardVO
	 * @author auto_generator
	 */	
	public WmsInveCommissionPersonnelReward getInfoByPK(Integer wms_inve_commission_personnel_reward_id);	
	
	/**
	 * Description :add method
	 * @param bean
	 * @return "success" or "error" or user defined
	 * @author auto_generator
	 */
	public String save(WmsInveCommissionPersonnelReward bean, UserBean user);
	
	/**
	 * Description :update method
	 * @param bean contains pk at least
	 * @return "success" or "error" or user defined
	 * @author auto_generator
	 */
	public String update(WmsInveCommissionPersonnelReward bean, UserBean user);
}