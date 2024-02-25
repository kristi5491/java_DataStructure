public class Main {
        public static void main(String[] args) {
                Queue q = new Queue();
                q.Dequeue();
                q.Enqueue(1);
                q.Enqueue(2);
                q.Enqueue(3);
                q.Enqueue(4);

                q.Enqueue(5);

                q.display();

                q.Dequeue();
                q.display();

                q.Dequeue();
                q.display();
        }
}
