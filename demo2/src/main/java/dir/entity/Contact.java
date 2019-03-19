package dir.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="contact")
public class Contact {
	
	@Id
	@Column(name="contact_id")
	private int Contact_id;
	
	@Column(name="emp_name")
	private String Emp_name;
	
	@Column(name="mobile")
	private String Mobile;
	
	
	@Column(name="landline_office")
	private String Landline_office;
	
	@Column(name="landline_res")
	private String Landline_res;
	
	@Column(name="fax")
	private String Fax;
	
	@Column(name="email")
	private String Email;
	
	@Column(name="department_dept_id")
	private int Department_dept_id;
	

	
	public Contact() {
		
	}



	public int getContact_id() {
		return Contact_id;
	}



	public void setContact_id(int contact_id) {
		Contact_id = contact_id;
	}



	public String getEmp_name() {
		return Emp_name;
	}



	public void setEmp_name(String emp_name) {
		Emp_name = emp_name;
	}



	public String getMobile() {
		return Mobile;
	}



	public void setMobile(String mobile) {
		Mobile = mobile;
	}



	public String getLandline_office() {
		return Landline_office;
	}



	public void setLandline_office(String landline_office) {
		Landline_office = landline_office;
	}



	public String getLandline_res() {
		return Landline_res;
	}



	public void setLandline_res(String landline_res) {
		Landline_res = landline_res;
	}



	public String getFax() {
		return Fax;
	}



	public void setFax(String fax) {
		Fax = fax;
	}



	public String getEmail() {
		return Email;
	}



	public void setEmail(String email) {
		Email = email;
	}



	public int getDepartment_dept_id() {
		return Department_dept_id;
	}



	public void setDepartment_dept_id(int department_dept_id) {
		Department_dept_id = department_dept_id;
	}



	@Override
	public String toString() {
		return "Contact [Contact_id=" + Contact_id + ", Emp_name=" + Emp_name + ", Mobile=" + Mobile
				+ ", Landline_office=" + Landline_office + ", Landline_res=" + Landline_res + ", Fax=" + Fax
				+ ", Email=" + Email + ", Department_dept_id=" + Department_dept_id + "]";
	}



	

	
	
	
	

}
