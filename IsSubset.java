import java.util.Scanner;
import java.util.Arrays;

public class IsSubset{
int binarySearch(int[] input, int element) {
		int low = 0;
		int high = input.length - 1;
		
		while(low <= high) {
			int mid = (low+high)/2;
			
			if(input[mid] == element)
				return mid;
			else if(input[mid] > element)
				high = mid - 1;
			else
				low = mid + 1;
		}
		
		return -1;
	}

	public static void main(String[] args) {
	System.out.println("Enter the size of the two arrays one by one and there is no restriction on size that which array is bigger you could enter the size based on your priority the program is only tell you that there is one array which is subset of another array or not but don't which array the first one or the second one");
	Scanner s = new Scanner(System.in);
    int n,m;
   n = s.nextInt();
   m = s.nextInt();
   
   int[] arr1, arr2;
   arr1 = new int[n];
   arr2 = new int[m];
   
   System.out.println("Enter the element in the array 1 one by one");
   for(int i = 0; i < n; ++i) {
	   arr1[i] = s.nextInt();
   }
   
   System.out.println("Enter the element in the array 2 one by one");
   for(int i = 0; i < m; ++i) {
	   arr2[i] = s.nextInt();
   }
   
   int[] smaller, bigger;
   
   if(n > m) {
	   bigger = arr1;
	   smaller = arr2;
   }
   else {
	   bigger = arr2;
	   smaller = arr1;
   }
   
   Arrays.sort(bigger);
   boolean flag = true;
   IsSubset ss = new IsSubset();
   
   for(int element : smaller) {
	   if(ss.binarySearch(bigger, element) < 0) {
		   flag = false;
		   break;
	   }
   }
   
   if(flag) {
	   System.out.print("Yes one of the array is the subset of another array");
   }
   else {
	   System.out.println("No there is no array present which is a subset of other array");
   }
	
	}

}