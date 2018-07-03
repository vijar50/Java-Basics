class Solution {
    public static int solution(int[] N) {
    	int max = N[0]; 
        for (int i = 1; i<N.length;i++) {
        	if(N[i] > max) {
        		max = N[i];
        		System.out.println("Max value is: " + max);
        	}
        }
    	return max;
    }
    
	public static void main(String[] args) {
		int family[] = {123,321,312,132,213,231};
		solution(family);
	}
}

