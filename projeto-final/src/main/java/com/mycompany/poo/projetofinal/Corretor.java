// Nome: Leonardo Canuto Junior - RA: 2453533
package com.mycompany.poo.projetofinal;

public class Corretor{

	private String nome;
	private String ddd;
	private String telefone;

	public Corretor(){
            nome = "";
            ddd = "";
            telefone = "";
	}

// ============= SOBRECARGA ==============
	public Corretor(String nome, String ddd, String telefone){
            this.nome = nome;
            this.ddd = ddd;
            this.telefone = telefone;
	}
	public Corretor(Corretor crrt){
            this.nome = crrt.nome;
            this.ddd = crrt.ddd;
            this.telefone = crrt.telefone;
	}

	public String getNome(){
            return nome;
	}
	public String getDdd(){
            return ddd;
	}
	public String getTelefone(){
            return telefone;
	}
	public final void setNome(String nome){
            this.nome = nome;
	}
	public final void setDdd(String ddd){
            this.ddd = ddd;
	}
	public final void setTelefone(String telefone){
            this.telefone = telefone;
	}
}