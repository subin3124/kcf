package project.Order.ViewOrders;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import project.Order.OrderDTO;

@Repository
public interface ViewOrderDAO extends JpaRepository<OrderDTO, Long>{
    List<OrderDTO> findOrderDTOsByUserfk(String userfk);
}
