package javacode;

public class LargestElement {

	public static void main(String[] args) {
//		int[] arr=new int[] {0,1,2,3,4,5,6,7,8,9,100,11,12,13,14,15,16,17,18,19};
//		int max=arr[0];
//		
//		for(int i=0; i<arr.length; i++) {
//			if(arr[i]>max)
//				max=arr[i];
//		}
//System.out.println(max);
//	}
//
//}
		int[] arr=new int[] {0,1,2,3,4,5,6,7,8,9,100,-11,12,13,14,15,16,17,18,19};
		int min=arr[0];
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]<min)
				min=arr[i];
		}
System.out.println(min);
	}

}

