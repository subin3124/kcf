package project.Order.ViewOrderDetail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.Order.OrderDTO;

@Service
public class ViewOrderDetailService {
    
    @Autowired
    ViewOrderDetailDAO viewOrderDetailDAO;
    
    public OrderDTO GetOrderDetail(Long id){
        return viewOrderDetailDAO.findOrderDTOById(id);
    }
}
