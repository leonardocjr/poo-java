// Nome: Leonardo Canuto Junior - RA: 2453533

public class Contrato{

	private boolean ocupado;
	private Corretor corretor;
	private Operacao aluguel;
	private Operacao compra;
	private double imposto;

// =======================================

// ============ CONSTRUTORES =============

	public Contrato(){

		ocupado = false;
		corretor = new Corretor();
		aluguel = new Operacao();
		compra = new Operacao();
		imposto = 0.0;

	}

// ============= SOBRECARGA ==============

	public Contrato(boolean ocupado, Corretor corretor, Operacao aluguel, Operacao compra, double imposto){

		this.ocupado = ocupado;
		this.corretor = corretor;
		this.aluguel = aluguel;
		this.compra = compra;
		this.imposto = imposto;

	}

	public Contrato(Contrato ctr){

		this.ocupado = ctr.ocupado;
		this.corretor = ctr.corretor;
		this.aluguel = ctr.aluguel;
		this.compra = ctr.compra;
		this.imposto = ctr.imposto;

	}

// =======================================

// ============ GETTERS ==================

	public boolean getOcupado(){
		return ocupado;
	}

	public Corretor getCorretor(){
		return corretor;
	}

	public Operacao getAluguel(){
		return aluguel;
	}

	public Operacao getCompra(){
		return compra;
	}

	public double getImposto(){
		return imposto;
	}

// ============ SETTERS ==================

	public final void setOcupado(boolean ocupado){
		this.ocupado = ocupado;
	}

	public final void setCorretor(Corretor corretor){
		this.corretor = corretor;
	}

	public final void setAluguel(Operacao aluguel){
		this.aluguel = aluguel;
	}

	public final void setCompra(Operacao compra){
		this.compra = compra;
	}

	public final void setImposto(double imposto) throws NegativoException{
		if(imposto > -1)
			this.imposto = imposto;
		else
			throw new NegativoException();
	}

}