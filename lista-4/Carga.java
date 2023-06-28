//Nome: Leonardo Canuto Junior -  RA: 2453533

public final class Carga extends Veiculo implements Calc{

	private int tara;
	private int cargaMax;

//===============================================

//=============	CONSTRUTORES	=============

	public Carga(){
		tara = 0;
		cargaMax = 0;
	}

	public Carga(int tara, int cargaMax){
		this.tara = tara;
		this.cargaMax = cargaMax;
	}

	public Carga(Carga carg){
		tara = carg.getTara();
		cargaMax = carg.getCargaMax();
	}

//===============================================

	public final int calcVel(){
		return (getVelocMax()*100000);
	}

//===============================================

//================	INFERFACE	=============

	public final void calcular(){
		int sum = 0;

		if(getMotor().getQtdPistoes()>0)
			sum+=getMotor().getQtdPistoes();

		if(getMotor().getPotencia()>0)
			sum+=getMotor().getPotencia();

		if(getQtdRodas()>0)
			sum+=getQtdRodas();

		if(getVelocMax()>0)
			sum+=getVelocMax();

		if(getTara()>0)
			sum+=getTara();

		if(getCargaMax()>0)
			sum+=getCargaMax();

		System.out.println("|*-> Soma total de todos inteiros desse objeto: " + sum);
	}

//===============================================

//================	GETTERS	=============

	public final int getTara(){
		return tara;
	}

	public final int getCargaMax(){
		return cargaMax;
	}

//================	SETTERS	=============

	public final void setTara(int tara){
		this.tara = tara;
	}

	public final void setCargaMax(int cargaMax){
		this.cargaMax = cargaMax;
	}

}