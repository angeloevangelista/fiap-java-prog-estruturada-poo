public class Carro {
    int tamanhoRoda;
    String modelo;
    double quantidadeCombustivel;

    public Carro(int tamanhoRoda, String modelo, float quantidadeCombustivel) {
        this.tamanhoRoda = tamanhoRoda;
        this.modelo = modelo;
        this.quantidadeCombustivel = quantidadeCombustivel;
    }

    public void exibir() {
        System.out.printf("Modelo: %s\n", this.modelo);
        System.out.printf("Combustivel: %s\n", this.quantidadeCombustivel);
        System.out.printf("Tamanho roda: %s\n", this.tamanhoRoda);
    }

    public void andar(float metros) {
        double quantidadeCombustivelAposViagem =  this.quantidadeCombustivel - (metros * 0.75);

        if (quantidadeCombustivelAposViagem < 0) {
            System.out.println("Opa! O carro não tem combustivel suficiente!");
            return;
        }

        System.out.printf("O carro andou %f metros", metros);

        this.quantidadeCombustivel = quantidadeCombustivelAposViagem;
    }
}
