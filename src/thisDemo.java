
public class thisDemo {

	int a = 2;
	
	public void getData() {
		int a = 3;
		System.out.println(a); // uses a local variable
		System.out.println(this.a); // uses the global variable. this inherits the variable at the class level. 
		int b = a+this.a;
		System.out.println("Sum is: " + b);
	}
	public static void main(String[] args) {
		
		thisDemo td = new thisDemo();
		td.getData();

	}

}
