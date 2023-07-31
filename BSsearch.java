
import java.util.*;
public class BSsearch {
static int BinarySearch(int arr[], int size, int element){
    int low,mid,high;
    low=0;
    high=size-1;
    mid=(low+high)/2;
    while(low<=high){
        if(arr[mid]==element){
        return mid;
    }
    if(arr[mid]<element){
        low = mid+1;
    }
    else{
        high=mid-1;
    }

}
return -1;
}
public static void main(String args[]){
int arr[] = {1,4,99, 8, 7,8,9};
int size= arr.length;
int element = 4;
int searchIndex = BinarySearch(arr, size, element);
System.out.println(searchIndex);

}
}
