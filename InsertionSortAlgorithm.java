import java.util.Scanner;
public class InsertionSortAlgorithm{

void insertionSort(int arr[]){

for(int i = 0; i < arr.length - 1; ++i){
     for(int j = i + 1; j > 0; --j){
               if(arr[j] < arr[j-1]){
                 int temp = arr[j];
                 arr[j] = arr[j-1];
                arr[j-1] = temp;
}
     }
}

}


public static void main(String...args){

System.out.println("Enter the size of the array");
Scanner s = new Scanner(System.in);
int n = s.nextInt();
int arr[] = new int[n];
System.out.println("Enter the element in the array one by one");

for(int i = 0; i < arr.length; ++i){
arr[i] = s.nextInt();
}

InsertionSortAlgorithm i = new InsertionSortAlgorithm();
i.insertionSort(arr);
for(int element : arr)
System.out.print(element + " ");





}








}