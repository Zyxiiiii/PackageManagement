package com.zuobiaoxi.dao;

import com.zuobiaoxi.entity.UserGroup;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (UserGroup)表数据库访问层
 *
 * @author zuobiaoxi
 * @since 2022-07-08 09:51:38
 */
public interface UserGroupDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    UserGroup queryById(String id);


    /**
     * query obj by condition
     *
     * @param data the effect payload
     * @param condition the condition
     * @return the instance of UserGroup
     */
    UserGroup queryByCondition(String data, String condition);

    /**
     * 统计总行数
     *
     * @param userGroup 查询条件
     * @return 总行数
     */
    long count(UserGroup userGroup);

    /**
     * 新增数据
     *
     * @param userGroup 实例对象
     * @return 影响行数
     */
    int insert(UserGroup userGroup);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<UserGroup> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<UserGroup> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<UserGroup> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<UserGroup> entities);

    /**
     * 修改数据
     *
     * @param userGroup 实例对象
     * @return 影响行数
     */
    int update(UserGroup userGroup);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(String id);

}

