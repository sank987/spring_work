package com.hefshine.util;

import org.springframework.beans.factory.annotation.Autowired;

public class Emp {
	
	private int id;
	private String name;
@Autowired
	private Address add;
	

	public Emp()
	{
		
	}

	public Emp(int id, String name, Address add) {
		super();
		this.id = id;
		this.name = name;
		this.add = add;
	}
	
	
	public Address getAdd() {
		return add;
	}
	public void setAdd(Address add) {
		this.add = add;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", add=" + add + "]";
	}

	public void work()
	{
		System.out.println(id+" id  "+ name+" name  "+add + "Address");
		add.display();
		System.out.println("welcome in spring ");
	}

}
