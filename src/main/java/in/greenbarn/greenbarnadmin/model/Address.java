package in.greenbarn.greenbarnadmin.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String addressLine1;
	private String addressLine2;
	private String city;
	private String district;
	private String state;
	private long pin;
	@ManyToOne
	@JoinColumn(name = "agent_username", nullable = false)
	@OnDelete(action = OnDeleteAction.CASCADE)
	private GreenbarnExecutive greenbarnAgent;

	public long getId() {
		return id;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public long getPin() {
		return pin;
	}

	public void setPin(long pin) {
		this.pin = pin;
	}

	public GreenbarnExecutive getGreenbarnAgent() {
		return greenbarnAgent;
	}

	public void setGreenbarnAgent(GreenbarnExecutive greenbarnAgent) {
		this.greenbarnAgent = greenbarnAgent;
	}

}
