class Solution2 {
    public static void solution(int[] N) {
        
		int counter = 0;
		
        for (int i = 0; i<N.length;i++) {
            //Converted to string and split it so I could compare values
        	String number = String.valueOf(N[i]);

        	char[] ch = number.toCharArray();
        	
        	for (char c: ch) {

        	    //I think the if conditions are wrong/insufficient
        		if(ch[0] == ch[1]) {
        			System.out.println("parts 0 is parts 1");
					//counter = counter - 1;
        		}else if(ch[1] == ch[2]) {
        			System.out.println("parts 1 is parts 2");
					//counter = counter - 1;
        		}else if(ch[2] == ch[0]) {
        			System.out.println("parts 0 is parts 1");
					//counter = counter - 1;
        		}
        		else {
        		    //The counter does not return the correct value
					counter = counter + 1;
        		}
        	}       	
        }
        System.out.println("The count of the array is: " + counter);
    }
    
	public static void main(String[] args) {
		int family[] = {133,321,312,132,213,231};
		solution(family);
	}
}