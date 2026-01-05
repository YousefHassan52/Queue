
void main() {
    QueueWithArray queue=new QueueWithArray(5);
//    queue.enqueue(1);
//    queue.enqueue(2);
//    queue.enqueue(3);
//    queue.enqueue(4);

    queue.display();
    int del=queue.dequeue();
    System.out.println("deleted: "+del);
    queue.dequeue();
    queue.dequeue();
    queue.dequeue();
    queue.dequeue();
    queue.dequeue();
    queue.display();

}
