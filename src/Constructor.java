
public class Constructor {
	// Constructor - Block of code whenever an object is created. Does not return any values. Name should be == className
	public Constructor() {
		//
		System.out.println("I am in the constructor");
	}
	
	//Parameterized Constructor
	public Constructor(int a, int b) {
		//
		System.out.println("I am in the parameterized constructor");
		int c=a+b;
		System.out.println(c);
	}
	//String constructor
	public Constructor(String str) {
		//
		System.out.println(str);
	}
	public void getData() {
		System.out.println("I am the method.");
	}
	public static void main(String[] args) {
		//Create a new object and call the constructor
		//If you don't explicitly create a constructor, compiler will call implicit constructor
		//if you define it, it will go an execute the constructor block
		//With the Parameterized contructor it will pick the standard constructor because we haven't specified any parameters
		Constructor cd = new Constructor();
		//added parameters, now it will use the Parameterized constructor
		Constructor c = new Constructor(4,5);
		//added parameters, now it will use the Parameterized constructor
		Constructor s = new Constructor("Bla Bla");

	}

}
