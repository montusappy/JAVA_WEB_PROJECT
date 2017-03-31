package onetooneb1;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class User {
	@Id
	String name;
	int age;
	@OneToOne
	@JoinColumn(name = "car_number")
	Vehicle vehicle;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public User(String name, int age, Vehicle vehicle) {
		super();
		this.name = name;
		this.age = age;
		this.vehicle = vehicle;
	}

	public User() {
		super();
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", vehicle=" + vehicle
				+ "]";
	}

}
