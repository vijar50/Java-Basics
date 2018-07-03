
public class SuperChild extends SuperParent {

	String name = "Test";
	public void getString() {
		System.out.println(name);
		//super inherits the variable from the parent class variable 
		System.out.println(super.name);
	}
	
	public SuperChild() {//constructor
		super(); // super invokes the constructor of the parent class, then this constructor. Should be first line of child constructor
		System.out.println("Child Class Constructor");
	}
	
	public void getData() { // Overrides the getData() in the SuperParent class
		//super inherits the method from the parent class
		super.getData();
		System.out.println("I am in the child class.");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperChild sc= new SuperChild();
		//Gives preference to local variable Test
		sc.getString();
		sc.getData();
	}

}
