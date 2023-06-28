// Nome: Leonardo Canuto Junior - RA: 2453533

public class Corretor{

	private String nome;
	private String ddd;
	private String telefone;
	private String celular;

// =======================================

// ============ CONSTRUTORES =============

	public Corretor(){

		nome = "";
		ddd = "";
		telefone = "";
		celular = "";

	}

// ============= SOBRECARGA ==============

	public Corretor(String nome, String ddd, String telefone, String celular){

		this.nome = nome;
		this.ddd = ddd;
		this.telefone = telefone;
		this.celular = celular;

	}

	public Corretor(Corretor crrt){

		this.nome = crrt.nome;
		this.ddd = crrt.ddd;
		this.telefone = crrt.telefone;
		this.celular = crrt.celular;

	}

// =======================================

// ============ GETTERS ==================

	public String getNome(){
		return nome;
	}

	public String getDdd(){
		return ddd;
	}

	public String getTelefone(){
		return telefone;
	}

	public String getCelular(){
		return celular;
	}

// ============ SETTERS ==================

	public final void setNome(String nome){
		this.nome = nome;
	}

	public final void setDdd(String ddd){
		this.ddd = ddd;
	}

	public final void setTelefone(String telefone){
		this.telefone = telefone;
	}

	public final void setCelular(String celular){
		this.celular = celular;
	}

}