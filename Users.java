package pojos;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "users_tbl")
public class Users extends BaseEntity{
	@Column(name="first_name" ,length = 25)
	private String firstName;
	@Column(name="last_name" ,length = 25)
	private String lastName;
	@Column(name="email" ,length = 50,unique = true,nullable = false)
	private String email;
	@Column(name="password" ,length = 25,nullable = false)
	private String password;
	@Enumerated(EnumType.STRING)
	@Column(name="role" ,length = 15)
	private Role role;
	@Column(length=10,unique = true,nullable = false)
	private Long mobile_number;
	
	
	public Users() {
		super();
		System.out.println("in ctor "+getClass().getName());
	}


	public Users(String firstName, String lastName, String email, String password, Role role, Long mobile_number) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.role = role;
		this.mobile_number = mobile_number;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public Role getRole() {
		return role;
	}


	public void setRole(Role role) {
		this.role = role;
	}


	public Long getMobile_number() {
		return mobile_number;
	}


	public void setMobile_number(Long mobile_number) {
		this.mobile_number = mobile_number;
	}


	@Override
	public String toString() {
		return "Users [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", password="
				+ password + ", role=" + role + ", mobile_number=" + mobile_number + ", getId()=" + getId() + "]";
	}
	
	
	
	
	

}
