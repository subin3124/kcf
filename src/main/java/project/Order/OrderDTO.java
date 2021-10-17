package project.Order;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Table(name = "order")
@Entity
public class OrderDTO {
    
    @Id
    @Column(name = "order_pk")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    @Column(name = "order_user_fk")
    private String userfk;
    
    @Column(name = "order_company_fk")
    private long companyfk;
    
    @Column(name = "order_custom_fk")
    private long customfk;
    
    @Column(name = "order_count")
    private int count;
    
    @Column(name = "order_cost")
    private long cost;
    
    @Column(name = "order_timestamp")
    private Timestamp timestamp;

    @Column(name = "order_status")
    private String orderStatus;
    @Column(name = "greenpara_result")
    private String greenresult;

    /**
 * @param userfk the userfk to set
 */
public void setUserfk(String userfk) {
	this.userfk = userfk;
}
    /**
 * @return the userfk
 */
public String getUserfk() {
	return userfk;
}
    /**
 * @param timestamp the timestamp to set
 */
public void setTimestamp(Timestamp timestamp) {
	this.timestamp = timestamp;
}
    /**
 * @return the timestamp
 */
public Timestamp getTimestamp() {
	return timestamp;
}
    /**
 * @param id the id to set
 */
public void setId(long id) {
	this.id = id;
}
 /**
 * @return the id
 */
public long getId() {
	return id;
}
    /**
 * @param customfk the customfk to set
 */
public void setCustomfk(long customfk) {
	this.customfk = customfk;
}
    /**
 * @return the customfk
 */
public long getCustomfk() {
	return customfk;
}
    /**
 * @param count the count to set
 */
public void setCount(int count) {
	this.count = count;
}
    /**
 * @return the count
 */
public int getCount() {
	return count;
}
    /**
 * @param cost the cost to set
 */
public void setCost(long cost) {
	this.cost = cost;
}
    /**
 * @return the cost
 */
public long getCost() {
	return cost;
}
    /**
 * @param companyfk the companyfk to set
 */
public void setCompanyfk(long companyfk) {
	this.companyfk = companyfk;
}
    /**
 * @return the companyfk
 */
public long getCompanyfk() {
	return companyfk;
}

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getGreenresult() {
        return greenresult;
    }

    public void setGreenresult(String greenresult) {
        this.greenresult = greenresult;
    }
}
