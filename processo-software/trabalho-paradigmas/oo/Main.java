public class Main {

    public static void main(String[] args) {
        // Instanciamos um novo objeto da classe XicaraDeCafe,
        // passando a quantidade inicial como 10% de café
        XicaraDeCafe xicaraDeCafe = new XicaraDeCafe(0.1F);

        // Inicialmente, irá exibir 10% de café
        printarQuantidadeCafe(xicaraDeCafe);

        // Chama-se o método encher() do objeto,
        // e o mesmo fará a xícara encher (100% de quantidade)
        xicaraDeCafe.encher();

        // O mesmo objeto, agora irá exibir 100%
        printarQuantidadeCafe(xicaraDeCafe);
    }

    // Método auxiliar, apenas para evitar repetição de código
    // Recebe um objeto XicaraDeCafe e exibe o valor da quantidade em tela
    private static void printarQuantidadeCafe(XicaraDeCafe xicara) {
        System.out.printf("Quantidade de café: %.1f%%%n", xicara.getQuantidade() * 100);
    }

}
