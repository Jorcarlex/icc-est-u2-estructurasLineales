package models;

import Materia.Models.NodeGenerico;

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

    public void findByValue(T value){

    }

    public void print(){
        if (head == null) {
            System.out.println("END");
            return; //Hace que salga del metodo
        }
        NodeGenerico<T>current = head;
        while (current.getNext()!=null) {
            System.out.println(current.getValue() + "->");
            current = current.getNext();
        }
        System.out.println("END");
    }


    //Constructor
    public LinkedList(NodeGenerico<T> head, int size) {
        this.head = head;
        this.size = size;
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
