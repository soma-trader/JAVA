package Test;

public class Test {
	String name;
	
	
	Test(String Name){
		name = Name;
		System.out.println("Hello World " + name);
	}


public static void main(String args[]){
	
	Test t = new Test("Soma");
}
}