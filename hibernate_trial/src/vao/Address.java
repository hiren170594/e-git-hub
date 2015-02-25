package vao;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Table;

@Embeddable
public class Address {
	@Column(name="\"Strret_name\"")
	private String street_name;
	@Column(name="\"Pin_code\"")
	private String pin_code;
	@Column(name="\"City\"")
	private String city;
	@Column(name="\"State\"")
	private String state;
	
	public String getPin_code() {
		return pin_code;
	}
	public void setPin_code(String pin_code) {
		this.pin_code = pin_code;
	}
	public String getStreet_name() {
		return street_name;
	}
	public void setStreet_name(String street_name) {
		this.street_name = street_name;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	

}
