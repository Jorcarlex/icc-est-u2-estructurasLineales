package materia.Stacks;
import java.util.EmptyStackException;
import materia.models.Node;

public class Stack {
    // LIFO: Last In First Out

    private Node top; // Nodo en la cima de la pila

    // Pila con la cima nula
    public Stack() {
        this.top = null;
    }

    // Método para agregar elementos a la pila
    public void push(int valor) {
        Node newNode = new Node(valor);
        newNode.setNext(top); // El nuevo nodo apunta al nodo que estaba en la cima
        top = newNode; // Actualizar la cima de la pila
    }

    // Método que retira el nodo de la cima
    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        int value = top.getValor();
        top = top.getNext();
        return value;
    }

    // Método que retorna el valor del nodo de la cima
    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return top.getValor();
    }

    // Método para verificar si la pila está vacía
    public boolean isEmpty() {
        return top == null;
    }

    // Método para imprimir los elementos de la pila
    public void printStack() {
        Node current = top;
        while (current != null) {
            System.out.println(current.getValor());
            current = current.getNext();
        }
    }

    // Método para obtener el tamaño de la pila
    public int getSize() {
        int size = 0;
        Node current = top;

        while (current != null) {
            size++;
            current = current.getNext();
        }
        return size;
    }
}