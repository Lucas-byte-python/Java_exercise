import java.util.Scanner; // Importando a classe Scanner para entrada de dados

public class Questão06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Criando um objeto Scanner para entrada de dados
        System.out.print("Digite um número: ");
        double numero = scanner.nextDouble(); // Lendo o número fornecido pelo usuário

        // Calculando e exibindo o dobro, triplo e raiz quadrada do número
        double dobro = numero * 2;
        double triplo = numero * 3;
        double raizQuadrada = Math.sqrt(numero);

        System.out.println("O dobro de " + numero + " é: " + dobro);
        System.out.println("O triplo de " + numero + " é: " + triplo);
        System.out.println("A raiz quadrada de " + numero + " é: " + raizQuadrada);

        scanner.close(); // Fechando o scanner para liberar os recursos
    }
}
