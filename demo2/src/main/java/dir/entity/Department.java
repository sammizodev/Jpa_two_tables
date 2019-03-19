package dir.entity;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="department")
public class Department {
	
	@Id
	@Column(name="dept_id")
	private int Dept_id;
	
	@Column(name="dept_name")
	private String Dept_name;
	
	@Column(name="order")
	private String Order;
	
	@Column(name="home")
	private int Home;

	@OneToMany(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	@JoinColumn(name="department_dept_id")
	private List<Contact> contacts;
	
	public Department() {
		
	}
	
	

	public int getDept_id() {
		return Dept_id;
	}



	public void setDept_id(int dept_id) {
		Dept_id = dept_id;
	}



	public String getDept_name() {
		return Dept_name;
	}

	public void setDept_name(String dept_name) {
		Dept_name = dept_name;
	}

	public String getOrder() {
		return Order;
	}

	public void setOrder(String order) {
		Order = order;
	}

	public int getHome() {
		return Home;
	}

	public void setHome(int home) {
		Home = home;
	}

	public List<Contact> getContacts() {
		return contacts;
	}

	public void setContacts(List<Contact> contacts) {
		this.contacts = contacts;
	}
	
	public void addContact(Contact theContact) {
		if(contacts==null) {
			contacts=new ArrayList<>();
		}
		contacts.add(theContact);
	}



	@Override
	public String toString() {
		return "Department [Dept_id=" + Dept_id + ", Dept_name=" + Dept_name + ", Order=" + Order + ", Home=" + Home
				+ "]";
	}
	
	
	
}
