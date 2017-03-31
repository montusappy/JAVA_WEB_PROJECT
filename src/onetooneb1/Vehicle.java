package onetooneb1;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Vehicle {
	@Id
	Integer number;
	String model;
	String color;
	@OneToOne
	User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Vehicle(int number, String model, String color) {
		super();
		this.number = number;
		this.model = model;
		this.color = color;
	}

	public Vehicle() {
		super();
	}

	@Override
	public String toString() {
		return "Vehicle [number=" + number + ", model=" + model + ", color="
				+ color + "]";
	}

}
