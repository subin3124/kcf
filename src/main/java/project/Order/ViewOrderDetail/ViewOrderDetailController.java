package project.Order.ViewOrderDetail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import project.Order.OrderDTO;

@RestController
@RequestMapping("/Order/Details")
public class ViewOrderDetailController {
    
    @Autowired
    ViewOrderDetailService viewOrderDetailService;
    
    @GetMapping("/{idx}")
    private OrderDTO GetOrderDetail(@PathVariable("idx") long idx){
        return viewOrderDetailService.GetOrderDetail(idx);
        
    }
}
