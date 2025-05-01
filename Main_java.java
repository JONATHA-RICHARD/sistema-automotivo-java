
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

    public void atualizarPreco(double novoPreco) { this.preco = novoPreco; }
    public void atualizarDisponibilidade(boolean status) { this.disponivel = status; }

    public String toString() {
        return marca + " " + modelo + " - " + ano + " | R$" + preco + " | " + cor + " | " + km + "km | " + (disponivel ? "Disponível" : "Vendido");
    }
}

class EstoqueVeiculos {
    private ArrayList<Veiculo> listaVeiculos = new ArrayList<>();

    public void adicionarVeiculo(Veiculo v) { listaVeiculos.add(v); }

    public void listarVeiculos() {
        for (Veiculo v : listaVeiculos) {
            System.out.println(v);
        }
    }

    public void atualizarPreco(int index, double novoPreco) {
        if (index >= 0 && index < listaVeiculos.size()) {
            listaVeiculos.get(index).atualizarPreco(novoPreco);
        }
    }

    public void removerVeiculo(int index) {
        if (index >= 0 && index < listaVeiculos.size()) {
            listaVeiculos.remove(index);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        EstoqueVeiculos estoque = new EstoqueVeiculos();

        Veiculo carro1 = new Veiculo("Toyota", "Corolla", 2020, 90000.0, "Preto", 30000, true);
        Veiculo carro2 = new Veiculo("Fiat", "Argo", 2019, 55000.0, "Branco", 40000, true);

        estoque.adicionarVeiculo(carro1);
        estoque.adicionarVeiculo(carro2);

        System.out.println("LISTA INICIAL:");
        estoque.listarVeiculos();

        System.out.println("\nATUALIZANDO PREÇO DO COROLLA...");
        estoque.atualizarPreco(0, 87000.0);
        estoque.listarVeiculos();

        System.out.println("\nREMOVENDO O ARGO...");
        estoque.removerVeiculo(1);
        estoque.listarVeiculos();
    }
}
