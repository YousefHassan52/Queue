
void main() {
//    QueueWithArray queue=new QueueWithArray(5);
//    queue.enqueue(1);
//    queue.enqueue(2);
//    queue.enqueue(3);
//    queue.enqueue(4);

//    queue.display();
//    int del=queue.dequeue();
//    System.out.println("deleted: "+del);
//    queue.dequeue();
//    queue.dequeue();
//    queue.dequeue();
//    queue.dequeue();
//    queue.dequeue();
//    queue.display();

    LinkedQueue queue=new LinkedQueue();
    queue.enqueue(14);
    queue.enqueue(13);
    queue.enqueue(12);
    queue.enqueue(11);
    queue.enqueue(10);
    queue.display();
    int del=queue.dequeue();
    System.out.println("backup var: "+del);
    queue.display();

    queue.dequeue();
    queue.dequeue();
    queue.dequeue();
    queue.dequeue();
    queue.dequeue();
    queue.dequeue();
    queue.dequeue();
    queue.dequeue();
    System.out.println("------------------------------------------");
    queue.display();
    System.out.println("------------------------------------------");

    queue.enqueue(14);
    queue.enqueue(13);
    queue.enqueue(12);
    queue.enqueue(11);
    queue.enqueue(10);
    queue.display();
    queue.dequeue();
    queue.display();

}
