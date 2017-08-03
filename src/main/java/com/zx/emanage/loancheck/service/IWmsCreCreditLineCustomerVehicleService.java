package com.zx.emanage.loancheck.service;

import java.util.Map;
import java.util.List;

import com.zx.emanage.loancheck.vo.WmsCreCreditLineCustomerVehicleSearchBeanVO;
import com.zx.emanage.util.gen.entity.WmsCreCreditLineCustomerVehicle;
import com.zx.sframe.util.vo.UserBean;

/*
 * @version 2.0
 */

public interface IWmsCreCreditLineCustomerVehicleService
{
    /**
     * Description :get record list records by vo queryInfo withnot paging
     * 
     * @param queryInfo
     * @return record list
     * @author auto_generator
     */
    public Map<String, Object> getListWithoutPaging(WmsCreCreditLineCustomerVehicleSearchBeanVO queryInfo);

    /**
     * Description :get record list records by vo queryInfo with paging
     * 
     * @param queryInfo
     * @return record list
     * @author auto_generator
     */
    public Map<String, Object> getListWithPaging(WmsCreCreditLineCustomerVehicleSearchBeanVO queryInfo);

    /**
     * Description :get single-table information by primary key
     * 
     * @param primary key
     * @return WmsCreCreditLineCustomerVehicleVO
     * @author auto_generator
     */
    public WmsCreCreditLineCustomerVehicle getInfoByPK(Integer wms_cre_credit_line_customer_vehicle_id);

    /**
     * Description :add method
     * 
     * @param bean
     * @return "success" or "error" or user defined
     * @author auto_generator
     */
    public String save(WmsCreCreditLineCustomerVehicle bean, UserBean user);

    /**
     * Description :update method
     * 
     * @param bean contains pk at least
     * @return "success" or "error" or user defined
     * @author auto_generator
     */
    public String update(WmsCreCreditLineCustomerVehicle bean, UserBean user);

    /**
     * Description :get record list records by vo queryInfo withnot paging
     * 
     * @param queryInfo
     * @return record list
     * @author auto_generator
     */
    public Map<String, Object> getListByFKWithoutPaging(Integer wms_cre_credit_head_id);

}