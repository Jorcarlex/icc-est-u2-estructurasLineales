import materia.Stacks.Stack;

public class App {
    public static void main(String[] args) throws Exception {
        // Llamar al método runStack
        runStack();
    }

    public static void runStack() {
        Stack stack = new Stack();
        
        // Agregar elementos a la pila
        stack.push(5);
        stack.push(4);
        stack.push(9);

        // Mostrar los valores
        System.out.println("Cima => " + stack.peek());
        System.out.println("Retirar => " + stack.pop());
        System.out.println("Cima => " + stack.peek());
        System.out.println("Retirar => " + stack.pop());
        System.out.println("Cima => " + stack.peek());
        System.out.println("Imprimir tamaño => " + stack.getSize());
        // Imprimir todos los elementos de la pila
        System.out.println("Elementos restantes en la pila:");
        stack.printStack();
    }
}