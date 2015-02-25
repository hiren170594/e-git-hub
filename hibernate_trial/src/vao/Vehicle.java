package vao;


import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Vehicle {
	@Id @GeneratedValue
	private int Vehicle_id;
	private String Vehicle_name;
	
	@ManyToMany(mappedBy="vehicle")
	private Collection<Reg_vao> user=new ArrayList<Reg_vao>();
	
	
	public Collection<Reg_vao> getUser() {
		return user;
	}
	public void setUser(Collection<Reg_vao> user) {
		this.user = user;
	}
	public int getVehicle_id() {
		return Vehicle_id;
	}
	public void setVehicle_id(int vehicle_id) {
		Vehicle_id = vehicle_id;
	}
	public String getVehicle_name() {
		return Vehicle_name;
	}
	public void setVehicle_name(String vehicle_name) {
		Vehicle_name = vehicle_name;
	}

}
