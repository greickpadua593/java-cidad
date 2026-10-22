import java.util.Scanner;

public class ValidaSenha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String senhaCorreta = "java123";
        String senhaDigitada;
        
        System.out.print("Digite a senha: ");
        senhaDigitada = scanner.next();
        
        while (!senhaDigitada.equals(senhaCorreta)) {
            System.out.print("Senha incorreta! Tente novamente: ");
            senhaDigitada = scanner.next();
        }
        
        System.out.println("Acesso concedido!");
        scanner.close();
    }
}

