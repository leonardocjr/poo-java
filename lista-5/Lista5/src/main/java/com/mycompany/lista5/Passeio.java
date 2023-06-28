//Nome: Leonardo Canuto Junior -  RA: 2453533
package com.mycompany.lista5;

public final class Passeio extends Veiculo implements Calc{

	private int qtdePassageiro;

//===============================================

//=============	CONSTRUTORES	=============

	public Passeio(){
		qtdePassageiro = 0;
	}

	public Passeio(int qtdePassageiro){
		this.qtdePassageiro = qtdePassageiro;
	}

	public Passeio(Passeio pass){
		qtdePassageiro = pass.getQtdePassageiro();
	}

//===============================================

	public final int calcVel(){
		return (getVelocMax()*1000);
	}

//===============================================

//================	INTERFACE	=============

	public final void calcular(){
		int sum = 0;
		if(getPlaca()!=null){
			for(int i=0; i<getPlaca().length(); i++){
				if(Character.isLetter(getPlaca().charAt(i)) == true)
					sum++;
			}
		}
		if(getMarca()!=null){
			for(int i=0; i<getMarca().length(); i++){
				if(Character.isLetter(getMarca().charAt(i)) == true)
					sum++;
			}
		}
		if(getModelo()!=null){
			for(int i=0; i<getModelo().length(); i++){
				if(Character.isLetter(getModelo().charAt(i)) == true)
					sum++;
			}
		}
		if(getCor()!=null){
			for(int i=0; i<getCor().length(); i++){
				if(Character.isLetter(getCor().charAt(i)) == true)
					sum++;
			}
		}
		if(getDataCadastro()!=null){
			for(int i=0; i<getDataCadastro().length(); i++){
				if(Character.isLetter(getDataCadastro().charAt(i)) == true)
					sum++;
			}
		}

		System.out.println("|*-> A soma de todas as letras em todas string desse objeto: " + sum);
	}

//===============================================

//================	GETTERS	=============

	public final int getQtdePassageiro(){
		return qtdePassageiro;
	}

//================	SETTERS	=============

	public final void setQtdePassageiro(int qtdePassageiro){
		this.qtdePassageiro = qtdePassageiro;
	}

}