//Nome: Leonardo Canuto Junior -  RA: 2453533

public abstract class Veiculo{

	private String placa;
	private String marca;
	private String modelo;
	private String cor;
	private int qtdRodas;
	private int velocMax;
	private Motor motor;
	private String dataCadastro;

//===============================================

//=============	CONSTRUTORES	=============

	public Veiculo(){
		placa = "";
		marca = "";
		modelo = "";
		cor = "";
		qtdRodas = 0;
		velocMax = 0;
		motor = new Motor();
	}

	public Veiculo(String placa, String marca, String modelo, String cor, int qtdRodas, int velocMax, Motor motor){

		this.placa = placa;
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.qtdRodas = qtdRodas;
		this.velocMax = velocMax;
		this.motor = motor;

	}

	public Veiculo(Veiculo v){

		placa = v.getPlaca();
		marca = v.getMarca();
		modelo = v.getModelo();
		cor = v.getCor();
		qtdRodas = v.getQtdRodas();
		velocMax = v.getVelocMax();
		motor = v.getMotor();

	}

//===============================================

	public abstract int calcVel();

//===============================================

//================	EXCEPTION	=============

	public final void setVelocMax(int velocMax) throws VelocMaxLimitException{
	
		if(velocMax <= 10 || velocMax >= 250){
			this.velocMax = 100;
			throw new VelocMaxLimitException();
		}else{
			this.velocMax = velocMax;
		}
	}

//===============================================

//================	GETTERS	=============

	public String getPlaca(){
		return placa;
	}

	public String getMarca(){
		return marca;
	}

	public String getModelo(){
		return modelo;
	}

	public String getCor(){
		return cor;
	}

	public int getQtdRodas(){
		return qtdRodas;
	}

	public int getVelocMax(){
		return velocMax;
	}

	public Motor getMotor(){
		return motor;
	}

	public String getDataCadastro(){
		return dataCadastro;
	}

//================	SETTERS	=============

	public final void setPlaca(String placa){
		this.placa = placa;
	}

	public final void setMarca(String marca){
		this.marca = marca;
	}

	public final void setModelo(String modelo){
		this.modelo = modelo;
	}

	public final void setCor(String cor){
		this.cor = cor;
	}
	
	public final void setQtdRodas(int qtdRodas){
		this.qtdRodas = qtdRodas;
	}

	public final void setMotor(Motor motor){
		this.motor = motor;
	}

	public final void setDataCadastro(String dataCadastro){
		this.dataCadastro = dataCadastro;
	}

}