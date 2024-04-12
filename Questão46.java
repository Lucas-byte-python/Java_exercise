public class Questão46 {
    public static void main(String[] args) {
        // Laço regressivo de 10 até 0
        for (int i = 10; i >= 0; i--) {
            System.out.println(i); // Mostra o número atual
            // Pausa de 1 segundo
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // Ao final da contagem, mostra "Estourou!"
        System.out.println("Estourou!");
    }
}
