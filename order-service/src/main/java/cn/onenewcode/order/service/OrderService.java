package cn.onenewcode.order.service;

import cn.onenewcode.order.mapper.OrderMapper;
import cn.onenewcode.order.pojo.Order;
import cn.onenewcode.order.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class OrderService {

    @Autowired
    private OrderMapper orderMapper;
//    @Autowired
//    private RestTemplate restTemplate;

    public Order queryOrderById(Long orderId) {
        // 1.查询订单
        Order order = orderMapper.findById(orderId);
//        远程调用
        String url="http://localhost:8081/user/"+order.getUserId();
//        发起调用
//        User user=restTemplate.getForObject(url, User.class);
//        order.setUser(user);
        // 4.返回
        return order;
    }
}
