package com.zuobiaoxi.dao;

import com.zuobiaoxi.entity.Class;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Class)表数据库访问层
 *
 * @author zuobiaoxi
 * @since 2022-07-08 09:51:36
 */
public interface ClassDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Class queryById(String id);

    /**
     * 统计总行数
     *
     * @param clazz 查询条件
     * @return 总行数
     */
    long count(Class clazz);

    /**
     * 新增数据
     *
     * @param clazz 实例对象
     * @return 影响行数
     */
    int insert(Class clazz);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Class> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Class> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Class> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Class> entities);

    /**
     * 修改数据
     *
     * @param clazz 实例对象
     * @return 影响行数
     */
    int update(Class clazz);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(String id);

}

