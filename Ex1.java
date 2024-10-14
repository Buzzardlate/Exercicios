package extarget;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Informe um número para verificar se ele pertence à sequência de Fibonacci: ");
        int num = scanner.nextInt();
        
        int a = 0, b = 1, temp;
        
        if (num == a || num == b) {
            System.out.println("O número "+num+" pertence à sequência de Fibonacci.");
            return;
        }
        
        while (b < num) {
            temp = a + b;
            a = b;
            b = temp;
        }
        
        if (b == num) {
            System.out.println("O número "+num+"pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número "+num+" NÃO pertence à sequência de Fibonacci.");
        }
    }
}
