package classes;

import java.util.Date;

public class Automoveis {
   
    public String marca;
    public String modelo;
    public String cor;
    private Integer anoFabricacao;
    private Boolean motor;
    
    public Boolean ligar; 
    public Boolean desligar;
    public Boolean acelerar;
    public Boolean diminuir;
    public Double trocarPneus;
    public String exibirEstado;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Integer getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(Integer anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public Boolean getMotor() {
        return motor;
    }

    public void setMotor(Boolean motor) {
        this.motor = motor;
    }

    public Boolean getLigar() {
        return ligar;
    }

    public void setLigar(Boolean ligar) {
        this.ligar = ligar;
    }

    public Boolean getDesligar() {
        return desligar;
    }

    public void setDesligar(Boolean desligar) {
        this.desligar = desligar;
    }

    public Boolean getAcelerar() {
        return acelerar;
    }

    public void setAcelerar(Boolean acelerar) {
        this.acelerar = acelerar;
    }

    public Boolean getDiminuir() {
        return diminuir;
    }

    public void setDiminuir(Boolean diminuir) {
        this.diminuir = diminuir;
    }

    public Double getTrocarPneus() {
        return trocarPneus;
    }

    public void setTrocarPneus(Double trocarPneus) {
        this.trocarPneus = trocarPneus;
    }

    public String getExibirEstado() {
        return exibirEstado;
    }

    public void setExibirEstado(String exibirEstado) {
        this.exibirEstado = exibirEstado;
    }
  
    
    
}
   
