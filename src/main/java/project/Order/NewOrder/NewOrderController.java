package project.Order.NewOrder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import project.Order.OrderDTO;

@RestController
@RequestMapping("Order/new")
public class NewOrderController {
    
    @Autowired
    NewOrderService newOrderService;
    
    @PostMapping("/")
    private int NewOrderPost(@RequestBody OrderDTO orderDTO){
        return newOrderService.NewOrder(orderDTO);
    }
    
}
