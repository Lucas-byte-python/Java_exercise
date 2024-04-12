import java.util.Scanner;

public class Questão26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Criando um objeto Scanner para entrada de dados
        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine(); // Lendo a frase fornecida pelo usuário

        // Convertendo a frase para minúsculas para facilitar a comparação
        frase = frase.toLowerCase();

        // Inicializando variáveis para contar a quantidade de letras 'a' e para armazenar a posição da primeira ocorrência
        int quantidadeA = 0;
        int primeiraPosicaoA = -1;
        int ultimaPosicaoA = -1;

        // Percorrendo a frase para encontrar as ocorrências da letra 'a'
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == 'a') {
                quantidadeA++; // Incrementando a quantidade de letras 'a'
                if (primeiraPosicaoA == -1) {
                    primeiraPosicaoA = i + 1; // Armazenando a posição da primeira ocorrência (considerando posição 1)
                }
                ultimaPosicaoA = i + 1; // Atualizando a posição da última ocorrência (considerando posição 1)
            }
        }

        // Exibindo os resultados
        System.out.println("Quantidade de vezes que 'A' aparece: " + quantidadeA);
        if (primeiraPosicaoA != -1) {
            System.out.println("Posição da primeira ocorrência: " + primeiraPosicaoA);
            System.out.println("Posição da última ocorrência: " + ultimaPosicaoA);
        } else {
            System.out.println("A letra 'A' não foi encontrada na frase.");
        }

        scanner.close(); // Fechando o scanner para liberar os recursos
    }
}
