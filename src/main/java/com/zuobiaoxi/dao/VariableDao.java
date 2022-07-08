package com.zuobiaoxi.dao;

import com.zuobiaoxi.entity.Variable;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Variable)表数据库访问层
 *
 * @author zuobiaoxi
 * @since 2022-07-08 09:51:38
 */
public interface VariableDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Variable queryById(String id);

    /**
     * 统计总行数
     *
     * @param variable 查询条件
     * @return 总行数
     */
    long count(Variable variable);

    /**
     * 新增数据
     *
     * @param variable 实例对象
     * @return 影响行数
     */
    int insert(Variable variable);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Variable> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Variable> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Variable> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Variable> entities);

    /**
     * 修改数据
     *
     * @param variable 实例对象
     * @return 影响行数
     */
    int update(Variable variable);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(String id);

}

