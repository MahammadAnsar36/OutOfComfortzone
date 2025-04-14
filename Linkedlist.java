import java.util.*;
public class Linkedlist {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }

    }
    public static Node head;
    public static Node tail;

    public void addfirst(int data){
        Node newNode = new Node(data);
        if (head==null) {
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public void add(int idx,int data){
        if (idx==0) {
            addfirst(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp=head;
        int i=0;
        while (i<idx-1) {
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }
    public Node getmid(Node head){
        Node slow=head;
        Node fast=head.next;
        while (fast!=null&&fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public Node merge(Node head1,Node head2){
        Node mergeLL=new Node(-1);
        Node temp=mergeLL;
        while (head1!=null&&head2!=null) {
            if (head1.data<=head2.data) {
                temp.next=head1;
                head1=head1.next;
                temp=temp.next;
            } else{
                temp.next=head2;
                head2=head2.next;
                temp=temp.next;
            }
        }
        while (head1!=null) {
            temp.next=head1;
            head1=head1.next;
                temp=temp.next;
        }
        while (head2!=null) {
            temp.next=head2;
            head2=head2.next;
            temp=temp.next;
        }
        return mergeLL.next;
    }
    public Node mergeSort(Node head){
        if (head==null ||head.next==null) {
            return head;
        }
        Node mid = getmid(head);
        Node righthead=mid.next;
        mid.next=null;
        Node leftHalf=mergeSort(head);
        Node rightHalf=mergeSort(righthead);

        return merge(leftHalf,rightHalf);
    }
    public static void main(String[] args) {
        // Linkedlist ll =new Linkedlist();
        // // ll.add(0, 5);

        // ll.addfirst(7);
        // ll.add(0, 2);
        // ll.add(1, 9);
        // Node t=head;
        // while (t.next!=null) {
        //     System.out.print(t.data+" ");
        //     t=t.next;
        // }
        // System.out.println("null"); 
        LinkedList<Integer> ll =new LinkedList<>();
        ll.addFirst(4);
        ll.addFirst(6);
        ll.addFirst(1);
        ll.addFirst(8);
        ll.addFirst(3);
        System.out.println(ll);
        

    }
}