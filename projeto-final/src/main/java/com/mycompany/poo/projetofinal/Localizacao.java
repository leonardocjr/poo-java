// Nome: Leonardo Canuto Junior - RA: 2453533
package com.mycompany.poo.projetofinal;

public class Localizacao{

	private String rua;
	private int numero;
	private Regiao reg;

	public Localizacao(){
            rua = "";
            numero = 0;
            reg = new Regiao();
	}

// ============= SOBRECARGA ==============
	public Localizacao(String rua, int numero, Regiao reg){
            this.rua = rua;
            this.numero = numero;
            this.reg = reg;
	}
	public Localizacao(Localizacao lc){
            this.rua = lc.getRua();
            this.numero = lc.getNumero();
            this.reg = lc.getReg();
	}

	public String getRua(){
            return rua;
	}

	public int getNumero(){
            return numero;
	}

	public Regiao getReg(){
            return reg;
	}
	public final void setRua(String rua){
            this.rua = rua;
	}
	public final void setNumero(int numero) throws ZeroNegException{
            if(numero > 0)
                this.numero = numero;
            else
                throw new ZeroNegException();
	}
	public final void setReg(Regiao reg){
            this.reg = reg;
	}
}