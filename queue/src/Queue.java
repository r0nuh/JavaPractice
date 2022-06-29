import java.util.Arrays;

public class Queue {
    private int[] queue;

    Queue(int capacity) {
        queue = new int[capacity];
    }

    public void addElement(int element) throws Exception {
        int length = queue.length;
        int cycle = 0;

        for (int i = 0; i < length; i++) {
            cycle++;
            if (queue[i] == 0){
                queue[i] = element;
                System.out.println(element + " has been added to the queue");
                return;
            }

            if (cycle >= length) {
                throw new Exception("Queue is full. Can not add more element.");
            }
        }
    }

    public void removeElement() throws Exception {
        int check = 0;
        int removed = 0;

        for (int i = 0; i < queue.length; i++) {
            check++;
            if (queue[i] != 0){
                removed = queue[i];
                for (int j = 0; j < queue.length - 1; j++) {
                    if (queue[j+1] != 0) {
                        queue[j] = queue[j+1];
                    } else {
                        queue[j] = 0;
                    }
                }
                System.out.println(removed + " has been removed from the queue");
                return;
            }

            if (check >= queue.length){
                throw new Exception("Queue is empty. Can not remove any element.");
            }
        }
    }

    @Override
    public String toString() {
        return "Queue = " + Arrays.toString(queue);
    }
}
