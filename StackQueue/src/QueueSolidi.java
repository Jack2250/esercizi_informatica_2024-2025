import java.util.ArrayList;

public class QueueSolidi {
    //La coda (queue) è una struttura dati che adotta una politica di tipo FIFO (First In First Out),
    // ovvero il primo elemento inserito è sempre primo a essere estratto

    private ArrayList<Solido> queue;

    public QueueSolidi() {
        this.queue = new ArrayList<>();
    }

    public void enqueue(Solido s) throws CloneNotSupportedException {
        queue.addLast(s.clone());
    }

    public Solido dequeue() {
        if (queue.isEmpty()) {
            return null;
        }
        return queue.removeFirst();
    }
}