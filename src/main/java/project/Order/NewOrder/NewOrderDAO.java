package project.Order.NewOrder;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import project.Order.OrderDTO;

@Repository
public interface NewOrderDAO extends JpaRepository<OrderDTO, Long>{
    
}
