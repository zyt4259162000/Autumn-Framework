package com.autumnframework.cms.dao;

import com.autumnframework.cms.model.po.RolePlugin;

public interface RolePluginMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table af_role_plugin
     *
     * @mbg.generated Tue Oct 31 08:54:20 CST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table af_role_plugin
     *
     * @mbg.generated Tue Oct 31 08:54:20 CST 2017
     */
    int insert(RolePlugin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table af_role_plugin
     *
     * @mbg.generated Tue Oct 31 08:54:20 CST 2017
     */
    int insertSelective(RolePlugin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table af_role_plugin
     *
     * @mbg.generated Tue Oct 31 08:54:20 CST 2017
     */
    RolePlugin selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table af_role_plugin
     *
     * @mbg.generated Tue Oct 31 08:54:20 CST 2017
     */
    int updateByPrimaryKeySelective(RolePlugin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table af_role_plugin
     *
     * @mbg.generated Tue Oct 31 08:54:20 CST 2017
     */
    int updateByPrimaryKey(RolePlugin record);
}