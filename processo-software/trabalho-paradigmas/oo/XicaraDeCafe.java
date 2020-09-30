// Aqui, criamos a classe que representará uma xicara de café (Objeto)
public class XicaraDeCafe {

    // Cada objeto XicaraDeCafe deverá armazenar uma quantidade de café
    private float quantidade;

    // Método construtor, onde são definidos os comportamentos executados
    // ao criar uma nova instancia de XicaraDeCafe
    public XicaraDeCafe(float quantidade) {
        this.quantidade = quantidade;
    }

    // No método encher(), faremos com a quantidade de café que o objeto armazena
    // seja setada para 100%
    public void encher() {
        this.quantidade = 1F;
    }

    // Método getter que retornará a quantidade de café
    public float getQuantidade() {
        return this.quantidade;
    }

}


