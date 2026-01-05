public class LinkedQueue {
    Node rear;
    Node front;

    public LinkedQueue() {
        rear=null;
        front=null;
    }
    public boolean isEmpty() {
        return front==null;
    }
    public void enqueue(int data) {
        Node n=new Node(data);
        if(isEmpty()){
            front=rear=n;
            System.out.println(data+" added to queue");
            return;
        }
        rear.next=n;
        rear=n;
        System.out.println(data+" added to queue");



    }
    public int dequeue() {
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        int data=front.data;
        front=front.next;
//        if(front==null){
//            rear=null;
//        }

        return data;


    }
    public void display() {
        if(isEmpty()){
            System.out.println("Queue is empty");
            return;
        }
        Node temp=front;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();

    }
}
