
public class Exceptions {

	public static void main(String[] args) {
		//Try catch error used when we know a block of code could fail. 
		//E.g. 7/0 throws error in try, so goes to catch and continues
		//try block can be followed by multiple catch blocks
		int a = 4;
		int b = 7;
		int c = 0;

		try {
			//int k=b/c; //trying to divide by 0 throws error
			//System.out.println(k);
			int arr[]= new int[5];
			System.out.println(arr[7]); // trying to print an array index that doesn't exist
		}
		catch(ArithmeticException e) { //specific for arithmetic problems
			System.out.println("Arithmetic Error.");
		}
		catch(IndexOutOfBoundsException e) {
			System.out.println("Index Out of Bounds Exception.");
		}
		catch (Exception e) { //default exception type
			System.out.println("Error.");
		}
		finally {//Executed irrespective of exception thrown or not. Does not need catch to use.
			System.out.println("Delete cookies");
		}
	}

}
