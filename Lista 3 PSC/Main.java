import java.util.ArrayList;

import entities.*;

public class Main {
    public static void main(String[] args) {

        // Exercício 8: Polimorfismo com Interfaces
        // • Crie objetos de Funcionario e Gerente e adicione-os à empresa, demonstrando
        // o polimorfismo.

        Empresa una = new Empresa();
        una.adicionarTrabalhador(new Funcionario());
        una.adicionarTrabalhador(new Gerente(1200, "null", 0));

        System.out.println();
        // Exercício 9: Polimorfismo com Classes
        // Objetivo: Demonstrar o polimorfismo usando classes.
        // • Crie uma lista de objetos do tipo Pessoa.
        // • Adicione objetos Pessoa e Estudante na lista.
        // • Itere sobre a lista e chame o método exibirInformacoes para cada objeto,
        // demonstrando o polimorfismo.

        ArrayList<Pessoa> lista = new ArrayList<>();
        lista.add(new Pessoa("Joao Carlos"));
        lista.add(new Pessoa("Alex Green"));
        lista.add(new Estudante("Rodrigo Castor", "ADS"));
        lista.add(new Estudante("Marcelo Carioca", "Vendas"));

        for (Pessoa pessoa : lista) {
            pessoa.exibirInformacoes();
        }

        System.out.println();
        // Exercício 10: Classe Abstrata
        // • Crie uma lista de objetos do tipo Veiculo e adicione objetos Carro e Moto na lista.
        // • Itere sobre a lista e chame o método mover para cada objeto, demonstrando o polimorfismo.

        ArrayList<Veiculo> lista2 = new ArrayList<>();
        lista2.add(new Carro());
        lista2.add(new Carro());
        lista2.add(new Moto());
        lista2.add(new Carro());
        lista2.add(new Moto());
        
        for (Veiculo veiculo : lista2) {
            veiculo.mover();
        }
    }
}