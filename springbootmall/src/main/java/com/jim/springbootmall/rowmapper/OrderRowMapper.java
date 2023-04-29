package com.jim.springbootmall.rowmapper;

import com.jim.springbootmall.product.Order;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class OrderRowMapper implements RowMapper<Order> {
    @Override
    public Order mapRow(ResultSet rs, int rowNum) throws SQLException {
        Order order = new Order();
        order.setOrderId(rs.getInt("order_id"));
        order.setUserId(rs.getInt("user_id"));
        order.setTotalamount(rs.getInt("total_amount"));
        order.setCreateDate(rs.getTimestamp("created_date"));
        order.setLastModifiedDat(rs.getTimestamp("last_modified_date"));

        return order;
    }
}
