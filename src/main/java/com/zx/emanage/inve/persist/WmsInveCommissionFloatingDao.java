package com.zx.emanage.inve.persist;

import java.util.List;
import java.util.Map;

import com.zx.sframe.util.mybatis.MyBatisRepository;
import com.zx.sframe.util.mybatis.BaseDao;
import com.zx.emanage.util.gen.entity.WmsInveCommissionFloating;

@MyBatisRepository
public interface WmsInveCommissionFloatingDao extends BaseDao<WmsInveCommissionFloating> {
	/**
	 * 根据一般佣金规则主表主键获取浮动工资内容
	 * @return list
	 */
	List<Map<String ,Object>> getListByid(Integer wms_inve_commission_general_rules_id);
	
	/**
	 * 根据主表id删除对应的浮动信息 
	 * @return int
	 */
	int deletebykey(Integer wms_inve_commission_general_rules_id);
	
}