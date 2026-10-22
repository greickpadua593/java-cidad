import java.util.Scanner;

public class MenuIterativo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        
        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Consultar");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            
            switch (opcao) {
                case 1:
                    System.out.println("Executando: Cadastrar...");
                    break;
                case 2:
                    System.out.println("Executando: Consultar...");
                    break;
                case 0:
                    System.out.println("Saindo do sistema. Até logo!");
                    break;
                default:
                    System.out.println("Opção inválida! Escolha novamente.");
            }
        } while (opcao != 0);
        
        scanner.close();
    }
}
