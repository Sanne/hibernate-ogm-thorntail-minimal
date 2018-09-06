package org.hibernate.demos.simplethorntailogm;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {

	@Id
	private Integer id;

	private String name;

	private Date date;

	public Employee() {
	}

	public Employee(Integer id, String name) {
		this.id = id;
		this.name = name;
		this.date = new Date();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
