
import java.util.ArrayList;

class Veiculo {
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

    public String toString() {
        return marca + " " + modelo + " - " + ano + " | R$" + preco + " | " + cor + " | " + km + "km | " + (disponivel ? "Disponível" : "Vendido");
    }
}

public class EstoqueVeiculos {
    private ArrayList<Veiculo> listaVeiculos = new ArrayList<>();

    public void adicionarVeiculo(Veiculo v) { listaVeiculos.add(v); }

    public void listarVeiculos() {
        for (Veiculo v : listaVeiculos) {
            System.out.println(v);
        }
    }

    public static void main(String[] args) {
        Veiculo v1 = new Veiculo("Toyota", "Corolla", 2020, 90000.0, "Preto", 30000, true);
        Veiculo v2 = new Veiculo("Fiat", "Argo", 2019, 55000.0, "Branco", 40000, true);

        EstoqueVeiculos estoque = new EstoqueVeiculos();
        estoque.adicionarVeiculo(v1);
        estoque.adicionarVeiculo(v2);

        System.out.println("LISTA DE VEÍCULOS:");
        estoque.listarVeiculos();
    }
}
