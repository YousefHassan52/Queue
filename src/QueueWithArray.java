public class QueueWithArray {
    int maxSize;
    int[] arr;
    int front;
    int rear;
    public QueueWithArray(int size) {
        this.maxSize = size;
        front = -1;
        rear = -1;
        arr = new int[size];
    }
    public boolean isEmpty() {
        return front==-1 ||rear==-1 ||front > rear;
    }
    public boolean isFull() {
        return rear == maxSize - 1;
    }
    public void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        if(isEmpty()) front=0;
//        rear++;
        arr[++rear] = data;

    }

    public void display(){
        if(isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        for (int i=front; i<=rear; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();


    }
    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        int deleted=arr[front];
        front++;
        return deleted;
    }
}
