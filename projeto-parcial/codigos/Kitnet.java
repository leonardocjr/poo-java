// Nome: Leonardo Canuto Junior - RA: 2453533

public class Kitnet extends Imovel implements Calculos{

	private boolean compartilhada;
	private int moradores;

// =======================================

// ============ CONSTRUTORES =============

	public Kitnet(){

		compartilhada = false;
		moradores = 0;

	}

// ============= SOBRECARGA ==============

	public Kitnet(boolean compartilhada, int moradores){

		this.compartilhada = compartilhada;
		this.moradores = moradores;

	}

	public Kitnet(Kitnet kn){

		super(kn);
		this.compartilhada = kn.compartilhada;
		this.moradores = kn.moradores;

	}

// =======================================

// ============= SOBRESCRITA =============

	public final double contAluguel(){

		double base = 350.0;
		base+=(getQuarto()*500.0);
		base+=(getBanheiro()*350.0);
		base+=(getArea()*15.0);
		if(getMobilia())
			base+=500.0;
		base = ((base/2)-(moradores*200));

		if(getLocal().getReg().getUf().equals("SP") || getLocal().getReg().getUf().equals("RJ") || getLocal().getReg().getUf().equals("BA") || getLocal().getReg().getUf().equals("DF") || getLocal().getReg().getUf().equals("RS") || getLocal().getReg().getUf().equals("SC")){
			base*=1.5;
		}else	if(getLocal().getReg().getUf().equals("MG") || getLocal().getReg().getUf().equals("ES") || getLocal().getReg().getUf().equals("MS") || getLocal().getReg().getUf().equals("GO") || getLocal().getReg().getUf().equals("SE") || getLocal().getReg().getUf().equals("PR") || getLocal().getReg().getUf().equals("CE") || getLocal().getReg().getUf().equals("PE") || getLocal().getReg().getUf().equals("AM") || getLocal().getReg().getUf().equals("AM") || getLocal().getReg().getUf().equals("AM")){
			base*=1.25;
		}else{
			base*=1;
		}
		return base+getContrato().getImposto(); // Valor mensal
		
	}

	public final double contCompra(){

		double base = 60000.0;
		base+=(getQuarto()*30000.0);
		base+=(getBanheiro()*20000.0);
		base+=(getArea()*1000.0);
		if(getMobilia())
			base+=12500.0;

		if(getLocal().getReg().getUf().equals("SP") || getLocal().getReg().getUf().equals("RJ") || getLocal().getReg().getUf().equals("BA") || getLocal().getReg().getUf().equals("DF") || getLocal().getReg().getUf().equals("RS") || getLocal().getReg().getUf().equals("SC")){
			base*=2.5;
		}else	if(getLocal().getReg().getUf().equals("MG") || getLocal().getReg().getUf().equals("ES") || getLocal().getReg().getUf().equals("MS") || getLocal().getReg().getUf().equals("GO") || getLocal().getReg().getUf().equals("SE") || getLocal().getReg().getUf().equals("PR") || getLocal().getReg().getUf().equals("CE") || getLocal().getReg().getUf().equals("PE") || getLocal().getReg().getUf().equals("AM") || getLocal().getReg().getUf().equals("AM") || getLocal().getReg().getUf().equals("AM")){
			base*=2;
		}else{
			base*=1.5;
		}
		return ((base/5)+getContrato().getImposto()); // impostos adicionados no valor de compra
		
	}

// =============== INTERFACE =============

	public final void calcComissao(){
		double valorCompra = getContrato().getCompra().getValor();
		double valorAluguel = getContrato().getAluguel().getValor();
		if(getContrato().getAluguel().getHabilitado())
			System.out.println("\t|-> A comissao por alugar: R$"+String.format("%.2f", (valorAluguel*0.05))+" (por mes de aluguel pago)"); // 5% ao me
		if(getContrato().getCompra().getHabilitado())
			System.out.println("\t|-> A comissao pela venda: R$"+String.format("%.2f", (valorCompra*0.01))); // 1% do total
	}

	public final void calcParcelar(int parcelas){

		double valor = getContrato().getCompra().getValor();
		System.out.println("\n\t|-> O valor total a vista: R$"+String.format("%.2f", valor));
		System.out.println("\t|-> O valor total parcelado: R$"+String.format("%.2f", (((valor/parcelas)*1.0114)*parcelas)));
		System.out.println("\t|-> O valor parcelado fica em R$"+ String.format("%.2f", ((valor/parcelas)*1.0114))+" de "+parcelas+" parcelas.");
	}

// ============ GETTERS ==================

	public boolean getCompartilhada(){
		return compartilhada;
	}

	public int getMoradores(){
		return moradores;
	}

// ============ SETTERS ==================

	public final void setCompartilhada(boolean compartilhada){
		this.compartilhada = compartilhada;
	}

	public final void setMoradores(int moradores) throws MoradoresPeqException, MoradoresGrdException{
		if(moradores > 0){
			if(moradores <= 3){
				this.moradores = moradores;
			}
			else{
				throw new MoradoresGrdException();
			}
		}
		else{
			throw new MoradoresPeqException();
		}
	}

}