/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lustre_quiz_3;

/**
 *
 * @author User
 */
import java.util.Scanner;

class Node {
    String data;
    
    Node next;
    
    public Node(String data){
        this.data = data;
        this.next = null;
        
    }
   
   }class LinearQueue{
       static class LinearQueue {
        Node front;
        Node rear;

        LinearQueue() {
            this.front = null;
            this.rear = null;
        }

        boolean isEmpty() {
            return this.front == null;
        }

        public void enqueue(int data) {
            Node newNode = new Node(data);

            if (this.rear == null) {
                this.front = this.rear = newNode;
                return;
            }

            this.rear.next = newNode;
            this.rear = newNode;
        }

        int dequeue() throws Exception {
            if (this.isEmpty()) {
                throw new Exception("Queue is empty");
            }

            int data = this.front.data;
            this.front = this.front.next;

            if (this.front == null) {
                this.rear = null;
            }

            return data;
        }

        int empty() throws Exception {
            if (this.isEmpty()) {
                throw new Exception("Queue is empty");
            }

            return this.front.data;
        }
    }
       
   }
    
    class CircularQueue{
        Node head;

    }
        public class Lustre_Quiz_3 {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static int MAX = 10;
    private int[] data = new int [MAX];
    private int front  ;
    private int rear;
    
    private void insertBeggining(int index)throws Exception{
       //OVERFLOW
       if((front == 0 && rear == MAX - 1) || (rear + 1 == front)){
           throw new Exception("Queue is Empty");
       }
       
       if (rear == MAX - 1) {
           rear = 0;
       } else if (front == 1){
           front = 0;
       } else {
           data[rear++] = index;
       }
    }
    private void insertEnding(int item) throws Exception{
        if(rear == MAX - 1){
            throw new Exception("que is full");
            
        }
        data[++rear] = item;
    }
     public int deletionBeggining(int item) throws Exception {
        if (rear == MAX-1 ){
            throw new Exception( " Que is empty");
        }
        int temporary = data [ front];
        if(front == rear){
            front = rear - 1;
        } else{
            front++;
        }
        return temporary;
    }
      public int deletionEnding(int item) throws Exception {
        if (rear == MAX-1 ){
            throw new Exception( " Que is empty");
        }
        int temporary = data [rear];
        if(front == rear){
            front = rear = -1;
        }else {
            rear--;
        }
        return temporary;
      }  
    //display
    private void display() throws Exception{
        //overflow
         if (front == -1){
            throw new Exception("Queue is Empty");
        }
        for(int i = front; i <= rear; i++){
        System.out.print(data[i] + "-");
        
    }
        System.out.println("NULL");
    }
    
    //deletion
    private int deletion() throws Exception{
        if (front == -1){
            throw new Exception("Queue is Empty");
        }
        
        int temporary = data[front];
        
        if(front == rear){
            front = rear = -1;
        }else if(front == MAX - 1){
            front = 0;
        } else{
            front++;
        }
        
        return temporary;
    }
    //main operation
    public static void main(String[] args) throws Exception {
        Lustre_Quiz_3 list = new Lustre_Quiz_3();
        Scanner scan = new Scanner(System.in);
        
           
        while (true){
            System.out.println("Question 1");
            System.out.println("Question 2");
            System.out.println("Choose from above");
            int choose = scan.nextInt();
            
            
        if(choose == 1){
           
            
    }
        else if(choose == 2){
            while (true) {
            System.out.println("1. Insertion");
            System.out.println("2. Deletion");
            System.out.println("3. Display");
            int input = scan.nextInt();
            
            
            switch (input) {
                case 1:
                    System.out.println("1. Insert Element from the beginning");
                    System.out.println("2. Insert Element from the ending");
                    int choice = scan.nextInt();
                    if(choice == 1){
                        int first = scan.nextInt();
                        list.insertBeggining(first);
                    }
                    else if(choice == 2){
                        int end = scan.nextInt();
                        list.insertEnding(end);
                    }else{
                        System.out.println("Invalid Input");
                    }
                    break;
                case 2:
                    System.out.println("1. Delete from the beginning");
                    System.out.println("2. Delete from the ending");
                    int num = scan.nextInt();
                    if(num == 1){
                        list.deletionBeggining(num);
                    }else if(num == 2){
                        list.deletionEnding(num);
                    }else{
                        System.out.println("Invalid Input");
                    }
                    
                  case 3:
                    list.display();
                    break;
            }
            
        }
            
        }
}
        }
        }