package sist.com.basic1.di;

public class Person {
	private String name;
	private int age;
	private String addr;
	private double height;
	
	
	public Person() {
		System.out.println("Person()");
	}
	
	public Person(String name) {
		super();
		this.name = name;
	}
	

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public Person(String name, int age, String addr, double height) {
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
		this.height = height;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", addr=" + addr + ", height=" + height + "]";
	}
	
	

}
