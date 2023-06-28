// Nome: Leonardo Canuto Junior - RA: 2453533
package com.mycompany.poo.projetofinal;

public class Regiao{
	
	private String uf;
	private String cidade;
	private String bairro;
	private String cep;

	public Regiao(){
		uf = "";
		cidade = "";
		bairro = "";
		cep = "";
	}

// ============= SOBRECARGA ==============
	public Regiao(String uf, String cidade, String bairro, String cep){
		this.uf = uf;
		this.cidade = cidade;
		this.bairro = bairro;
		this.cep = cep;
	}
	public Regiao(Regiao reg){
		this.uf = reg.getUf();
		this.cidade = reg.getCidade();
		this.bairro = reg.getBairro();
		this.cep = reg.getCep();
	}

	public String getUf(){
		return uf;
	}
	public String getCidade(){
		return cidade;
	}
	public String getBairro(){
		return bairro;
	}
	public String getCep(){
		return cep;
	}
	public final void setUf(String uf){
		this.uf = uf;
	}
	public final void setCidade(String cidade){
		this.cidade = cidade;
	}
	public final void setBairro(String bairro){
		this.bairro = bairro;
	}
	public final void setCep(String cep) throws CepException{

		if(cep.length() >= 8 && cep.length() <=11){
			if(cep.matches("[0-9]*") && cep.length() <=10){
				this.cep = cep.substring(0,(cep.length()-3)) + "-" + cep.substring((cep.length()-3));
			}else if(cep.indexOf("-") == (cep.length()-4)){
				for(int i = 0; i < cep.indexOf("-"); i++){
					if(!Character.isDigit(cep.charAt(i)))
						throw new CepException();
				}
				for(int i = (cep.indexOf("-")+1); i < cep.length(); i++){
					if(!Character.isDigit(cep.charAt(i)))
						throw new CepException();
				}
				this.cep = cep;
			}else{
				throw new CepException();
			}
		}else{
			throw new CepException();
		}
	}
}