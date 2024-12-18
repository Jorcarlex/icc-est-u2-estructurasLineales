package materia.Ejercicio_02_sorting;

import java.util.Scanner;
import java.util.Stack;

public class StackSorter {
    /*
     * ush: Añadir un elemento a la parte superior de la pila.
     * Pop: Remover el elemento de la parte superior de la pila.
     * Peek: Recuperar el elemento en la parte superior de la pila sin removerlo.
     * isEmpty: Verificar si la pila está vacía.
     */

    // Implementar un algoritmo que ordene un Stack de forma que los elementos
    // más pequeños queden en el tope del Stack. Se permite usar un Stacks
    // adicionales,
    // pero no está permitido copiar los elementos a otra estructura de datos.

    // Metodo para ordenar 
    public void sortStack(Stack<Integer> stack) {
        Stack<Integer> tempStack = new Stack<>();

        while (!stack.isEmpty()) {
            int current = stack.pop();

            while (!tempStack.isEmpty() && tempStack.peek() > current) {
                stack.push(tempStack.pop());
            }

            tempStack.push(current);
        }

        while (!tempStack.isEmpty()) {
            stack.push(tempStack.pop());
        }
    }

    // Metodo para manejar las interacciones
    public void sorter() {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        System.out.println("========|EJERCICIO #2|========");
        System.out.println("Ingrese números (escriba 'order' para ordenar):");

        while (true) {
            System.out.print("Input: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("order")) {
                sortStack(stack);
                System.out.print("Output ");
                while (!stack.isEmpty()) {
                    System.out.print(stack.pop());
                    if (!stack.isEmpty()) {
                        System.out.print("->");
                    }
                }
                System.out.println();
                break;
            }

            try {
                int number = Integer.parseInt(input.trim());
                stack.push(number);
            } catch (NumberFormatException e) {
                System.out.println("Ingrese un número válido o 'order' para terminar.");
            }
        }

        scanner.close();
    }
}
