import java.util.*;

class NewNode{
    int data;
    NewNode next;

    NewNode(int data){
        this.data = data;
        this.next = null;
    }
}

public class StackLinkedList {
    NewNode head;

    StackLinkedList(){
        head = null;
    }

    public void push(int data,int size){

        NewNode newNode = new NewNode(data);
        NewNode curr = head;
        boolean flag = isFull(size);
        if(!flag) {
            if (head == null)
                head = newNode;
            else {
                while (curr.next != null) {
                    curr = curr.next;
                }
                curr.next = newNode;
            }
        }
        else
            System.out.println("Stack Overflow");

    }

    public void pop(){
        NewNode curr = head;
        NewNode prev = null;
        boolean flag = isEmpty();
        if(!flag){
            while(curr.next != null){
                prev = curr;
                curr = curr.next;
            }
            prev.next = null;
        }
        else
            System.out.println("Stack Underflow.");
    }

    public void display(){
        NewNode curr = head;
        while(curr != null){
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println();
    }

    public boolean isEmpty(){
        if(head != null) {
            return false;
        }
        else{
            return true;
        }
    }

    public boolean isFull(int size){
        NewNode curr = head;
        int count =0;

        while(curr != null){
            count++;
            curr = curr.next;
        }

        if(count < size)
            return false;
        else
            return true;


    }

    public void top(){
        NewNode curr = head;

        while(curr.next != null)
            curr = curr.next;

        System.out.println("Top Element:" + curr.data);
    }

    public static void main(String[] args){
        StackLinkedList list = new StackLinkedList();
        System.out.println("Neelavathy - 2022503513");
        System.out.println("Enter the size of stack:");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        boolean status;
        System.out.println("Pushing Elements into Stack:");
        list.push(56,size);
        list.push(67,size);
        list.push(89,size);
        list.display();
        System.out.println("Popped Elements from stack:");
        list.pop();
        list.display();
        System.out.print("Is Empty?: ");
        System.out.println(list.isEmpty());
        System.out.print("Is Full?: ");
        System.out.println(list.isFull(size));
        System.out.println("Displaying top elements:");
        list.top();

    }
}
