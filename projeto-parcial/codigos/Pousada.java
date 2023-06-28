// Nome: Leonardo Canuto Junior - RA: 2453533

public class Pousada extends Imovel implements Calculos{

	private String lazer;
	private String horaCheckin;
	private Refeicoes ref;

// =======================================

// ============ CONSTRUTORES =============

	public Pousada(){

		lazer = "";
		horaCheckin = "";
		ref = new Refeicoes();

	}

// ============= SOBRECARGA ==============

	public Pousada(String lazer, String horaCheckin, Refeicoes ref){

		this.lazer = lazer;
		this.horaCheckin = horaCheckin;
		this.ref = ref;

	}

	public Pousada(Pousada pos){
		
		super(pos);
		this.lazer = pos.getLazer();
		this.horaCheckin = pos.getHoraCheckin();
		this.ref = pos.getRef();

	}

// =======================================

// =============== INTERFACE =============

	public final double contAluguel(){

		double base = 250.0;
		base+=(getQuarto()*350.0);
		base+=(getBanheiro()*250.0);
		base+=(getArea()*15.0);
		if(getMobilia())
			base+=350.0;
		base+=(getRef().getQtdRef()*350.0);

		if(getLocal().getReg().getUf().equals("SP") || getLocal().getReg().getUf().equals("RJ") || getLocal().getReg().getUf().equals("BA") || getLocal().getReg().getUf().equals("DF") || getLocal().getReg().getUf().equals("RS") || getLocal().getReg().getUf().equals("SC")){
			base*=2;
		}else	if(getLocal().getReg().getUf().equals("MG") || getLocal().getReg().getUf().equals("ES") || getLocal().getReg().getUf().equals("MS") || getLocal().getReg().getUf().equals("GO") || getLocal().getReg().getUf().equals("SE") || getLocal().getReg().getUf().equals("PR") || getLocal().getReg().getUf().equals("CE") || getLocal().getReg().getUf().equals("PE") || getLocal().getReg().getUf().equals("AM") || getLocal().getReg().getUf().equals("AM") || getLocal().getReg().getUf().equals("AM")){
			base*=1.5;
		}else{
			base*=1.25;
		}
		return (base/30)*2; // Valor diario
		
	}

	public final double contCompra(){

		double base = 50000.0;
		base+=(getQuarto()*25000.0);
		base+=(getBanheiro()*12500.0);
		base+=(getArea()*1000.0);
		if(getMobilia())
			base+=12500.0;

		if(getLocal().getReg().getUf().equals("SP") || getLocal().getReg().getUf().equals("RJ") || getLocal().getReg().getUf().equals("BA") || getLocal().getReg().getUf().equals("DF") || getLocal().getReg().getUf().equals("RS") || getLocal().getReg().getUf().equals("SC")){
			base*=3;
		}else	if(getLocal().getReg().getUf().equals("MG") || getLocal().getReg().getUf().equals("ES") || getLocal().getReg().getUf().equals("MS") || getLocal().getReg().getUf().equals("GO") || getLocal().getReg().getUf().equals("SE") || getLocal().getReg().getUf().equals("PR") || getLocal().getReg().getUf().equals("CE") || getLocal().getReg().getUf().equals("PE") || getLocal().getReg().getUf().equals("AM") || getLocal().getReg().getUf().equals("AM") || getLocal().getReg().getUf().equals("AM")){
			base*=2;
		}else{
			base*=1.5;
		}
		return (base+getContrato().getImposto()); // impostos adicionados no valor de compra
	}

// ============= SOBRESCRITA =============

	public final void calcComissao(){
		double valorCompra = getContrato().getCompra().getValor();
		double valorAluguel = getContrato().getAluguel().getValor();
		if(getContrato().getAluguel().getHabilitado())
			System.out.println("\t|-> A comissao por diaria: R$"+String.format("%.2f", (valorAluguel*0.03))+" (por diaria paga)"); // 3% ao dia
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

	public String getLazer(){
		return lazer;
	}

	public String getHoraCheckin(){
		return horaCheckin;
	}

	public Refeicoes getRef(){
		return ref;
	}

// ============ SETTERS ==================

	public final void setLazer(String lazer)throws LazerException{

		lazer = lazer.toUpperCase();
		if(lazer.equals("PRAIA") || lazer.equals("RESORT") || lazer.equals("FESTAS")){
			this.lazer = lazer;
		}else{
			throw new LazerException();
		}

	}

	public final void setHoraCheckin(String horaCheckin){
		this.horaCheckin = horaCheckin;
	}

	public final void setRef(Refeicoes ref){
		this.ref = ref;
	}

}