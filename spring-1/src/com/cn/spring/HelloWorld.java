package com.cn.spring;

public class HelloWorld {
	
	private String name;
	
	public HelloWorld(){
		
		System.out.println("this is the constructor...");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("setName :" + name);
		this.name = name;
	}

	@Override
	public String toString() {
		return "HelloWorld [name=" + name + "]";
	}

	public HelloWorld(String name) {
		super();
		this.name = name;
	}
	
	
}
