package classes;

import static java.time.Clock.system;



public class Carro extends Automoveis {
    
    public Integer portas = 4;
    public Integer velocidade = 10;
    public Integer velocidadeMaxima;

    public Integer getPortas() {
        return portas;
    }

    public void setPortas(Integer portas) {
        this.portas = portas;
    }

    public Integer getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(Integer velocidade) {
        this.velocidade = velocidade;
    }

    public Integer getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(Integer velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }
    
    public void Carro (){
        if(velocidadeMaxima <= 110){
        } else {
            System.out.println("Acima da velocidade");
        }
    }
    
}
