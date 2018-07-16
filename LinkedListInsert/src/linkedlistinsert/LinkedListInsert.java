/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlistinsert;

/**
 *
 * @author Szilard
 */
class Node {
    int data;
    Node next;
    
    Node(int d) {
        data = d;
        next = null;
    }
}
public class LinkedListInsert {

    /**
     * @param args the command line arguments
     */
    public static  Node insert(Node head,int data) {
        Node newNode = new Node(data);
        Node current = head;
        
        if(head == null){
            head = newNode;
        }
        else if (head.next == null) {
            head.next = newNode;
        }
        else {
            //insert(head.next, data);
            while (current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }  
                
        return head;
    }
    public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        Node head = null;
        //int N = sc.nextInt();

        //while(N-- > 0) {
            //int ele = sc.nextInt();
            head = insert(head,1);
            head = insert(head,2);
            head = insert(head,3);
            head = insert(head,4);
        //}
        display(head);
        //sc.close();

    }
    
}
