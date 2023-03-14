import java.util.Scanner;
import java.util.Arrays;

public class FindDuplicate{

public static void main(String...args){

System.out.println("Enter  the size of the array");
Scanner s = new Scanner(System.in);
int n = s.nextInt();
int arr[] = new int[n];
System.out.println("Enter the elements in the array one by one");

for(int i = 0; i < arr.length; ++i)
   arr[i] = s.nextInt();

Arrays.sort(arr);
boolean flag = false;
for(int i = 1; i < n; ++i){
    if(arr[i] == arr[i-1]){
            flag = true;
            break;
}
}

if(flag)
System.out.print("Yes duplicate elements are present");
else
System.out.print("There is no duplicate elements");



}





}