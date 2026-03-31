package algoruntimeanalysis;

public class SearchLargeDataset {
	public static void main(String[] args) {
		int size= 1000000;
		int[] data= new int[size];
		double ans1=0.0d,ans2= 0.0d;
		for (int i=0;i<size;i++) data[i]= i+1;

		int target= size;

		//check for time taken in linear search
		long start= System.nanoTime();
		boolean searchLinear = linearSearch(data, target);
		long end= System.nanoTime();
		ans1=(end-start);
	    System.out.println("Linear Search Time: "+ ans1 +" ms");

	    //check for time taken in binary search
	    start= System.nanoTime();
	    boolean searchBinary= binarySearch(data, target);
	    end= System.nanoTime();
	    ans2= (end-start);
	    System.out.println("Binary Search Time: "+ ans2 +" ms");
	    if(ans1<ans2) System.out.println("Linear search time wins");
	    else System.out.println("Binary search time wins");
	}

	public static boolean binarySearch(int[] arr, int target) {
		int left= 0, right= arr.length-1;
	    while (left<=right) {
	    	int mid= (left+right)/ 2;
	    	if (arr[mid]==target) return true;
	    	else if (arr[mid]< target) left= mid+1;
	    	else right= mid-1;
	    }
	    return false;
	}
    public static boolean linearSearch(int[] arr, int target) {
        for (int num:arr) {
            if (num==target) return true;
        }
        return false;
    }


}