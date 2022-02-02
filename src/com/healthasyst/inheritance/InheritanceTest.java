package com.healthasyst.inheritance;

class Parent {
	public int pAge=75;
	private String pName;
	
	public Parent(String pName) {
		System.out.println("Parent");
		this.pName=pName;
	}
	
	public void parentStyle() {
		System.out.println("Parent Style !!");
	}
}

class Child extends Parent {
	public int CAge=45;
	private String cName;
	
	public Child(String parentName,String childName)
	{
		super(parentName);
		System.out.println(super.pAge);
		
		this.cName=childName;
		System.out.println("Child");
	}

	public void childStyle() {
		System.out.println("Child Style");
	}
}
class GrandChild extends Child
{

	private String grandChildName;

	public GrandChild(String parentName, String childName,String grandChildName) {
		super(parentName, childName);
		this.grandChildName=grandChildName;
		// TODO Auto-generated constructor stub
	}
	
}
public class InheritanceTest {

	public static void main(String[] args) {

//		Child cObj = new Child("John","ken john");
//		System.out.println(cObj.pAge);
//		System.out.println(cObj.CAge);
//		cObj.parentStyle();
//		cObj.childStyle();

		GrandChild obj=new GrandChild("John", "Ken John", "peter ken");
		obj.parentStyle();
		obj.childStyle();
		
	}

}
