package _gui.respository;
import _gui.JDBCConnector;
import _gui.entity.OrderEntity;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Connection;

public class OrderRepository {
    ArrayList<OrderEntity> orderList = new ArrayList<OrderEntity>();

    public ArrayList<OrderEntity> getOrderList(String searchWord){
        Connection con = JDBCConnector.getConnection();
        if (con == null) {
            System.out.println("데이터베이스 연결에 실패했습니다.");
            return orderList;
        }

        String sql = "select 주문번호, 고객이름, 제품명, 수량, 배송지, 주문일자 from 주문 o, 고객 c, 제품 p " +
                " where o.주문고객 = c.고객아이디 and o.주문제품 = p.제품번호 and c.고객이름 LIKE ?";
        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setString(1, "%" + searchWord + "%"); // 동적 매개변수 설정
            try (ResultSet rs = pstmt.executeQuery()) {
                while (rs.next()) {
                    OrderEntity orderEntity = new OrderEntity();
                    orderEntity.setOrderNum(rs.getString("주문번호"));
                    orderEntity.setCustomerName(rs.getString("고객이름"));
                    orderEntity.setProductName(rs.getString("제품명"));
                    orderEntity.setAmount(rs.getInt("수량"));
                    orderEntity.setDestination(rs.getString("배송지"));
                    orderEntity.setOrderDate(rs.getTimestamp("주문일자"));
                    orderList.add(orderEntity);
                }
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return orderList;
    }
}