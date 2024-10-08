import java.util.Scanner;

public class SituacaoAcademica {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a nota 1: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a nota 2: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a nota 3: ");
        double nota3 = scanner.nextDouble();


        aluno aluno = new aluno(nome, nota1, nota2, nota3);


        System.out.println("Aluno: " + aluno.getNome());
        System.out.printf("Média: %.2f\n", aluno.calcularMedia());

        System.out.println("Situação: " + aluno.verificarSituacao());

        scanner.close();
    }
}
