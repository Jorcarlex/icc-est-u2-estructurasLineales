package models;

import materia.models.NodeGenerico;

public class LinkedList <T>{

    private NodeGenerico<T> head; //referencia al primer nodo
    private int size = 0; //contador del numero de nodos

    public void appendToTail(T value){
        if (head == null) {
            head = new NodeGenerico<>(value);
        } else{
            NodeGenerico<T> current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(new NodeGenerico<>(value));
        }

        size++;
    }


    public void print(){
        NodeGenerico<T>current = head;
        while (current !=null) {
            System.out.println(current.getValue() );
            current = current.getNext();
        }
    }

    //Constructor
    public LinkedList(NodeGenerico<T> head, int size) {
        this.head = head;
        this.size = size;
    }

    public LinkedList() {
        this.head = null;
        this.size = 0;
    }
    
    
    public NodeGenerico<T> getHead() {
        return head;
    }
    public void setHead(NodeGenerico<T> head) {
        this.head = head;
    }
    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }
}
