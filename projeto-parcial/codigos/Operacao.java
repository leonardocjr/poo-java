// Nome: Leonardo Canuto Junior - RA: 2453533

public class Operacao{

	private boolean habilitado;
	private double valor;

// =======================================

// ============ CONSTRUTORES =============

	public Operacao(){

		habilitado = false;
		valor = 0.0;

	}

// ============= SOBRECARGA ==============

	public Operacao(boolean habilitado, double valor){

		this.habilitado = habilitado;
		this.valor = valor;

	}

	public Operacao(Operacao opr){

		this.habilitado = opr.habilitado;
		this.valor = opr.valor;

	}

// =======================================

// ============ GETTERS ==================

	public boolean getHabilitado(){
		return habilitado;
	}

	public double getValor(){
		return valor;
	}

// ============ GETTERS ==================

	public final void setHabilitado(boolean habilitado){
		this.habilitado = habilitado;
	}

	public final void setValor(double valor){
		this.valor = valor;
	}

}