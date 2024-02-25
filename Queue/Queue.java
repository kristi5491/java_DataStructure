public class Queue {
     int rear, front;
     int SIZE = 4;
     int []array = new int[SIZE];

     Queue() {
        front = -1;
        rear = -1;
     }

     boolean isFull() {
        return front == 0 && rear == SIZE - 1;
     }

     boolean isEmpty() {
        return (front == -1);
     }

     int Enqueue(int element) {
        if (isFull()) {
            System.out.println("Queue is full");
            return 0;
        } else {
             if (front == -1) {
                front = 0;
                rear = 0;
                array[front] = element;
                System.out.println("First element added: " +element);
             } else {
                rear = (rear + 1);
                array[rear] = element;
                System.out.println("New element added: " +element);
            }
            return 1;
        }
    }

     int Dequeue() {
         int element;
         if (isEmpty()) {
             System.out.println("Queue is empty");
             return -1;
         } else {
             element = array[front];
             System.out.println("Our element deleted:" +element);
             if (front >= rear) {
                 front = -1;
                 rear = -1;
             } else {
                 front++;
             }
             return element;
         }
     }

     void display() {
         int i;
         if (isEmpty()) {
             System.out.println("Queue is empty");
         } else {

             for (i = front; i <= rear; i++) {
                 System.out.print(array[i] + "->" );
             }
             System.out.println();
         }
     }

 }