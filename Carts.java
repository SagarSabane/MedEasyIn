package pojos;

import java.time.LocalDate;

import javax.persistence.*;

@Entity
@Table(name = "carts")
public class Carts extends BaseEntity{
	@Column(name="created_on")
	private LocalDate createdOn;
	@Column(name="updated_on")
	private LocalDate updatedOn;
	@Column(name="total_items")
	private int totalItems;
	@Column(name="total_cart_price")
	private double totalCartPrice;
	@OneToOne
	@JoinColumn(name="user_id")
	private Users user;

	public Carts() {
		super();
	}

	public Carts(LocalDate createdOn, LocalDate updatedOn, int totalItems, double totalCartPrice, Users user) {
		super();
		this.createdOn = createdOn;
		this.updatedOn = updatedOn;
		this.totalItems = totalItems;
		this.totalCartPrice = totalCartPrice;
		this.user = user;
	}

	public LocalDate getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(LocalDate createdOn) {
		this.createdOn = createdOn;
	}

	public LocalDate getUpdatedOn() {
		return updatedOn;
	}

	public void setUpdatedOn(LocalDate updatedOn) {
		this.updatedOn = updatedOn;
	}

	public int getTotalItems() {
		return totalItems;
	}

	public void setTotalItems(int totalItems) {
		this.totalItems = totalItems;
	}

	public double getTotalCartPrice() {
		return totalCartPrice;
	}

	public void setTotalCartPrice(double totalCartPrice) {
		this.totalCartPrice = totalCartPrice;
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}
	
	
	
}
