package vao;


import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.util.Collection;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

@Entity
@Table(name="\"table11\"")
public class Reg_vao {
	
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name = "\"id\"", unique = true, nullable = false)
	private int id;
	
	@Column(name="\"first name\"")
	private String fn;
	
	@Column(name="\"last name\"")
	private String ln;
	
	@ElementCollection
	@JoinTable(name="\"add\"",joinColumns=@JoinColumn(name="\"address_id\""))
	@GenericGenerator(name="hilo-gen",strategy="hilo")
	@CollectionId(columns = { @Column(name="\"user_id\"") }, generator = "hilo-gen", type = @Type(type="int"))
	private java.util.Collection<Address> address=new ArrayList<Address>();
	
	@ManyToMany
	private Collection<Vehicle> vehicle=new ArrayList<Vehicle>();
	
	public Collection<Vehicle> getVehicle() {
		return vehicle;
	}
	public void setVehicle(Collection<Vehicle> vehicle) {
		this.vehicle = vehicle;
	}
	public java.util.Collection<Address> getAddress() {
		return address;
	}
	public void setAddress(java.util.Collection<Address> address) {
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	public String getFn() {
		return fn;
	}
	public void setFn(String fn) {
		this.fn = fn;
	}
	
	public String getLn() {
		return ln;
	}
	public void setLn(String ln) {
		this.ln = ln;
	}
}
