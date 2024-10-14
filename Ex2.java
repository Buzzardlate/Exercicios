package extarget;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe uma string: ");
        String entry = scanner.nextLine();
        
        int cont = 0;
        
        for (int i = 0; i < entry.length(); i++) {
            char c = entry.charAt(i);
            if (c == 'a' || c == 'A') {
                cont++;
            }
        }
        System.out.println("A letra 'a' ou 'A' aparece "+cont+" vezes na string.");
    }
}
