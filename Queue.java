public class Queue {
    private int[] elements;
    private int size;

    public Queue(){
        elements = new int[8];
    }

    public void enqueue(int v){
        if (size >= elements.length){
                int[] temp = new int[elements.length*2];
                System.arraycopy(elements, 0, temp, 0, elements.length);
                elements = temp;
        }
        elements[size++] = v;
    }

    public void dequeue() {
        if(size > 0){
            int v = elements[0];
            int[] temp = new int[elements.length];
            System.arraycopy(elements, 1, temp, 0, size);
            elements = temp;
            size--;

            System.out.print(v + " ");
        }
        else{
            System.out.println("Out of Queue");
        }
    }

    public boolean empty() {
        return size == 0;
    }

    public int getSize(){
        return size;
    }

}
