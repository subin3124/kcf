package project.Order.ViewOrders;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import project.Order.OrderDTO;

@RestController
@RequestMapping("/Order/List")
public class ViewOrdersController {
    
    @Autowired
    ViewOrdersService viewOrdersService;
    
    @GetMapping("/{user}")
    private List<OrderDTO> GetOrderLists(@PathVariable("user") String user){
        return viewOrdersService.GetOrderList(user);
    }
}
