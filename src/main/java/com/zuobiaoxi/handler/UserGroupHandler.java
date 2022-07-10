package com.zuobiaoxi.handler;

import com.zuobiaoxi.dao.UserGroupDao;
import com.zuobiaoxi.entity.UserGroup;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 * @author zuobiaoxi
 */
@Component
public class UserGroupHandler extends BaseTypeHandler<UserGroup> {
    @Resource
    private UserGroupDao userGroupDao;

    @Resource
    private UserGroup userGroup;
    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, UserGroup parameter, JdbcType jdbcType) throws SQLException {
        switch (i){
            case 1:
                ps.setString(i, parameter.getId());
                break;
            case 2:
                ps.setString(i, parameter.getGroupName());
                break;
            case 3:
                ps.setString(i, parameter.getPrivilege());
                break;
            default:
                break;
        }
    }

    /**
     * Gets the nullable result.
     *
     * @param rs         the rs
     * @param columnName Column name, when configuration <code>useColumnLabel</code> is <code>false</code>
     * @return the nullable result
     * @throws SQLException the SQL exception
     */
    @Override
    public UserGroup getNullableResult(ResultSet rs, String columnName) throws SQLException {
        return userGroupDao.queryById(rs.getString(columnName));
    }

    @Override
    public UserGroup getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        switch (columnIndex){
            case 1:
                userGroup.setId(rs.getString(columnIndex));
                break;
            case 2:
                userGroup.setGroupName(rs.getString(columnIndex));
                break;
            case 3:
                userGroup.setPrivilege(rs.getString(columnIndex));
                break;
            default:
                break;
        }
        return userGroup;
    }

    @Override
    public UserGroup getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        switch (columnIndex){
            case 1:
                userGroup.setId(cs.getString(columnIndex));
                break;
            case 2:
                userGroup.setGroupName(cs.getString(columnIndex));
                break;
            case 3:
                userGroup.setPrivilege(cs.getString(columnIndex));
                break;
            default:
                break;
        }
        return userGroup;
    }
}
