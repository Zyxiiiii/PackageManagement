package com.zuobiaoxi.dao;

import com.zuobiaoxi.entity.Package;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Package)表数据库访问层
 *
 * @author zuobiaoxi
 * @since 2022-07-08 09:51:37
 */
public interface PackageDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Package queryById(String id);

    /**
     * 统计总行数
     *
     * @param packageName 查询条件
     * @return 总行数
     */
    long count(Package packageName);

    /**
     * 新增数据
     *
     * @param packageName 实例对象
     * @return 影响行数
     */
    int insert(Package packageName);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Package> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Package> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Package> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Package> entities);

    /**
     * 修改数据
     *
     * @param packageName 实例对象
     * @return 影响行数
     */
    int update(Package packageName);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(String id);

}

