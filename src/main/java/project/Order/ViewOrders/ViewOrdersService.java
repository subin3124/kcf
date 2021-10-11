package project.Order.ViewOrders;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.Order.OrderDTO;

@Service
public class ViewOrdersService {
    
    @Autowired
    ViewOrderDAO viewOrderDAO;
    
    public List<OrderDTO> GetOrderList(String userfk){
        return viewOrderDAO.findOrderDTOsByUserfk(userfk);
    }
}
