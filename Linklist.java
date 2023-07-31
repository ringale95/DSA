public class Linklist {
    Node head;
    private int size;
   
    Linklist(){
        this.size=0;

    }
    class Node{
        //store data and next with type: node
        String data;
        Node next; 
         //make constructure - to initialize state of object initially
         Node(String data){
            this.data = data;
            this.next = null;
            size++; //when create node so size++
         }

    }

//add two typew: add first and add last 
//to add in first position
public void addfirst(String data){
    //create node:
    Node newNode = new Node(data);
    if(head == null){
        head=newNode;
        return;
    }
    //if head is not null and some list already exists then
    newNode.next=head;
    head = newNode;

}

//add in the last position
public void addlast(String data){
    Node newNode = new Node(data);
 if(head == null){
        head = newNode;
        return;
    }

    Node currNode = head;
    while(currNode.next !=null){
        currNode=currNode.next;
    }
    currNode.next = newNode;

}
//print
public void printList(){
    //corner case below if head is null or in our list no node then;
    if (head == null){
        System.out.println("List is empty");
        return;
    }
    Node currNode = head;
    while(currNode !=null){ //here we will print even the lastnode also so we remove.next
        System.out.print(currNode.data + " ->" );
        currNode=currNode.next;
    }
    System.out.println("NULL");

}

//delete first
public void deleteFirst(){
    //make corner case when list is empty
    if(head == null){
        System.out.println("The list is empty");
        return;
    }
    size--;
    head=head.next; //if head not null then head = head next //we make first next = head and garbage collector will take away
}
    //delete last
    //two corner case: 
    //if head is null then nothing
    //if head.next = null then delete the last node

    public void deleteLast(){
        //make corner case when list is empty
    if(head == null){
        System.out.println("The list is empty");
        return;
    }
    size --;
    if(head.next == null){ //this we are taking for below where lastnode.next->next ==null then it give error becasue last node next will not be there
        head=null; 
        return ; 

    }
    //traveerse if not empty
    Node secondLast =head; //current node
    Node lastNode = head.next; //next of current node
    while(lastNode.next != null){ //until our last node next is not null
        lastNode = lastNode.next; //error can come if head.next.next is null then there wont be anyone to point at so will give an error.
        secondLast = secondLast.next;
    }
    secondLast.next=null;

    }
    //to get size
    public int getSize(){
        return size;
    }
    public static void main(String[] args) {
        Linklist LL =  new Linklist(); //to make linklist we create object
        //we will see insert(ad), print, delete node, size check- 4 operation we see//
        LL.addfirst("a");
        LL.addfirst("is");
        LL.printList();
        LL.addfirst("first");
        LL.printList();

        LL.addlast(("last"));
        LL.printList();

        LL.deleteFirst();
        LL.printList();

        LL.deleteLast();
        LL.printList();

        LL.getSize();
        LL.printList();
    }




}
