import java.util.HashMap;

public class Questão76 {
    public static void main(String[] args) {
        // Criando um HashMap para armazenar os produtos e seus preços
        HashMap<String, Double> produtos = new HashMap<>();

        // Adicionando produtos e preços ao HashMap
        produtos.put("Arroz", 6.50);
        produtos.put("Feijão", 12.00);
        produtos.put("Macarrão", 7.99);
        produtos.put("Sal", 1.50);
        produtos.put("Ovo", 2.00);

        // Mostrando a listagem de preços em forma tabular
        System.out.println("=== Listagem de Preços ===");
        System.out.println("Produto\t\t\t\t\tPreço");
        for (String produto : produtos.keySet()) {
            System.out.printf("%s\t\t\t\t\tR$ %.2f%n", produto, produtos.get(produto));
        }
    }
}
