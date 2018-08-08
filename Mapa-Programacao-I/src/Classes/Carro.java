package Classes;

public class Carro extends Automoveis {
	
	public String marca;
	public String modelo;
	public String cor;
	public Integer anoFabricacao;
	public Integer portas = 4;
	public Integer aceleracao = 10;
	
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
	public Integer getPortas() {
		return portas;
	}
	public void setPortas(Integer portas) {
		this.portas = portas;
	}
	public Integer getAceleracao() {
		return aceleracao;
	}
	public void setAceleracao(Integer aceleracao) {
		this.aceleracao = aceleracao;
	}

	public void velocidade () {
		Integer velocidade = 0;
		
		for(Integer contador = 0; contador > 110; contador++ ) {
			if (contador > 110) {
				System.out.println("Acima da velocidade!!!");
			} 	
		}
	}
	
	public void acelerar () {
		Integer acelerar = 0;
		
		for(Integer contador = 0; contador > acelerar; contador++) {
			if(contador = 10 != null) {
				
			}
		}
	}
	
}