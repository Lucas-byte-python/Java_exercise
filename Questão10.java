import java.util.Scanner; // Importando a classe Scanner para entrada de dados

public class Questão10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Criando um objeto Scanner para entrada de dados
        System.out.print("Digite o valor em reais que você tem na carteira: ");
        double valorEmReais = scanner.nextDouble(); // Lendo o valor em reais fornecido pelo usuário

        // Definindo a taxa de câmbio (U$$1,00 = R$3,37)
        double taxaCambio = 3.37;

        // Calculando quantos dólares podem ser comprados com o valor em reais fornecido
        double valorEmDolares = valorEmReais / taxaCambio;

        // Exibindo o resultado
        System.out.println("Com R$" + valorEmReais + " você pode comprar aproximadamente U$$" + String.format("%.2f", valorEmDolares));

        scanner.close(); // Fechando o scanner para liberar os recursos
    }
}
