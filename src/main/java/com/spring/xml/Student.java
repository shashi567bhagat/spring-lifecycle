package com.spring.xml;

public class Student {

	
	private int id;
	private String name;
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
	
	public void init()
	{
		System.out.println("initialization started");
		
		int a=5;
		int b=10;
		int c=a+b;
		System.out.println(c);
		
	}
	
	
	public void destroy()
	{
		System.out.println("destroy started");
		
	}
}
