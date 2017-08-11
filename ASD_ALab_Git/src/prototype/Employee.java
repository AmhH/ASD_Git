package prototype;

import java.io.Serializable;

public class Employee implements Cloneable, Serializable {

	private static final long serialVersionUID = 1L;
	private int id;
	private String lastname;
	private String firstname;
	private String streetAddress;
	private String city;
	private String state;
	private String zipcode;
	private Employee supervisor;
	private Employee staff[];
	
	public Employee(){
		
	}
	
	public Employee(int id, String lastname, String firstname, String streetAddress, String city, 
			String state, String zipcode) {
		this.id = id;
		this.lastname = lastname;
		this.firstname = firstname;
		this.streetAddress = streetAddress;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
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

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public Employee getSupervisor() {
		return supervisor;
	}

	public void setSupervisor(Employee supervisor) {
		this.supervisor = supervisor;
	}

	public Employee[] getStaff() {
		return staff;
	}

	public void setStaff(Employee[] staff) {
		this.staff = staff;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Employee clone = (Employee) super.clone();
		if(this.supervisor != null)clone.supervisor = (Employee) this.supervisor.clone();
		if(this.staff != null)clone.staff = this.staff.clone();
		return clone;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", Lastname=" + lastname + ", Firstname=" + firstname + ", streetAddress="
				+ streetAddress + ", city=" + city + ", state=" + state + ", zipcode=" + zipcode +"\n"+ ", supervisor="
				+ supervisor + ", staff="/* + Arrays.toString(staff)*/ + "]";
	}
}