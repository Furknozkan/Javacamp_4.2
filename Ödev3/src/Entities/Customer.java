package Entities;

public class Customer {
	private int id;
	private String F�rstName;
	private String LastName;
	private String DateofBirth;
	private String NationalityId;
	
	
	public Customer() {
		
	}
	
	public Customer(int id, String f�rstName, String lastName, String dateofBirth, String nationalityId) {
		super();
		this.id = id;
		F�rstName = f�rstName;
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
	public String getF�rstName() {
		return F�rstName;
	}
	public void setF�rstName(String f�rstName) {
		F�rstName = f�rstName;
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
