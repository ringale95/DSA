import java.util.*;
public class Arr{
 public static void main(String[] args) {

    ArrayList<Integer> L1 = new ArrayList<>();
    ArrayList<Integer> L2 = new ArrayList<>(5);
    L2.add(88);
    L2.add(89);

    L1.add(6);
    L1.add(5);
    L1.add(3);

    //suppose we want to add more on 0th or 1st element
    L1.add(0,7);
    L1.add(2, 99);
    L1.addAll(0, L2);
    System.out.println(L1.contains(7));
//to clear all the list l1.clear();
//L1.indexOf(5555)-> gives index if the number is present else return -1
// to print last element index (L1.lastindexOf(6))
//remove element at specified position
//remove(int index)
//L1.set(1,6899);
    for(int i=0;i<L1.size();i++){

    System.out.println(L1.get(i));
    }

    
    
}
}