package javacode;

public class sortAccending {

	public static void main(String[] args) {
//		int[] arr=new int[] {8,9,100,-1};
//		int temp=0;
//		System.out.println("original array");
//		
//		for(int i=0; i<arr.length; i++) {
//		System.out.println(arr[i]);
//		}
//		
//		
//		//logic
//		for(int i=0; i<arr.length; i++) {
//	    for(int j=i+1; j<arr.length; j++) {
//	    	
//	    	if(arr[i]>arr[j]) {
//	    		temp=arr[i];
//	    		arr[i]=arr[j];
//	    		arr[j]=temp;
//	    		
//	    	}
//	    }
//		}
//		System.out.println("after sorting");
//		for(int i=0; i<arr.length; i++) {
//			System.out.println(arr[i]);
//		}
//	}
//
//	}

		int[] arr=new int[] {8,9,100,-1};
		int temp=0;
		System.out.println("original array");
		
		for(int i=0; i<arr.length; i++) {
		System.out.println(arr[i]);
		}
		
		
		//logic
		for(int i=0; i<arr.length; i++) {
	    for(int j=i+1; j<arr.length; j++) {
	    	
	    	if(arr[i]<arr[j]) {
	    		temp=arr[i];
	    		arr[i]=arr[j];
	    		arr[j]=temp;
	    		
	    	}
	    }
		}
		System.out.println("after sorting");
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	}

