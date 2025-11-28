import java.util.Scanner;
public class Lista04Programa06{
	public static void main(String[] args) {
	Scanner scanner = new Scanner (System.in);

	double nota;
	double soma = 0;
	double maior = Double.MIN_VALUE;
	double menor = Double.MAX_VALUE;
	int totalNotas = 0;
	int aprovados = 0;
	int recuperacao = 0;
	int reprovados = 0;

	System.out.println("Digite as notas dos alunos (digite -1 para encerrar):");

	while (true) {
		System.out.print("Nota: ");
		nota = scanner.nextDouble();

		if (nota == -1) {
			break;
		}

		// Ignora notas inválidas (opcional)
		if (nota < 0 || nota > 100) {
			System.out.println("Nota inválida. Digite uma nota entre 0 e 100.");
			continue;
		}

		soma += nota;
		totalNotas++;

		if (nota > maior) maior = nota;
		if (nota < menor) menor = nota;

		if (nota >= 70) {
			aprovados++;
		} else if (nota >= 40) {
			recuperacao++;
		} else {
			reprovados++;
		}
	}

	if (totalNotas > 0) {
		double media = soma / totalNotas;

		System.out.println("\n--- Resultado ---");
		System.out.printf("Média das notas: %.2f\n", media);
		System.out.printf("Maior nota: %.2f\n", maior);
		System.out.printf("Menor nota: %.2f\n", menor);
		System.out.println("Alunos aprovados: " + aprovados);
		System.out.println("Alunos em recuperação: " + recuperacao);
		System.out.println("Alunos reprovados: " + reprovados);
	} else {
		System.out.println("Nenhuma nota válida foi digitada.");
	}

	scanner.close();
}
}