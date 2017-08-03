package com.zx.emanage.cremanage.persist;

import java.util.List;
import java.util.Map;

import com.zx.emanage.util.gen.entity.WmsCreCustomerChangeLineCompany;
import com.zx.sframe.util.mybatis.BaseDao;
import com.zx.sframe.util.mybatis.MyBatisRepository;

/**
 * 
 * 版权所有：版权所有(C) 2016，卓信金控
 * 系统名称：财富管理平台
 * @ClassName: WmsCreCustomerChangeLineCompanyDao
 * 模块名称：客户变更公司信息
 * @Description: 内容摘要：
 * @author baisong
 * @date 2016年12月27日
 * @version V1.0
 * history:
 * 1、2016年12月27日 baisong 创建文件
 */
@MyBatisRepository
public interface WmsCreCustomerChangeLineCompanyDao extends BaseDao<WmsCreCustomerChangeLineCompany>
{

    void deleteByMap(Map<String, Object> map);

    /**
     * 
     * @Title: getCopyInfo
     * @Description: TODO(查询当前表的所有信息--用于复制)
     * @param wms_cre_credit_head_id
     * @return 
     * @author: baisong
     * @time:2016年12月23日 下午5:18:59
     * history:
     * 1、2016年12月23日 baisong 创建方法
     */
    List<WmsCreCustomerChangeLineCompany> getCopyInfo(Integer id);

    /**
     * @Title: saveBatch
     * @Description: TODO(批量保存) 
     * @author: baisong
     * @time:2016年12月26日 上午11:41:53
     * history:
     * 1、2016年12月26日 baisong 创建方法
    */
    void saveBatch(List<WmsCreCustomerChangeLineCompany> list);

}