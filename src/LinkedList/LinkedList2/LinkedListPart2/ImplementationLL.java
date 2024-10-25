package LinkedList.LinkedList2.LinkedListPart2;



class SLL{
     //user defined data structure
    Node head;
    Node tail;
    int size;

    void insertAtEnd(int val){
        Node temp = new Node(val);
        if (head == null) head = tail =  temp;
        else{
                tail.next = temp;
                tail = temp;
        }

    }
    void display(){
      Node temp =head;
      while (temp!= null){
            System.out.println(temp.val+ " ");
            temp = temp.next;
      }
      System.out.println();


    }

}
public class ImplementationLL {
    
    public static void main(String[] args) {
        SLL ll =  new SLL();
        SLL list = new SLL();
//        list.addAtTail(10);
         list.insertAtEnd(10);
         list.insertAtEnd(20);
         list.insertAtEnd(50);
         list.insertAtEnd(40);

         list.display();
         list.insertAtEnd(24);
         list.display();
        System.out.println(list.size);
        list.insertAtEnd(25);
        list.insertAtEnd(28);
        System.out.println(list.size);
        list.display();

    }
}
