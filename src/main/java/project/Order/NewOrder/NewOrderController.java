package project.Order.NewOrder;

import java.util.Date;
import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import project.Order.OrderDTO;

@RestController
@RequestMapping("/Order/new")
public class NewOrderController {
    
    @Autowired
    NewOrderService newOrderService;
    
    @PostMapping("/")
    private int NewOrderPost(@RequestParam long company, @RequestParam long cost, @RequestParam int count,@RequestParam long custom, @RequestParam String userfk) {
        OrderDTO dto = new OrderDTO();
        dto.setCompanyfk(company);
        dto.setCost(cost);
        dto.setCount(count);
        dto.setCustomfk(custom);
        dto.setTimestamp(new Timestamp(System.currentTimeMillis()));
        dto.setUserfk(userfk);
        return newOrderService.NewOrder(dto);
    }
    
}
