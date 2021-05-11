package Entities;

public class Customer {
	private int id;
	private String FýrstName;
	private String LastName;
	private String DateofBirth;
	private String NationalityId;
	
	
	public Customer() {
		
	}
	
	public Customer(int id, String fýrstName, String lastName, String dateofBirth, String nationalityId) {
		super();
		this.id = id;
		FýrstName = fýrstName;
		LastName = lastName;
		DateofBirth = dateofBirth;
		NationalityId = nationalityId;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFýrstName() {
		return FýrstName;
	}
	public void setFýrstName(String fýrstName) {
		FýrstName = fýrstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getDateofBirth() {
		return DateofBirth;
	}
	public void setDateofBirth(String dateofBirth) {
		DateofBirth = dateofBirth;
	}
	public String getNationalityId() {
		return NationalityId;
	}
	public void setNationalityId(String nationalityId) {
		NationalityId = nationalityId;
	}


}
