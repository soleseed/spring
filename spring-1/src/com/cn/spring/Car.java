package com.cn.spring;

public class Car {
	
	private String name;
	
	private String corp;
	
	private int price;
	
	private int maxSpeed;

	private String master;
	
	
	public Car(String name, String corp, int price) {
		super();
		this.name = name;
		this.corp = corp;
		this.price = price;
	}
	
	public Car(String name, String corp, String master) {
		super();
		this.name = name;
		this.corp = corp;
		this.master = master;
	}


	public Car(String name, String corp, int price, int maxSpeed) {
		super();
		this.name = name;
		this.corp = corp;
		this.price = price;
		this.maxSpeed = maxSpeed;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCorp() {
		return corp;
	}

	public void setCorp(String corp) {
		this.corp = corp;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	
	
	public String getMaster() {
		return master;
	}

	public void setMaster(String master) {
		this.master = master;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", corp=" + corp + ", price=" + price + ", maxSpeed=" + maxSpeed + ", master="
				+ master + "]";
	}
	
	
	
}
