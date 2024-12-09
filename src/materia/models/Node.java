package materia.models;

public class Node {
    private int value; //valor del nodo
    private Node next; //referencia al siguiente nodo

    public Node (int value){
        this.value = value;
        this.next = null;
    }

    public void setValue(int value){
        this.value = value;
    }

    public int getValue(){
        return value;
    }

    public void setNext(Node next){
        this.next = next;
    }

    public Node getNext(){
        return next;
    }

    @Override
    public String toString(){
        return "Nodo{value=" + value + '}'; 
    }
}
