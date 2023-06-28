// Nome: Leonardo Canuto Junior - RA: 2453533

public class Regiao{
	
	private String uf;
	private String cidade;
	private String bairro;
	private String cep;

// =======================================

// ============ CONSTRUTORES =============

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

// =======================================

// ============ GETTERS ==================

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

// ============ SETTERS ==================

	public final void setUf(String uf) throws UfException{

		uf = uf.toUpperCase();
		if(uf.equals("RO") || uf.equals("AC") || uf.equals("AM") || uf.equals("RR") || uf.equals("PA") || uf.equals("AP") || uf.equals("TO") || uf.equals("MA") || uf.equals("PI") || uf.equals("CE") || uf.equals("RN") || uf.equals("PB") || uf.equals("PE") || uf.equals("AL") || uf.equals("SE") || uf.equals("BA") || uf.equals("MG") || uf.equals("ES") || uf.equals("RJ") || uf.equals("SP") || uf.equals("PR") || uf.equals("SC") || uf.equals("RS") || uf.equals("MS") || uf.equals("MT") || uf.equals("GO") || uf.equals("DF")){
			this.uf = uf;
		}else{
			throw new UfException();
		}

	}

	public final void setCidade(String cidade){
		this.cidade = cidade;
	}

	public final void setBairro(String bairro){
		this.bairro = bairro;
	}

	public final void setCep(String cep) throws CepException{

		if(cep.length() >= 8 && cep.length() <=10){
			if(cep.matches("[0-9]*")){
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