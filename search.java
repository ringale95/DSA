
import java.util.*;
public class search {
static int linearSearch(int arr[], int size, int element){
    for(int i=0;i<size;i++){
        if(arr[i]==element){
            return i;
        }
    }
    return -1;
}
public static void main(String args[]){
int arr[] = {1,4,5,6,7,8,9};
int size= arr.length;
int element = 4;
int searchIndex = linearSearch(arr, size, element);
System.out.println(searchIndex);

}
}
