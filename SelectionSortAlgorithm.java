import java.util.Scanner;
public class SelectionSortAlgorithm{


void selectionSort(int input[]){

for(int i = 0; i < input.length-1; ++i){
      int minIndex = i; 
    for(int j = i + 1; j < input.length; ++j){
              if(input[j] < input[minIndex])
                       minIndex = j; 
       }
   if(minIndex != i){   // even though if i didn't put this condition still my code will work fine but for the sake of good practice i had put the condition
       int temp = input[i];
       input[i] = input[minIndex];
       input[minIndex] = temp;
}
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
  SelectionSortAlgorithm ss = new SelectionSortAlgorithm();
  ss.selectionSort(arr);
for(int element : arr)
System.out.print(element + " ");







}









}