//Nome: Leonardo Canuto Junior -  RA: 2453533

public class Motor{
	
	private int qtdPistoes;
	private int potencia;

//===============================================

//=============	CONSTRUTORES	=============

	public Motor(){
		qtdPistoes = 0;
		potencia = 0;
	}

	public Motor(int qtdPistoes, int potencia){
		this.qtdPistoes = qtdPistoes;
		this.potencia = potencia;
	}
	
	public Motor(Motor mot){
		qtdPistoes = mot.getQtdPistoes();
		potencia = mot.getPotencia();
	}

//===============================================

//================	GETTERS	=============

	public int getQtdPistoes(){
		return qtdPistoes;
	}

	public int getPotencia(){
		return potencia;
	}

//================	SETTERS	=============

	public void setQtdPistoes(int qtdPistoes){
		this.qtdPistoes = qtdPistoes;
	}

	public void setPotencia(int potencia){
		this.potencia = potencia;
	}

}