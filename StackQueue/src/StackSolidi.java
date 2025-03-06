import java.util.ArrayList;

public class StackSolidi {
    //Lo stack (pila) è una struttura dati che adotta una politica di tipo LIFO (Last In First Out),
    // ovvero l'ultimo elemento inserito è sempre primo a essere estratto

    private ArrayList<Solido> stack;

    public StackSolidi() {
        this.stack = new ArrayList<>();
    }

    public void push(Solido s) throws CloneNotSupportedException {
        stack.addLast(s.clone());
    }

    public Solido pop() {
        if (stack.isEmpty()) {
            return null;
        }
        return stack.removeLast();
    }
}