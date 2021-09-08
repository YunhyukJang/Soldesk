package kr.co.softsoldesk.beans;

public class TestBean1 {
	private int data1;
	private double data2;
	private String data3;
	
	public TestBean1() {
		System.out.println("TestBean1의 기본 생성자");
		
		this.data1=0;
		this.data2=0.0;
		this.data3=null;
	}
	
	public void printData() {
		System.out.printf("data1 -> %d\n", data1);
		System.out.printf("data2 -> %f\n", data2);
		System.out.printf("data3 -> %s\n", data3);
	}
	
	public TestBean1(int data1) {
		System.out.println("TestBean1의 생성자 -> int 변수 1개");
		
		this.data1=data1;
		this.data2=0.0;
		this.data3=null;
	}
	
	public TestBean1(double data2) {
		System.out.println("TestBean1의 생성자 -> double 변수 1개");
		
		this.data1=0;
		this.data2=data2;
		this.data3=null;
	}
	
	public TestBean1(String data3) {
		System.out.println("TestBean1의 생성자 -> String 변수 1개");
		
		this.data1=0;
		this.data2=0.0;
		this.data3=data3;
	}
	
	public TestBean1(int data1, double data2, String data3) {
		System.out.println("TestBean1의 생성자 -> int, double, String 변수 3개");
		
		this.data1=data1;
		this.data2=data2;
		this.data3=data3;
	}
	
	public int getData1() {
		return data1;
	}
	
	public void setData1(int data1) {
		this.data1 = data1;
	}
	
	public double getData2() {
		return data2;
	}
	
	public void setData2(double data2) {
		this.data2 = data2;
	}
	
	public String getData3() {
		return data3;
	}
	
	public void setData3(String data3) {
		this.data3 = data3;
	}
}
