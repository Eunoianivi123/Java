import java.util.*;

class Node{
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }

}

public class LinkedList {
     Node head;

    public LinkedList(){
        head = null;
    }

    public void insertFront(int data){
        Node newNode = new Node(data);

        newNode.next = head;
        head = newNode;

    }

    public void insertEnd(int data){

        Node newNode = new Node(data);
        Node curr = head;

        while(curr.next != null){
            curr = curr.next;
        }
        curr.next = newNode;
    }

    public void insertPosition(int data, int pos){
        Node newNode = new Node(data);
        Node curr = head;
        Node prev = null;
        int count =0;

        while(count != pos){
            prev = curr;
            curr = curr.next;
            count++;
        }
        prev.next = newNode;
        newNode.next = curr;
    }

    public void insertAfter(int data, int key){
        Node newNode = new Node(data);
        Node curr = head;
        Node prev = null;

        while(curr != null){
            prev = curr;
            curr = curr.next;
            if(prev.data == key){
                break;
            }
        }
        prev.next = newNode;
        newNode.next = curr;
    }

    public void insertBefore(int data, int key){
        Node newNode = new Node(data);
        Node curr = head;
        Node prev = null;

        while(curr != null){
            if(curr.data == key){
                break;
            }
            prev = curr;
            curr = curr.next;
        }
        prev.next = newNode;
        newNode.next = curr;


    }

    public void deleteBeginning(){
        if(head == null){
            System.out.println("List is Empty");
        }
        Node curr = head.next;
        head = curr;
    }

    public void deleteEnd(){
        Node curr = head;
        Node prev = null;
        while(curr.next != null){
            prev = curr;
            curr = curr.next;
        }
        prev.next = null;
    }

    public void deleteValue(int key){
        Node curr = head;
        Node prev = null;

        while(curr.next != null){
            if(curr.data == key){
                break;
            }
            prev = curr;
            curr = curr.next;
        }
        prev.next = curr.next;
    }

    public void deletePosition(int pos){
        Node curr = head;
        Node prev = null;
        int count =0;

        while(count != pos){
            prev = curr;
            curr = curr.next;
            count++;
        }
        prev.next = curr.next;
    }

    public void display(){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println();
    }

    public Node reverse(){
        Node curr = head, prev= null,next;

        while(curr != null){
            next = curr.next;

            curr.next = prev;

            prev = curr;
            curr = next;
        }
        return prev;
    }

    public void searchValue(int key){
        Node curr = head;
        StringBuilder sb = new StringBuilder("Search element not found.");

        while(curr != null){
            if(curr.data == key) {
                sb.setLength(0);
                sb.append("Search element found.");
                break;
            }
            curr = curr.next;
        }
        System.out.println(sb.toString());
    }

    public void accessSpecific(int position){
        Node curr = head;
        int count =0;

        while(curr != null){
            if(count == position){
                System.out.println(curr.data);
                break;
            }
            curr = curr.next;
            count++;
        }
    }
    public void listLength(){
        int len =0;
        Node curr = head;

        while(curr != null){
            len++;
            curr = curr.next;
        }
        System.out.println("Length of the LinkedList: " + len);
    }

    public void countOccurences(){
        HashMap<Integer,Integer> map = new HashMap<>();
        Node curr = head;

        while(curr != null){
            if(!map.containsKey(curr.data))
                     map.put(curr.data,1);
            else{
                int count = map.get(curr.data);
                count++;
                map.put(curr.data,count);
            }
           curr = curr.next;
        }
        System.out.println(map);

    }

    public void sortLink(){
        Node curr = head;

        while(curr != null){
            Node next = curr.next;
            Node min = curr;

            while(next != null){
                if(next.data < min.data)
                    min = next;
                next = next.next;
            }

            int temp = curr.data;
            curr.data = min.data;
            min.data = temp;

            curr = curr.next;
        }
    }

    public void concatenate(LinkedList list){
        Node curr = head;
        Node curr1 = list.head;

        while(curr.next != null){
            curr = curr.next;
        }

        curr.next = curr1;
        list.head = null;
    }

    public void removeDuplicate(){
        HashMap<Integer,Integer> map = new HashMap<>();
        Node curr = head,prev=null;

        while(curr != null){
            if(!map.containsKey(curr.data)) {
                map.put(curr.data, 0);
                prev = curr;
            }
            else
                prev.next = curr.next;

            curr = curr.next;
        }
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        LinkedList list1 = new LinkedList();
        System.out.println("Neelavathy - 2022503513");
        System.out.println("Inserting at Front:");
        list.insertFront(34);
        list.display();
        list.insertFront(55);
        list.display();
        System.out.println("Inserting at End:");
        list.insertEnd(67);
        list.display();
        System.out.println("Inserting at position:");
        list.insertPosition(90,1);
        list.display();
        System.out.println("Insert After");
        list.insertAfter(3,67);
        list.display();
        System.out.println("Insert Before:");
        list.insertBefore(3,67);
        list.display();
        System.out.println("Delete from Beginning:");
        list.deleteBeginning();
        list.display();
        System.out.println("Delete from End:");
        list.deleteEnd();
        list.display();
        System.out.println("Delete specified value:");
        list.deleteValue(34);
        list.display();
        System.out.println("Delete at Position:");
        list.deletePosition(1);
        list.display();
        System.out.println("Reversing the list:");
        list.head = list.reverse();
        list.display();
        System.out.println("Inserting at Front:");
        list.insertFront(34);
        list.display();
        System.out.println("search Element:");
        list.searchValue(67);
        System.out.println("Accessing elements at position 2:");
        list.accessSpecific(2);
        System.out.println("Lenght of Linkedlist:");
        list.listLength();
        list.insertFront(34);
        list.display();
        System.out.println("Occurence of elements:");
        list.countOccurences();
        list1.insertFront(1);
        list1.insertFront(2);
        list1.insertFront(3);
        System.out.println("Printing list1:");
        list1.display();
        list.concatenate(list1);
        System.out.println("List1 Concatenated with List2:");
        list.display();
        System.out.println("Sorted Linkedlist:");
        list.sortLink();
        list.insertEnd(2);
        list.insertEnd(67);
        list.display();
        System.out.println("Duplicates Removed:");
        list.removeDuplicate();
        list.display();
    }
}



