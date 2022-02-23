package javacode;

public class evenposition {

	public static void main(String[] args) {
	int[] arr=new int[] {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19};
	System.out.println("even");
	for(int i=0;i<arr.length;i=i+2) {
	System.out.println(arr[i]);	
	}
	System.out.println("odd");
	for(int i=1;i<arr.length;i=i+2) {
	System.out.println(arr[i]);	
	}		

	}

}
