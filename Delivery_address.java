package pojos;

import javax.persistence.*;

@Entity
@Table(name="delivery_address")
public class Delivery_address extends BaseEntity{
	@Column(length = 50,nullable = false)
	private String adress_Line1;
	@Column(length = 50,nullable = false)
	private String adress_Line2;
	@Column(length = 50,nullable = false)
	private String city;
	@Column(length = 50,nullable = false)
	private String state;
	@Column(length = 50,nullable = false)
	private String zip_Code;
	@OneToOne
	@JoinColumn(name="order_id")
	private Orders orderInfo;
	
	public Delivery_address() {
		super();
		System.out.println("in ctor "+getClass().getName());
	}

	public Delivery_address(String adress_Line1, String adress_Line2, String city, String state, String zip_Code,
			Orders orderInfo) {
		super();
		this.adress_Line1 = adress_Line1;
		this.adress_Line2 = adress_Line2;
		this.city = city;
		this.state = state;
		this.zip_Code = zip_Code;
		this.orderInfo = orderInfo;
	}

	public String getAdress_Line1() {
		return adress_Line1;
	}

	public void setAdress_Line1(String adress_Line1) {
		this.adress_Line1 = adress_Line1;
	}

	public String getAdress_Line2() {
		return adress_Line2;
	}

	public void setAdress_Line2(String adress_Line2) {
		this.adress_Line2 = adress_Line2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip_Code() {
		return zip_Code;
	}

	public void setZip_Code(String zip_Code) {
		this.zip_Code = zip_Code;
	}

	public Orders getOrderInfo() {
		return orderInfo;
	}

	public void setOrderInfo(Orders orderInfo) {
		this.orderInfo = orderInfo;
	}

	@Override
	public String toString() {
		return "Delivery_address [adress_Line1=" + adress_Line1 + ", adress_Line2=" + adress_Line2 + ", city=" + city
				+ ", state=" + state + ", zip_Code=" + zip_Code + ", orderInfo=" + orderInfo + ", getId()=" + getId()
				+ "]";
	}
	
	
	

}
