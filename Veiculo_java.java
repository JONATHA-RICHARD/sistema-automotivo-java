
public class Veiculo {
    private String marca, modelo, cor;
    private int ano, km;
    private double preco;
    private boolean disponivel;

    public Veiculo(String marca, String modelo, int ano, double preco, String cor, int km, boolean disponivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.preco = preco;
        this.cor = cor;
        this.km = km;
        this.disponivel = disponivel;
    }

    public void atualizarPreco(double novoPreco) { this.preco = novoPreco; }

    public void atualizarDisponibilidade(boolean status) { this.disponivel = status; }

    public String toString() {
        return marca + " " + modelo + " - " + ano + " | R$" + preco + " | " + cor + " | " + km + "km | " + (disponivel ? "Disponível" : "Vendido");
    }

    public static void main(String[] args) {
        Veiculo v = new Veiculo("Honda", "Civic", 2022, 110000.0, "Cinza", 5000, true);
        System.out.println(v.toString());
    }
}
