import java.util.Scanner;

public class MergeSortAlgorithm{

void mergeSort(int[] input){
	   
		mergeSort(input, 0, input.length - 1);
	}
    
    
    void mergeSort(int[] input, int sI, int eI){
        if(sI >= eI)
            return;
        
        int mid = (sI + eI) / 2;
        mergeSort(input, sI, mid);
        mergeSort(input, mid + 1, eI);
        merge(input, sI, eI);
    }
    
     void merge(int input[], int sI, int eI){
        int temp[] = new int[eI - sI + 1];
        int mid = (sI + eI) / 2;
        int i = sI;
        int j = mid + 1;
        int k = 0;
        
        while(i <= mid && j <= eI){
            if(input[i] <= input[j]){
                temp[k] = input[i];
                i++;
                k++;
            }
            else{
                temp[k] = input[j];
            j++;
            k++;
            }
        }
        
        while(i <= mid){
            temp[k] = input[i];
            i++;
            k++;
        }
        
         while(j <= eI){
            temp[k] = input[j];
            j++;
            k++;
        }
        
        for(int a = 0; a < temp.length; a++){
            input[a + sI] = temp[a];
        }
    }

public static void main(String[]args){
Scanner s = new Scanner(System.in);
System.out.println("Enter the size of the array");
int n = s.nextInt();
int arr[] = new int[n];
System.out.println("Enter  the elements of the array one by one");

for(int i = 0; i <  arr.length; ++i) // we could write the loop without brackets if we need the only one statement inside
  arr[i] = s.nextInt();
  MergeSortAlgorithm m = new MergeSortAlgorithm();
  m.mergeSort(arr);
for(int element : arr)
System.out.print(element + " ");

}
}

// Time Complexity : O(nlogn)
// Space Complexity : O(n)