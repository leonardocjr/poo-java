// Nome: Leonardo Canuto Junior - RA: 2453533

public class Apartamento extends Imovel implements Calculos{

	private int andar;
	private boolean salaFesta;
	private boolean academia;

// =======================================

// ============ CONSTRUTORES =============

	public Apartamento(){

		andar = 0;
		salaFesta = false;
		academia = false;

	}

// ============= SOBRECARGA ==============

	public Apartamento(int andar, boolean salaFesta, boolean academia){

		this.andar = andar;
		this.salaFesta = salaFesta;
		this.academia = academia;

	}

	public Apartamento(Apartamento apto){

		super(apto);
		this.andar = apto.getAndar();
		this.salaFesta = apto.getSalaFesta();
		this.academia = apto.getAcademia();

	}

// =======================================

// ============= SOBRESCRITA =============

	public final double contAluguel(){

		double base = 250.0;
		base+=(getQuarto()*350.0);
		base+=(getBanheiro()*250.0);
		base+=(getArea()*15.0);
		if(getMobilia())
			base+=250.0;
		if(getAcademia())
			base+=100.0;

		if(getLocal().getReg().getUf().equals("SP") || getLocal().getReg().getUf().equals("RJ") || getLocal().getReg().getUf().equals("BA") || getLocal().getReg().getUf().equals("DF") || getLocal().getReg().getUf().equals("RS") || getLocal().getReg().getUf().equals("SC")){
			base*=1.5;
		}else	if(getLocal().getReg().getUf().equals("MG") || getLocal().getReg().getUf().equals("ES") || getLocal().getReg().getUf().equals("MS") || getLocal().getReg().getUf().equals("GO") || getLocal().getReg().getUf().equals("SE") || getLocal().getReg().getUf().equals("PR") || getLocal().getReg().getUf().equals("CE") || getLocal().getReg().getUf().equals("PE") || getLocal().getReg().getUf().equals("AM") || getLocal().getReg().getUf().equals("AM") || getLocal().getReg().getUf().equals("AM")){
			base*=1.25;
		}else{
			base*=1;
		}
		return base+getContrato().getImposto();
		
	}

	public final double contCompra(){

		double base = 50000.0;
		base+=(getQuarto()*25000.0);
		base+=(getBanheiro()*12500.0);
		base+=(getArea()*1000.0);
		if(getMobilia())
			base+=10000.0;
		if(getAcademia())
			base+=2500.0;

		if(getLocal().getReg().getUf().equals("SP") || getLocal().getReg().getUf().equals("RJ") || getLocal().getReg().getUf().equals("BA") || getLocal().getReg().getUf().equals("DF") || getLocal().getReg().getUf().equals("RS") || getLocal().getReg().getUf().equals("SC")){
			base*=2.5;
		}else	if(getLocal().getReg().getUf().equals("MG") || getLocal().getReg().getUf().equals("ES") || getLocal().getReg().getUf().equals("MS") || getLocal().getReg().getUf().equals("GO") || getLocal().getReg().getUf().equals("SE") || getLocal().getReg().getUf().equals("PR") || getLocal().getReg().getUf().equals("CE") || getLocal().getReg().getUf().equals("PE") || getLocal().getReg().getUf().equals("AM") || getLocal().getReg().getUf().equals("AM") || getLocal().getReg().getUf().equals("AM")){
			base*=2;
		}else{
			base*=1.5;
		}
		return (base+getContrato().getImposto()); // impostos adicionados no valor de compra
	}

// =============== INTERFACE =============

	public final void calcComissao(){
		double valorCompra = getContrato().getCompra().getValor();
		double valorAluguel = getContrato().getAluguel().getValor();
		if(getContrato().getAluguel().getHabilitado())
			System.out.println("\t|-> A comissao por alugar: R$"+String.format("%.2f", (valorAluguel*0.05))+" (por mes de aluguel pago)"); // 5% ao mes
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

	public int getAndar(){
		return andar;
	}

	public boolean getSalaFesta(){
		return salaFesta;
	}

	public boolean getAcademia(){
		return academia;
	}

// ============ SETTERS ==================

	public final void setAndar(int andar) throws NegativoException{
		if(andar > 0)
			this.andar = andar;
		else
			throw new NegativoException();
	}

	public final void setSalaFesta(boolean salaFesta){
		this.salaFesta = salaFesta;
	}

	public final void setAcademia(boolean academia){
		this.academia = academia;
	}

}