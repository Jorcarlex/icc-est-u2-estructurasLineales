package materia.models;

public class Node {

    private int valor;
    private Node next;

    
    public Node (int valor){
        this.valor=valor;
        this.next=null;
    }

    public int getValor() {
    return valor;
    }

    public void node(){
        this.next=null;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Nodo [valor=" + valor + ", next=" + next + "]";
    }
    
    

}