package entities;

// Exercício 10: Classe Abstrata
// • Crie as classes Carro e Moto que herdem de Veiculo.
// • Implemente o método mover em ambas as classes, exibindo mensagens apropriadas para cada tipo de veículo.

public class Moto extends Veiculo{

    @Override
    public void mover() {
        System.out.println("O Moto está se movendo.");
    }    
}
