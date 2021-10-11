package project.Order.NewOrder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.Order.OrderDTO;

@Service
public class NewOrderService {
    
    @Autowired
    NewOrderDAO newOrderDAO;
    
    public int NewOrder(OrderDTO orderdto){
        try{
        newOrderDAO.save(orderdto);
            return 200;
        }catch(Exception e){
            return 400;
        }
    }
}
