import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TesteHashSetCPF {
   public static void main(String[] args) {
      Set<String> cpfSet = new HashSet<>();
      Scanner s = new Scanner(System.in);

      System.out.println("Digite 10 CPFs:");
      for (int i = 0; i < 10; i++) {
          System.out.print("CPF " + (i + 1) + ": ");
          String cpf = s.nextLine();
          cpfSet.add(cpf);
      }

      System.out.println("CPF armazenados no conjunto:");
      for (String cpf : cpfSet) {
          System.out.println(cpf);
      }

      System.out.println("Verificando CPFs repetidos:");
      Set<String> cpfRepetidos = new HashSet<>();
      for (String cpf : cpfSet) {
          if (cpfSet.contains(cpf) && !cpfRepetidos.add(cpf)) {
              System.out.println("CPF repetido: " + cpf);
          }
      }
   } 
}
