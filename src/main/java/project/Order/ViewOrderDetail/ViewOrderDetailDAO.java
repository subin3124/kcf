package project.Order.ViewOrderDetail;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import project.Order.OrderDTO;

@Repository 
public interface ViewOrderDetailDAO extends JpaRepository<OrderDTO, Long>{
    OrderDTO findOrderDTOById(Long id);
}
