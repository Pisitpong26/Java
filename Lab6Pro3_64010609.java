public class Lab6Pro3_64010609 {
    public static void main(String[] args) {
        Queue q = new Queue();

        for (int i = 1;i <= 20; i++){
            q.enqueue(i);
        }

        while (!q.empty()){
            q.dequeue();
        }
        q.dequeue();

    }
}
