import java.util.Scanner;

public class QuickSortAlgorithm{


void quickSort(int[] input) {
		
		quickSort(input, 0, input.length - 1);
	}
    
     void quickSort(int[] input, int sI, int eI){
        if(sI >= eI)
            return;
        
        int pivotIndex = partition(input, sI, eI);
        quickSort(input, sI, pivotIndex - 1);
        quickSort(input, pivotIndex + 1, eI);
    }
    
    
    int partition(int[] input, int sI, int eI){
        int count = 0;
        for(int i = sI + 1; i <= eI; i++){
            if(input[i] <= input[sI])
                count++;
        }
        
        int pivotIndex = count + sI;
        int i = sI;
        int j = eI;
        
        int temp = input[sI];
        input[sI] = input[pivotIndex];
        input[pivotIndex] = temp;
        
        while(i < j){
            if(input[i] <= input[pivotIndex])
                i++;
            else if(input[j] > input[pivotIndex])
                j--;
            else{
                int val = input[i];
                input[i] = input[j];
                input[j] = val;
                i++;
                j--;
            }
        }
        
        return pivotIndex;
    }



public static void main(String[]args){
Scanner s = new Scanner(System.in);
System.out.println("Enter the size of the array");
int n = s.nextInt();
int arr[] = new int[n];
System.out.println("Enter  the elements of the array one by one");

for(int i = 0; i <  arr.length; ++i) // we could write the loop without brackets if we need the only one statement inside
  arr[i] = s.nextInt();
  QuickSortAlgorithm q = new QuickSortAlgorithm();
  q.quickSort(arr);
for(int element : arr)
System.out.print(element + " ");



}

// Time Complexity : O(nlogn)
// Space Complexity : O(n)  // but it doesn't take extra space like merge sort regardless the space complexity is same 







}