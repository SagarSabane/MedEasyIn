package pojos;

import java.time.LocalDate;

import javax.persistence.*;

@Entity
@Table(name="orders")
public class Orders extends BaseEntity{
	@Column(nullable = false)
	private LocalDate order_date;
	@Column(nullable = false)
	private LocalDate delivery_date;
	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private Status order_status;
	@Column(nullable = false)
	private double total_price;
	@Column
	private double shipping_price;
	@ManyToOne
	@JoinColumn(name = "user_id")
	private Users userOrdered;
	
	public Orders() {
		super();
		System.out.println("in ctor of"+getClass().getName());
	}

	public Orders(LocalDate order_date, LocalDate delivery_date, Status order_status, double total_price,
			double shipping_price, Users userOrdered) {
		super();
		this.order_date = order_date;
		this.delivery_date = delivery_date;
		this.order_status = order_status;
		this.total_price = total_price;
		this.shipping_price = shipping_price;
		this.userOrdered = userOrdered;
	}

	public LocalDate getOrder_date() {
		return order_date;
	}

	public void setOrder_date(LocalDate order_date) {
		this.order_date = order_date;
	}

	public LocalDate getDelivery_date() {
		return delivery_date;
	}

	public void setDelivery_date(LocalDate delivery_date) {
		this.delivery_date = delivery_date;
	}

	public Status getOrder_status() {
		return order_status;
	}

	public void setOrder_status(Status order_status) {
		this.order_status = order_status;
	}

	public double getTotal_price() {
		return total_price;
	}

	public void setTotal_price(double total_price) {
		this.total_price = total_price;
	}

	public double getShipping_price() {
		return shipping_price;
	}

	public void setShipping_price(double shipping_price) {
		this.shipping_price = shipping_price;
	}

	public Users getUserOrdered() {
		return userOrdered;
	}

	public void setUserOrdered(Users userOrdered) {
		this.userOrdered = userOrdered;
	}

	@Override
	public String toString() {
		return "Orders [order_date=" + order_date + ", delivery_date=" + delivery_date + ", order_status="
				+ order_status + ", total_price=" + total_price + ", shipping_price=" + shipping_price
				+ ", userOrdered=" + userOrdered + ", getId()=" + getId() + "]";
	}
	
	
	
	
}
