import java.util.Scanner;

public class SituacaoAluno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();
        
        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();
        
        double media = (nota1 + nota2) / 2;
        System.out.println("Média: " + media);
        
        if (media >= 7) {
            System.out.println("Situação: Aprovado");
        } else if (media >= 5) {
            System.out.println("Situação: Recuperação");
        } else {
            System.out.println("Situação: Reprovado");
        }
        
        scanner.close();
    }
}
