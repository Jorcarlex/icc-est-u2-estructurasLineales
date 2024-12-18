package materia.Ejercicio_01_sign;

import java.util.Stack;
import java.util.Scanner;

public class SignValidator {
    /*
     * ush: Añadir un elemento a la parte superior de la pila.
     * Pop: Remover el elemento de la parte superior de la pila.
     * Peek: Recuperar el elemento en la parte superior de la pila sin removerlo.
     * isEmpty: Verificar si la pila está vacía.
     */

    // Implementar un algoritmo que determine si un string que solo
    // contiene los caracteres '(', ')', '{', '}', '[' y ']' es válido.

    // Metodo para ordenar
    public boolean isValid(String s) {
        if (s == null || s.isEmpty()) {
            return false;
        }

        Stack<Character> stack = new Stack<>();

        for (char cadena : s.toCharArray()) {
            if (cadena == '(' || cadena == '{' || cadena == '[') {
                stack.push(cadena);
            } else if (cadena == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (cadena == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if (cadena == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else {
                return false;
            }
        }

        return stack.isEmpty();
    }

    // Método para manejar las interacciones
    public void validator() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("========|EJERCICIO #1|========");
        System.out.println("Ingrese una cadena o escriba 'salir' para cerrar el programa:");

        while (true) {
            System.out.print("Input: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("salir")) {
                System.out.println("Cerrando el programa...");
                break;
            }

            boolean isValid = isValid(input);
            System.out.println("Output:" + isValid);
        }

        scanner.close();
    }
}
